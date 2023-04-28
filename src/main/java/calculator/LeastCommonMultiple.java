package calculator;

import java.util.List;

/**
 * This class represents the Least Common Multiple operation (LCM)
 *
 */
 
public class LeastCommonMultiple extends BinaryOperation {
    public LeastCommonMultiple(List<Expression> elist) throws UnsupportedOperationException, IllegalConstruction, IllegalOperationException {
        super(elist);
    }

    public LeastCommonMultiple(List<Expression> elist, Notation n) throws UnsupportedOperationException, IllegalConstruction, IllegalOperationException {
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

}
