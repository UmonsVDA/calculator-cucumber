package calculator;

import visitor.TimeVisitor;

import java.math.BigDecimal;
import java.util.List;

public class Power extends Operation{
    public Power(List<Expression> elist) throws IllegalConstruction {
        super(elist);
    }

    public Power(List<Expression> elist, Notation n) throws IllegalConstruction {
        super(elist, n);
        symbol = "^";
    }

    @Override
    public int op(int l, int r) {
        return (int) Utils.pow(l,r);
    }

    @Override
    public MyTime op(MyTime l, MyTime r) {
        throw new UnsupportedOperationException();
    }

    @Override
    public MyTime op(MyTime l, MyRealNumber seconds) {
        throw new UnsupportedOperationException();
    }

    @Override
    public BigDecimal op(BigDecimal l, BigDecimal r) {
        throw new UnsupportedOperationException();
    }

    @Override
    public MyRationalNumber op(MyRationalNumber l, MyRationalNumber r) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void accept(TimeVisitor v) {
        throw new UnsupportedOperationException();
    }
}
