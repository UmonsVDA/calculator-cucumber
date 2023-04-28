package visitor;


import calculator.Operation;

/** This interface is used to implement the Visitor pattern for Displayer. */

public interface NotationVisitor {
    String visit(Operation operation);




}
