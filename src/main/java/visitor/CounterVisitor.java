package visitor;

import calculator.Expression;

/**
 * This interface is used to implement the Visitor pattern for Counter.
 */

public interface CounterVisitor {

    void visit(Expression expression);
}
