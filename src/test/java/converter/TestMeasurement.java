package converter;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNull;

public class TestMeasurement {
    @Test
    public void testPrintMeasurementConversion() throws Exception {
        BigDecimal methodResult = Measurement.printConversion(10, "a", "b");
        assertNull(methodResult);
    }
}
