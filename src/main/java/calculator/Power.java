package calculator;

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

}
