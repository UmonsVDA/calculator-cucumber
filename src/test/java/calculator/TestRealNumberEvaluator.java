package calculator;

//Import Junit5 libraries for unit testing:

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static calculator.TestUtils.checkOptionalContent;
import static org.junit.jupiter.api.Assertions.*;

class TestRealNumberEvaluator {

    private Calculator calc;
    private final String value2 = "5.0000000000001";


    private MyRealNumber number, simpleNumber, simpleNumber2;


    @BeforeEach
    void setup() {
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
    void testEvaluateRealOperations(String symbol) {
        List<Expression> params = Arrays.asList(simpleNumber, simpleNumber2);
        try {
            //construct another type of operation depending on the input value
            //of the parameterised test
            switch (symbol) {
                case "+" ->
                        checkOptionalContent(new MyRealNumber("5.5").getRealNumber(), calc.evalReal(new Plus(params)));
                case "-" ->
                        checkOptionalContent(new MyRealNumber("-4.5").getRealNumber(), calc.evalReal(new Minus(params)));
                case "*" ->
                        checkOptionalContent(new MyRealNumber("2.50").getRealNumber(), calc.evalReal(new Times(params)));
                case "/" ->
                        checkOptionalContent(new MyRealNumber("0.1").getRealNumber(), calc.evalReal(new Divides(params)));
                default -> fail();
            }
        } catch (IllegalOperationException e) {
            fail();
        }
    }


    @ParameterizedTest
    @ValueSource(strings = {"*", "+", "/", "-"})
    void testEvaluateRealOperationsImplyingZero(String symbol) {
        List<Expression> params = Arrays.asList(number, new MyRealNumber("0.0000000000000"));
        try {
            //construct another type of operation depending on the input value
            //of the parameterised test
            switch (symbol) {
                case "+" -> checkOptionalContent(number.getRealNumber(), calc.evalReal(new Plus(params)));
                case "-" -> checkOptionalContent(number.getRealNumber(), calc.evalReal(new Minus(params)));
                case "*" -> assertEquals(0, BigDecimal.ZERO.compareTo(calc.evalReal(new Times(params)).get()));
                case "/" -> assertEquals(Optional.empty(), calc.evalReal(new Divides(params)));
                default -> fail();
            }
        } catch (IllegalOperationException e) {
            fail();
        }
    }


}
