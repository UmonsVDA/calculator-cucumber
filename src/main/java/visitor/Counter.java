package visitor;

import calculator.Expression;
import calculator.Operation;

/**
 * This class is used to count the number of operations, numbers and the depth of the expression tree. It uses the Visitor pattern.
 */
public class Counter implements CounterVisitor{

    private int countDepth=0, countOps=0, countNbs=0;
    @Override
    public void visit(Expression expression) {
        visit(expression, 0);

    }

    /**
     * This method is used to visit the expression tree and count the number of operations, numbers and the depth of the expression tree.
     *
     * @param expression The expression to visit.
     * @param currentDepth The current depth of the expression tree.
     */

    private void visit(Expression expression, int currentDepth){
        if (expression instanceof Operation) {
            for (Expression e : ((Operation) expression).getArgs()) {
                visit(e, currentDepth+1);
            }
            updateCounters(currentDepth+1, 1, 0);


        } else {
            updateCounters(currentDepth, 0, 1);
        }

    }

    /**
     * This method is used to update the counters.
     *
     * @param depth The depth of the expression tree.
     * @param ops The number of operations.
     * @param nbs The number of numbers.
     */
    private void updateCounters(int depth, int ops, int nbs) {
        if (depth > countDepth) {
            countDepth = depth;
        }
        countOps += ops;
        countNbs += nbs;
    }

    public int getCountDepth() {
        return countDepth;
    }

    public int getCountOps() {
        return countOps;
    }

    public int getCountNbs() {
        return countNbs;
    }
}
