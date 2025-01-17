package calculator;

import parser.MyParser;
import visitor.Evaluator;
import visitor.RationalNumberEvaluator;
import visitor.RealNumberEvaluator;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 * This class represents the core logic of a Calculator.
 * It can be used to print and evaluate arithmetic expressions.
 *
 * @author tommens
 */
public class Calculator {

    /** Number of digit to be encoded for real numbers */
    private int precision;
    /** MathContext for real numbers */
    private MathContext mathContext = MathContext.UNLIMITED;
    /** Rounding method for operation on real numbers */
    private RoundingMode roundingMode = RoundingMode.HALF_UP;

    /** Current type on which expression will be evaluated */
    private ArithmeticType currentType;

    /**
     * Convert an input string into an arithmetic expression
     *
     * @param s a string representing an arithmetic expression
     * @return the result of the conversion
     */
    public Expression read(String s) {
        return MyParser.parse(s, mathContext);
    }


    /**
     * Evaluates an arithmetic expression and returns its result
     *
     * @param e the arithmetic Expression to be evaluated
     * @return The result of the evaluation
     */
    public int eval(Expression e) throws ArithmeticException{
        // create a new visitor to evaluate expressions
        Evaluator v = new Evaluator();
        // and ask the expression to accept this visitor to start the evaluation process
        e.accept(v);
        // and return the result of the evaluation at the end of the process
        return v.getResult();
    }

    /**
     * Evaluates an arithmetic expression and returns its result
     *
     * @param e the arithmetic Expression to be evaluated
     * @return The result of the evaluation
     */
    public BigDecimal evalReal(Expression e) throws ArithmeticException, UnsupportedOperationException{
        // create a new visitor to evaluate expressions
        RealNumberEvaluator v = new RealNumberEvaluator();
        // and ask the expression to accept this visitor to start the evaluation process
        e.accept(v);
        // and return the result of the evaluation at the end of the process
        return v.getResult();
    }

    /**
     * Evaluates an arithmetic expression and returns its result as a rational number
     *
     * @param e the arithmetic Expression to be evaluated
     * @return The result of the evaluation as a rational number
     */
    public MyRationalNumber evalRational(Expression e) throws ArithmeticException, UnsupportedOperationException{
        RationalNumberEvaluator v = new RationalNumberEvaluator();
        e.accept(v);
        return v.getResult();
    }


    /**
     * Set the precision of real number (the number of digits encoded)
     *
     * @param p A positive integer representing the precision of the real numbers
     */
    public void setPrecision(int p) {
        if (p >= 0) {
            precision = p;
            mathContext = new MathContext(precision, roundingMode);
        }
    }


    /**
     * Set the rounding mode of real numbers
     *
     * @param rd the rounding mode to be considered
     */
    public void setRoundingMode(RoundingMode rd) {
        roundingMode = rd;
        mathContext = new MathContext(precision, roundingMode);
    }


    public MathContext getMathContext(){
        return mathContext;
    }

    public void setType(ArithmeticType type) {
        currentType = type;
    }

    /**
     * This method return the result of an expression as a string
     * @param expr the expression to be evaluated
     * @return the result of the evaluation as a string
     */
    public String evalExpression(String expr){
        Expression e = read(expr);
        if(currentType != null){
            switch (currentType){
                case  INTEGER -> {
                    try {
                        return Integer.toString(eval(e));
                    } catch (ArithmeticException ex) {
                        return "NaN";
                    }
                }
                case  REAL -> {
                    try {
                        return evalReal(e).toString();
                    } catch (ArithmeticException ex) {
                        return "NaN";
                    }
                    catch (UnsupportedOperationException ex){
                        return "Unsupported operation";
                    }
                }
                case RATIONAL -> {
                    try{
                        return evalRational(e).toString();
                    } catch (ArithmeticException ex) {
                        return "NaN";
                    }
                    catch (UnsupportedOperationException ex){
                        return "Unsupported operation";
                    }
                }
            }
        }

        return "Error";


    }

}
