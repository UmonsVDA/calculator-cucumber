package calculator;

import visitor.TimeVisitor;

import java.math.BigDecimal;
import java.util.List;

/**
 * This class represents the arithmetic operation Power ("^").
 */
public class Power extends Operation {
    public Power(List<Expression> elist) throws IllegalConstruction {
        super(elist);
    }

    public Power(List<Expression> elist, Notation n) throws IllegalConstruction {
        super(elist, n);
        symbol = "^";
    }

    /**
     * The actual computation of the (binary) arithmetic power of two integers
     * @param l	 first argument of the binary operation
     * @param r	second argument of the binary operation
     * @return the result of the power operation
     */
    @Override
    public int op(int l, int r) {
        return (int) Utils.pow(l, r);
    }

    /**
     * The actual computation of the (binary) arithmetic power of two MyTime objects
     * @param l	 first argument of the binary operation
     * @param r	second argument of the binary operation
     * @throws UnsupportedOperationException always thrown as power is not defined for MyTime objects
     * */
    @Override
    public MyTime op(MyTime l, MyTime r) {
        throw new UnsupportedOperationException();
    }

    /**
     * The actual computation of the (binary) arithmetic power of a MyTime and a MyRealNumber objects
     * @param l	 first argument of the binary operation
     * @param seconds	second argument of the binary operation
     * @throws UnsupportedOperationException always thrown as power is not defined for MyTime and MyRealNumber
     * */
    @Override
    public MyTime op(MyTime l, MyRealNumber seconds) {
        throw new UnsupportedOperationException();
    }

    /**
     * The actual computation of the (binary) arithmetic power of two real numbers
     * @param l	 first argument of the binary operation
     * @param r	second argument of the binary operation
     * @throws UnsupportedOperationException always thrown as power is not defined for real numbers
     */
    @Override
    public BigDecimal op(BigDecimal l, BigDecimal r) {
        throw new UnsupportedOperationException();
    }

    /**
     * The actual computation of the (binary) arithmetic power of two rational numbers
     * @param l	 first argument of the binary operation
     * @param r	second argument of the binary operation
     * @throws UnsupportedOperationException always thrown as power is not defined for rational numbers
     */
    @Override
    public MyRationalNumber op(MyRationalNumber l, MyRationalNumber r) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void accept(TimeVisitor v) {
        throw new UnsupportedOperationException();
    }
}
