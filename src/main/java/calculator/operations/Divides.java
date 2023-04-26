package calculator.operations;

import calculator.Expression;
import calculator.IllegalOperationException;
import calculator.MyRationalNumber;
import calculator.Notation;

import java.math.BigDecimal;
import java.util.List;

/**
 * This class represents the arithmetic division operation "/".
 * The class extends an abstract superclass Operation.
 * Other subclasses of Operation represent other arithmetic operations.
 *
 * @see Operation
 * @see Minus
 * @see Times
 * @see Plus
 */
public final class Divides extends Operation {

    /**
     * Class constructor specifying a number of Expressions to divide.
     *
     * @param elist The list of Expressions to divide
     * @throws IllegalOperationException If an empty list of expressions if passed as parameter
     * @see #Divides(List< Expression >, Notation )
     */
    public /*constructor*/ Divides(List<Expression> elist) throws IllegalOperationException {
        this(elist, null);
    }

    /**
     * Class constructor specifying a number of Expressions to divide,
     * as well as the notation used to represent the operation.
     *
     * @param elist The list of Expressions to divide
     * @param n     The Notation to be used to represent the operation
     * @throws IllegalOperationException If an empty list of expressions if passed as parameter
     * @see #Divides(List<Expression>)
     * @see Operation#Operation(List<Expression>,Notation)
     */
    public Divides(List<Expression> elist, Notation n) throws IllegalOperationException {
        super(elist, n);
        symbol = "/";
        neutral = 1;
    }

    /**
     * The actual computation of the (binary) arithmetic division of two integers
     *
     * @param l The first integer
     * @param r The second integer that should divide the first
     * @return The integer that is the result of the division
     */
    public int op(int l, int r) throws IllegalOperationException {
        if (r == 0) throw new IllegalOperationException();
        return (l / r);
    }


    /**
     * The actual computation of the (binary) arithmetic division of two real numbers
     *
     * @param l first argument of the binary operation
     * @param r second argument of the binary operation
     * @return The real number that is the result of the division
     */
    @Override
    public BigDecimal op(BigDecimal l, BigDecimal r) throws IllegalOperationException {
        if (BigDecimal.ZERO.compareTo(r) == 0) throw new IllegalOperationException();
        return l.divide(r, mathContext);
    }

    /**
     * The actual computation of the (binary) arithmetic division of two rational numbers
     *
     * @param l The first rational number
     * @param r The second rational number that should divide the first
     * @return The rational number that is the result of the division
     */
    @Override
    public MyRationalNumber op(MyRationalNumber l, MyRationalNumber r) throws IllegalOperationException {
        if (r.isZero()) throw new IllegalOperationException();
        return l.divide(r);
    }
}
