package calculator;

import visitor.Counter;
import visitor.Displayer;
import visitor.TimeVisitor;
import visitor.Visitor;

/**
 * Expression is an abstract class that represents arithmetic expressions.
 * It has two concrete subclasses Operation and MyNumber.
 *
 * @see Operation
 * @see MyNumber
 */
public interface Expression {

   /**
    * accept is a method needed to implement the visitor design pattern
    *
    * @param v The visitor object being passed as a parameter
    */
   void accept(Visitor v) throws ArithmeticException;

    /**
     * This method prints the operation with a single notation
     * @return The string representation of the operation, in a single notation
     */
    default String printOperation() {
        String result = accept(Displayer.createDisplayer());
        Displayer.deleteDisplayer();
        return result;
    }

    /**
     * This method prints the operation with a single notation
     * @param notation The notation to be used to print the operation
     * @return The string representation of the operation, in the specified notation
     */
    default String printOperation(Notation notation) {
        String result = accept(Displayer.createDisplayer(notation));
        Displayer.deleteDisplayer();
        return result;
    }

    /**
     * This method let the visitor visit the operation to display it
     * @param displayer The visitor which can correctly display the operation
     * @return The string representation of the operation, in the specified notation
     */
    default String accept(Displayer displayer) {
        try {
            return displayer.visit((Operation) this);
        } catch (ClassCastException e) {
            return "";
        }
    }

    /**
     * This method let the visitor visit the operation to count some elements
     * @param counter The visitor which can correctly count
     */
    default void accept(Counter counter) {
        counter.visit(this);
    }

    
    void accept(TimeVisitor v);
}




