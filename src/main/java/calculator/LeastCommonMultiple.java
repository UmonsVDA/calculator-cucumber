package calculator;

import java.math.BigDecimal;
import java.util.List;

public class LeastCommonMultiple extends BinaryOperation {
    public LeastCommonMultiple(List<Expression> elist) throws UnsupportedOperationException, IllegalConstruction {
        super(elist);
    }

    public LeastCommonMultiple(List<Expression> elist, Notation n) throws UnsupportedOperationException, IllegalConstruction {
        super(elist, n);
        symbol = "LCM";
    }

    @Override
    public int op(int l, int r) {
        return (int) ((l * r) / Utils.gcd((long) l, (long) r));
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
