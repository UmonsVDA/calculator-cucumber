package calculator;

import java.math.BigDecimal;
import java.util.List;

/**
 * This class represents the arithmetic operation "-".
 * The class extends an abstract superclass Operation.
 * Other subclasses of Operation represent other arithmetic operations.
 *
 * @see Operation
 * @see Plus
 * @see Times
 * @see Divides
 */

public final class Minus extends Operation {

    /**
     * Class constructor specifying a number of Expressions to subtract.
     *
     * @param elist The list of Expressions to subtract
     * @throws IllegalOperationException If an empty list of expressions if passed as parameter
     * @see #Minus(List< Expression >, Notation )
     */
    public /*constructor*/ Minus(List<Expression> elist) throws IllegalOperationException, IllegalConstruction {
        this(elist, null);
    }

    /**
     * Class constructor specifying a number of Expressions to subtract,
     * as well as the Notation used to represent the operation.
     *
     * @param elist The list of Expressions to subtract
     * @param n     The Notation to be used to represent the operation
     * @throws IllegalOperationException If an empty list of expressions if passed as parameter
     * @see #Minus(List<Expression>)
     * @see Operation#Operation(List<Expression>,Notation)
     */
    public Minus(List<Expression> elist, Notation n) throws IllegalOperationException, IllegalConstruction {
        super(elist, n);
        symbol = "-";
        neutral = 0;
    }

    /**
     * The actual computation of the (binary) arithmetic subtraction of two integers
     *
     * @param l The first integer
     * @param r The second integer that should be subtracted from the first
     * @return The integer that is the result of the subtraction
     */
    public int op(int l, int r) {
        return (l-r);
    }

    /**
     * The actual computation of the (binary) arithmetic subtraction of two real numbers
     * @param l first argument of the binary operation
     * @param r second argument of the binary operation
     * @return The real number that is the result of the subtraction
     */
    @Override
    public BigDecimal op(BigDecimal l, BigDecimal r) {
        return l.subtract(r,mathContext);
    }

    /**
     * The actual computation of the (binary) arithmetic subtraction of two rational numbers
     * @param l	 The first rational number
     * @param r     The second rational number that should be subtracted from the first
     * @return The rational number resulting from the subtraction
     */
    @Override
    public MyRationalNumber op(MyRationalNumber l, MyRationalNumber r) {
        return l.subtract(r);
    }
}
