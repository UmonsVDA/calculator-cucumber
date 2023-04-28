package calculator;

import visitor.TimeVisitor;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.List;

/**
 * This class represents the arithmetic division operation "/".
 * The class extends an abstract superclass Operation.
 * Other subclasses of Operation represent other arithmetic operations.
 *
 * @see Operation
 * @see Minus
 * @see Times
 * @see Plus
 */
public final class Divides extends Operation {

  /**
   * Class constructor specifying a number of Expressions to divide.
   *
   * @param elist The list of Expressions to divide
   * @throws IllegalConstruction If an empty list of expressions if passed as parameter
   * @see #Divides(List<Expression>,Notation)
   */
  public /*constructor*/ Divides(List<Expression> elist) throws IllegalConstruction {
    this(elist, null);
  }

  /**
   * Class constructor specifying a number of Expressions to divide,
   * as well as the notation used to represent the operation.
   *
   * @param elist The list of Expressions to divide
   * @param n     The Notation to be used to represent the operation
   * @throws IllegalConstruction If an empty list of expressions if passed as parameter
   * @see #Divides(List<Expression>)
   * @see Operation#Operation(List<Expression>,Notation)
   */
  public Divides(List<Expression> elist, Notation n) throws IllegalConstruction {
    super(elist, n);
    symbol = "/";
    neutral = 1;
  }

    /**
     * The actual computation of the (binary) arithmetic division of two integers
     * @param l The first integer
     * @param r The second integer that should divide the first
     * @return The integer that is the result of the division
     */
  public int op(int l, int r) throws ArithmeticException
    { if(r==0) throw new ArithmeticException("Division by zero");
      return (l/r); }

  /**
   * The actual computation of the (binary) arithmetic division of two MyTime objects. This is not allowed.
   * @param l The first MyTime object
   * @param r The second MyTime object that should divide the first
   * @throws RuntimeException Always, since this operation is not allowed
   */
  @Override
  public MyTime op(MyTime l, MyTime r) {
    throw new RuntimeException("Sorry, you can't divide two dates.");
  }

    /**
     * The actual computation of the (binary) arithmetic division of a MyTime object and a MyRealNumber object. This is not allowed.
     * @param l The MyTime object
     * @param seconds The MyRealNumber object that should divide the MyTime object
     * @throws RuntimeException Always, since this operation is not allowed
     */
  @Override
  public MyTime op(MyTime l, MyRealNumber seconds) {
    throw new RuntimeException("Sorry, you can't divide a date and a number");
  }


    /**
     * The actual computation of the (binary) arithmetic division of two real numbers
     *
     * @param l first argument of the binary operation
     * @param r second argument of the binary operation
     * @return The real number that is the result of the division
     */
    @Override
    public BigDecimal op(BigDecimal l, BigDecimal r)  throws ArithmeticException{
        if (r.compareTo(BigDecimal.ZERO) == 0){
          throw new ArithmeticException("Division by zero");
        }
        else{
          try{
            return l.divide(r, mathContext);
          }catch (ArithmeticException exception){
            return l.divide(r, MathContext.DECIMAL128);
          }
        }
    }
    
    /**
     * The actual computation of the (binary) arithmetic division of two rational numbers
     * @param l The first rational number
     * @param r The second rational number that should divide the first
     * @return The rational number that is the result of the division
     */
    @Override
    public MyRationalNumber op(MyRationalNumber l, MyRationalNumber r) throws ArithmeticException{
        return l.divide(r);

    }

  /**
   * A method to accept a TimeVisitor
   * @param v The TimeVisitor to accept
   */
  @Override
    public void accept(TimeVisitor v) {}

}
