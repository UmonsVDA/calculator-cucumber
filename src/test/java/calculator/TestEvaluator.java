package calculator;

//Import Junit5 libraries for unit testing:
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;

class TestEvaluator {

    private Calculator calc;
    private int value1, value2;
    private int nominator1, nominator2, denominator1, denominator2;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
        value1 = 8;
        value2 = 6;
        nominator1 = 1;
        nominator2 = 2;
        denominator1 = 3;
        denominator2 = 4;

    }

    @Test
    void testEvaluatorMyNumber() {
        assertEquals( value1, calc.eval(new MyInteger(value1)));
    }

    @Test
    void testEvaluatorRationalNumber() {
        assertEquals( MyRationalNumber.create(nominator1, denominator1), calc.evalRational(MyRationalNumber.create(nominator1, denominator1)));
    }

    @ParameterizedTest
    @ValueSource(strings = {"*", "+", "/", "-"})
    void testEvaluateOperations(String symbol) {
        List<Expression> params = Arrays.asList(new MyInteger(value1),new MyInteger(value2));
        try {
            //construct another type of operation depending on the input value
            //of the parameterised test
            switch (symbol) {
                case "+"	->	assertEquals( value1 + value2, calc.eval(new Plus(params)));
                case "-"	->	assertEquals( value1 - value2, calc.eval(new Minus(params)));
                case "*"	->	assertEquals( value1 * value2, calc.eval(new Times(params)));
                case "/"	->	assertEquals( value1 / value2, calc.eval(new Divides(params)));
                default		->	fail();
            }
        } catch (IllegalConstruction e) {
            fail();
        }
    }

    @ParameterizedTest
    @ValueSource(strings = {"*", "+", "/", "-"})
    void testEvaluateRationalOperations(String symbol) {
        List<Expression> params = Arrays.asList(MyRationalNumber.create(nominator1, denominator1),MyRationalNumber.create(nominator2, denominator2));
        try {
            //construct another type of operation depending on the input value
            //of the parameterised test
            switch (symbol) {
                case "+"	->	assertEquals( MyRationalNumber.create(5,6), calc.evalRational(new Plus(params)));
                case "-"	->	assertEquals( MyRationalNumber.create(-1, 6), calc.evalRational(new Minus(params)));
                case "*"	->	assertEquals( MyRationalNumber.create(1, 6), calc.evalRational(new Times(params)));
                case "/"	->	assertEquals( MyRationalNumber.create(2, 3), calc.evalRational(new Divides(params)));
                default		->	fail();
            }
        } catch (IllegalConstruction e) {
            fail();
        }
    }

    @ParameterizedTest
    @ValueSource(strings = {"*", "+", "/", "-"})
    void testEvaluateMixedOperations(String symbol) {
        List<Expression> params = Arrays.asList(MyRationalNumber.create(nominator1, denominator1),MyRationalNumber.create(nominator2, denominator2), new MyInteger(value1));
        try {
            //construct another type of operation depending on the input value
            //of the parameterised test
            switch (symbol) {
                case "+"	->	assertEquals( MyRationalNumber.create(53,6), calc.evalRational(new Plus(params)));
                case "-"	->	assertEquals( MyRationalNumber.create(-49, 6), calc.evalRational(new Minus(params)));
                case "*"	->	assertEquals( MyRationalNumber.create(8, 6), calc.evalRational(new Times(params)));
                case "/"	->	assertEquals( MyRationalNumber.create(2, 24), calc.evalRational(new Divides(params)));
                default		->	fail();
            }
        } catch (IllegalConstruction e) {
            fail();
        }
    }

}
