package calculator.operations;

import calculator.*;

import java.math.BigDecimal;
import java.util.List;

public class GreatestCommonDivisor extends BinaryOperation {
    public GreatestCommonDivisor(List<Expression> elist) throws IllegalOperationException {
        super(elist);
    }

    public GreatestCommonDivisor(List<Expression> elist, Notation n) throws IllegalOperationException {
        super(elist, n);
        symbol = "GCD";
    }


    @Override
    public int op(int l, int r) {
        return Math.toIntExact(Utils.gcd((long) l, (long) r));
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
