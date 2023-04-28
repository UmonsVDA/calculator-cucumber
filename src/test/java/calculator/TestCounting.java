package calculator;

//Import Junit5 libraries for unit testing:
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import visitor.Counter;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;


class TestCounting {

    private int value1, value2;
    private Expression e;

    private Counter counter;

    @BeforeEach
    void setUp() {
        value1 = 8;
        value2 = 6;
        e = null;

        counter = new Counter();

    }

    @Test
    void testNumberCounting() {
        e = new MyInteger(value1);
        e.accept(counter);
        //test whether a number has zero depth (i.e. no nested expressions)
        assertEquals( 0, counter.getCountDepth());
        //test whether a number contains zero operations
        assertEquals(0, counter.getCountOps());
        //test whether a number contains 1 number
        assertEquals(1, counter.getCountNbs());
    }

    @ParameterizedTest
    @ValueSource(strings = {"*", "+", "/", "-"})
    void testOperationCounting(String symbol) {
        List<Expression> params = Arrays.asList(new MyInteger(value1),new MyInteger(value2));
        //Operation op = null;
        try {
            //construct another type of operation depending on the input value
            //of the parameterised test
            switch (symbol) {
                case "+"	->	e = new Plus(params);
                case "-"	->	e = new Minus(params);
                case "*"	->	e = new Times(params);
                case "/"	->	e = new Divides(params);
                default		->	fail();
            }
        } catch (IllegalOperationException e) {
            fail();
        }
        e.accept(counter);

        //test whether a binary operation has depth 1
        assertEquals(1, counter.getCountDepth(),"counting depth of an Operation");
        //test whether a binary operation contains 1 operation
        assertEquals(1, counter.getCountOps());
        //test whether a binary operation contains 2 numbers
        assertEquals(2, counter.getCountNbs());
    }

}
