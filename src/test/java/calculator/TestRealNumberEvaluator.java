package calculator;

//Import Junit5 libraries for unit testing:

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TestRealNumberEvaluator {

    private Calculator calc;


    private MyRealNumber number, simpleNumber, simpleNumber2;


    @BeforeEach
    void setup(){
        String value1 = "0.0000000314159";
        number = new MyRealNumber(value1);
        String simpleValue1 = "0.5";
        simpleNumber = new MyRealNumber(simpleValue1);
        String simpleValue2 = "5.0";
        simpleNumber2 = new MyRealNumber(simpleValue2);
        calc = new Calculator();

    }

    @ParameterizedTest
    @ValueSource(strings = {"*", "+", "/", "-"})
    void testEvaluateRealOperations(String symbol) throws IllegalOperationException {
        List<Expression> params = Arrays.asList(simpleNumber, simpleNumber2);
        try {
            //construct another type of operation depending on the input value
            //of the parameterised test
            switch (symbol) {
                case "+"	->	assertEquals( new MyRealNumber("5.5").getRealNumber(), calc.evalReal(new Plus(params)));
                case "-"	->	assertEquals( new MyRealNumber("-4.5").getRealNumber(), calc.evalReal(new Minus(params)));
                case "*"    ->	assertEquals( new MyRealNumber("2.50").getRealNumber(), calc.evalReal(new Times(params)));
                case "/"	->	assertEquals( new MyRealNumber("0.1").getRealNumber(), calc.evalReal(new Divides(params)));
                default		->	fail();
            }
        } catch (IllegalConstruction e) {
            fail();
        }
    }



    @ParameterizedTest
    @ValueSource(strings = {"*", "+", "/", "-"})
    void testEvaluateRealOperationsImplyingZero(String symbol) throws IllegalOperationException {
        List<Expression> params = Arrays.asList(number, new MyRealNumber("0.0000000000000"));
        try {
            //construct another type of operation depending on the input value
            //of the parameterised test
            switch (symbol) {
                case "+"	->	assertEquals( number.getRealNumber(), calc.evalReal(new Plus(params)));
                case "-"	->	assertEquals( number.getRealNumber(), calc.evalReal(new Minus(params)));
                case "*"	->	assertEquals( 0, new MyRealNumber("0.0").getRealNumber().compareTo(calc.evalReal(new Times(params))));
                case "/"	->	assertThrows( ArithmeticException.class, () -> calc.evalReal(new Divides(params)));
                default		->	fail();
            }
        } catch (IllegalConstruction e) {
            fail();
        }
    }



}
