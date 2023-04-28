package calculator;

import visitor.Visitor;

import java.util.List;

public abstract class BinaryOperation extends Operation{
    protected BinaryOperation(List<Expression> elist) throws IllegalOperationException {
        super(elist);
    }

    protected BinaryOperation(List<Expression> elist, Notation n) throws IllegalOperationException {
        super(elist, n);
    }

    @Override
    public void accept(Visitor v) throws IllegalOperationException {
        if (args.size() != 2) {
            throw new IllegalOperationException();
        }
        super.accept(v);
    }
}
