package calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPrecision {

    private Divides op;

    private final int precision = 3;

    private final MathContext mathContext = new MathContext(precision);

    private Calculator calculator;

    @BeforeEach
    void setup() throws IllegalConstruction, IllegalOperationException {
        calculator = new Calculator();
        String value1 = "3.14159";
        String value2 = "2.71828";
        List<Expression> params = new ArrayList<>(Arrays.asList(new MyRealNumber(value1), new MyRealNumber(value2)));
        op = new Divides(params);
        op.setMathContext(mathContext);
    }

    @Test
    void testPrecisionOperation(){
        BigDecimal result = calculator.evalReal(op);
        assertEquals(precision,result.precision());
    }

}
