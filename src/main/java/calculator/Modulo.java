package calculator;

import java.util.List;

public class Modulo extends BinaryOperation {
    public Modulo(List<Expression> elist) throws IllegalOperationException {
        super(elist);
    }

    public Modulo(List<Expression> elist, Notation n) throws IllegalOperationException {
        super(elist, n);
        symbol = "%";
    }

    @Override
    public int op(int l, int r) {
        return l % r;
    }
}
