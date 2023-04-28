package visitor;

import calculator.MyNumber;
import calculator.MyRationalNumber;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDisplayer {

    private Displayer displayer;

    @BeforeEach
    void setup(){
        displayer = Displayer.createDisplayer();
    }

    @Test
    void testVisitNumber(){
        MyRationalNumber number = MyRationalNumber.create(1,2);
        assertEquals("", number.accept(displayer));
    }

    @AfterAll
    static void tearDown(){
        Displayer.deleteDisplayer();
    }

}
