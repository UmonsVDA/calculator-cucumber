package calculator.operations;

import calculator.*;

import java.math.BigDecimal;
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

    @Override
    public BigDecimal op(BigDecimal l, BigDecimal r) {
        throw new UnsupportedOperationException();
    }

    @Override
    public MyRationalNumber op(MyRationalNumber l, MyRationalNumber r) {
        throw new UnsupportedOperationException();
    }
}
