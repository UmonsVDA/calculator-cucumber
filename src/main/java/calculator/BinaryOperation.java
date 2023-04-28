package calculator;

import visitor.Visitor;

import java.util.List;

public abstract class BinaryOperation extends Operation{
    protected BinaryOperation(List<Expression> elist) throws UnsupportedOperationException, IllegalConstruction, IllegalOperationException {
        super(elist);
    }

    protected BinaryOperation(List<Expression> elist, Notation n) throws UnsupportedOperationException, IllegalConstruction, IllegalOperationException {
        super(elist, n);
    }

    @Override
    public void accept(Visitor v) throws UnsupportedOperationException {
        if (args.size() != 2) {
            throw new UnsupportedOperationException();
        }
        super.accept(v);
    }
}
