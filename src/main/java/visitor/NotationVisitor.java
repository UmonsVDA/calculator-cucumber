package visitor;


import calculator.Operation;

public interface NotationVisitor {
    String visit(Operation operation);




}
