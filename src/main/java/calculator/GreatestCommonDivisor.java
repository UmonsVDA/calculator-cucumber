package calculator;

import java.util.List;

/**
 * This class represents the Greatest Common Divisor operation (GCD)
 *
 */
public class GreatestCommonDivisor extends Operation {

    public GreatestCommonDivisor(List<Expression> elist) throws IllegalConstruction, IllegalOperationException {
        super(elist);
    }

    public GreatestCommonDivisor(List<Expression> elist, Notation n) throws IllegalConstruction, IllegalOperationException {
        super(elist, n);
        symbol = "GCD";
    }

    /**
     * The actual computation of the (binary) GCD of two integers
     * @param l	 first argument of the binary operation
     * @param r	second argument of the binary operation
     * @return The GCD of the two integers
     */
    @Override
    public int op(int l, int r) {
        return Math.toIntExact(Utils.gcd((long) l, (long) r));
    }

}
