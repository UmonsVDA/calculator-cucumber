package calculator;

import java.util.List;

public class Power extends BinaryOperation {
    public Power(List<Expression> elist) throws IllegalOperationException {
        super(elist);
    }

    public Power(List<Expression> elist, Notation n) throws IllegalOperationException {
        super(elist, n);
        symbol = "^";
    }

    @Override
    public int op(int l, int r) {
        return (int) Utils.pow(l, r);
    }
}
