package calculator;

import visitor.TimeVisitor;

import java.math.BigDecimal;
import java.util.List;

/**
 * This class represents the Least Common Multiple operation (LCM)
 *
 */
public class LeastCommonMultiple extends Operation {
    public LeastCommonMultiple(List<Expression> elist) throws IllegalConstruction {
        super(elist);
    }

    public LeastCommonMultiple(List<Expression> elist, Notation n) throws IllegalConstruction {
        super(elist, n);
        symbol = "LCM";
    }

    /**
     * The actual computation of the (binary) LCM of two integers
     * @param l	 first argument of the binary operation
     * @param r	second argument of the binary operation
     * @return The LCM of the two integers
     */
    @Override
    public int op(int l, int r) {
        return (int) ((l * r) / Utils.gcd((long) l, (long) r));
    }

    /**
     * The actual computation of the (binary) LCM of two MyTime objects. This is not allowed.
     * @param l	 first argument of the binary operation
     * @param r	second argument of the binary operation
     * @throws UnsupportedOperationException always thrown since this operation is not allowed
     */
    @Override
    public MyTime op(MyTime l, MyTime r) {
        throw new UnsupportedOperationException();
    }

    /**
     * The actual computation of the (binary) LCM of a MyTime and a MyRealNumber objects. This is not allowed.
     * @param l	 first argument of the binary operation
     * @param seconds second argument of the binary operation
     * @throws UnsupportedOperationException always thrown since this operation is not allowed
     */
    @Override
    public MyTime op(MyTime l, MyRealNumber seconds) {
        throw new UnsupportedOperationException();
    }

    /**
     * The actual computation of the (binary) LCM of two real numbers
     * @param l	 first argument of the binary operation
     * @param r	second argument of the binary operation
     * @throws UnsupportedOperationException always thrown since this operation is not allowed
     */
    @Override
    public BigDecimal op(BigDecimal l, BigDecimal r) {
        throw new UnsupportedOperationException();
    }

    /**
     * The actual computation of the (binary) LCM of two rational numbers
     * @param l	 first argument of the binary operation
     * @param r	second argument of the binary operation
     * @throws UnsupportedOperationException always thrown since this operation is not allowed
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
