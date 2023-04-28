package visitor;

import calculator.Notation;
import calculator.Operation;

import java.util.stream.Stream;

/**
 * This class is used to display the expression in the different notations. It uses the Visitor pattern.
 */
public class Displayer implements NotationVisitor {

    private Notation notation;

    private static Displayer instance = null;

    private boolean calledFromToString = false;

    private Displayer(Notation notation) {
        this.notation = notation;
    }

    private Displayer(){

    }

    private Displayer(boolean calledFromToString){
        this.calledFromToString = calledFromToString;
    }

    /**
     * This method is used to delete the unique instance of the Displayer. It's necessary to change the notation from one Expression to another.
     */
    public static void deleteDisplayer() {
        instance = null;
    }

    /**
     * This method is used to display the expression in the different notations.
     *
     * @param operation The operation to display.
     * @return The expression in the different notations.
     */
    @Override
    public String visit(Operation operation) {
        notation = calledFromToString ? operation.notation : (notation == null ? operation.notation : notation);

        Stream<String> s = operation.args.stream().map(Object::toString);
        return switch (notation) {
            case INFIX -> "( " +
                    s.reduce((s1, s2) -> s1 + " " + operation.getSymbol() + " " + s2).orElse(null) +
                    " )";
            case PREFIX -> operation.getSymbol() + " " +
                    "(" +
                    s.reduce((s1, s2) -> s1 + ", " + s2).orElse(null) +
                    ")";
            case POSTFIX -> "(" +
                    s.reduce((s1, s2) -> s1 + ", " + s2).orElse(null) +
                    ")" +
                    " " + operation.getSymbol();

        };
    }

    /**
     * This method is used to create the unique instance of the Displayer.
     *
     * @param notation The notation to use.
     * @return The unique instance of the Displayer.
     */
    public static Displayer createDisplayer(Notation notation){
        instance = new Displayer(notation);
        return instance;
    }

    /**
     * This method is used to create the unique instance of the Displayer.
     *
     * @return The unique instance of the Displayer.
     */
    public static Displayer createDisplayer(){
        instance = new Displayer();
        return instance;
    }

    /**
     * This method is used to create the unique instance of the Displayer. This time, the notation will change in a same Expression, at different depths.
     *
     * @param calledFromToString A boolean to know if the Displayer is called from the toString method.
     * @return The unique instance of the Displayer.
     */
    public static Displayer createDisplayer(boolean calledFromToString){
        instance = new Displayer(calledFromToString);
        return instance;
    }

    /**
     * This method is used to get the unique instance of the Displayer.
     *
     * @return The unique instance of the Displayer.
     */
    public static Displayer getInstance(){
        return instance;
    }
}
