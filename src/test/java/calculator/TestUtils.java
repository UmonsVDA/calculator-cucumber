package calculator;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestUtils {

    static <T> void checkOptionalContent(T expected, Optional<T> optional) {
        assertTrue(optional.isPresent());
        assertEquals(expected, optional.get());
    }
}
