package calculator;

import calculator.operations.Divides;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class TestPrecision {

    private final String value1 = "3.14159";
    private final String value2 = "2.71828";
    private Divides op;

    private List<Expression> params;
    private final int precision = 3;

    private final MathContext mathContext = new MathContext(precision);

    private Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
        params = new ArrayList<>(Arrays.asList(new MyRealNumber(value1), new MyRealNumber(value2)));
        try {
            op = new Divides(params);
            op.setMathContext(mathContext);
        } catch (IllegalOperationException e) {
            fail();
        }
    }

    @Test
    void testPrecisionOperation() {
        Optional<BigDecimal> result = calculator.evalReal(op);
        assertTrue(result.isPresent());
        assertEquals(precision, result.get().precision());
    }

}
