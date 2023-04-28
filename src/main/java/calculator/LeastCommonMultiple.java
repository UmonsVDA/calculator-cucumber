package calculator;

import java.util.List;

public class LeastCommonMultiple extends Operation {

    public LeastCommonMultiple(List<Expression> elist) throws IllegalConstruction {
        super(elist);
    }

    public LeastCommonMultiple(List<Expression> elist, Notation n) throws IllegalConstruction {
        super(elist, n);
        symbol = "LCM";
    }

    @Override
    public int op(int l, int r) {
        return (int) ((l * r) / Utils.gcd((long) l, (long) r));
    }
}
