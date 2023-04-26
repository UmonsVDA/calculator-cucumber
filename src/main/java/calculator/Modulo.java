package calculator;

import java.math.BigDecimal;
import java.util.List;

public class Modulo extends Operation{
    public Modulo(List<Expression> elist) throws IllegalConstruction {
        super(elist);
    }

    public Modulo(List<Expression> elist, Notation n) throws IllegalConstruction {
        super(elist, n);
        symbol = "%";
    }

    @Override
    public int op(int l, int r) {
        return l % r;
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