package calculator;

import java.util.List;

/**
 * This class represents the arithmetic operation Modulo ("%").
 */
public class Modulo extends Operation {
    public Modulo(List<Expression> elist) throws IllegalConstruction, IllegalOperationException {
        super(elist);
    }

    public Modulo(List<Expression> elist, Notation n) throws IllegalConstruction, IllegalOperationException {
        super(elist, n);
        symbol = "%";
    }

    /**
     * The actual computation of the (binary) arithmetic modulo of two integers
     * @param l	 first argument of the binary operation
     * @param r	second argument of the binary operation
     * @return the result of the modulo operation
     */
    @Override
    public int op(int l, int r) {
        return l % r;
    }

}
