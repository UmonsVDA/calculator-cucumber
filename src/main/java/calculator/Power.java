package calculator;

import java.util.List;

public class Power extends Operation {
    public Power(List<Expression> elist) throws IllegalConstruction {
        super(elist);
    }

    public Power(List<Expression> elist, Notation n) throws IllegalConstruction {
        super(elist, n);
        symbol = "^";
    }

    @Override
    public int op(int l, int r) {
        return (int) Utils.pow(l, r);
    }
}
