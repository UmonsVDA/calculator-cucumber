package parsers;

import static org.junit.jupiter.api.Assertions.*;

import calculator.*;
import org.junit.jupiter.api.*;
import parsers.realParser.RealParser;

public class TestInfixParser {

    @Test
    void testBinaryPlus(){
        String input = "1+2";
        Expression e = RealParser.parse(input);
        assertEquals(Plus.class, e.getClass());
        assertEquals("( 1 + 2 )" , e.toString());
    }

    @Test
    void testBinaryMinus(){
        String input = "1-2";
        Expression e = RealParser.parse(input);
        assertEquals(Minus.class, e.getClass());
        assertEquals("( 1 - 2 )" , e.toString());
    }

    @Test
    void testBinaryTimes(){
        String input = "1*2";
        Expression e = RealParser.parse(input);
        assertEquals(Times.class, e.getClass());
        assertEquals("( 1 * 2 )" , e.toString());
    }

    @Test
    void testBinaryDivides(){
        String input = "1/2";
        Expression e = RealParser.parse(input);
        assertEquals(Divides.class, e.getClass());
        assertEquals("( 1 / 2 )" , e.toString());
    }

    @Test
    void testOperationPriority(){
        String input = "1+2*3+4";
        Expression e = RealParser.parse(input);
        assertEquals("( ( 1 + ( 2 * 3 ) ) + 4 )" , e.toString());
    }

    @Test
    void testOperationPriority2(){
        String input = "1/2-3+4*5";
        Expression e = RealParser.parse(input);
        assertEquals("( ( ( 1 / 2 ) - 3 ) + ( 4 * 5 ) )" , e.toString());
    }

    @Test
    void testParentheses(){
        String input = "(1+2)*3";
        Expression e = RealParser.parse(input);
        assertEquals("( ( 1 + 2 ) * 3 )" , e.toString());
    }

    @Test
    void testParentheses2(){
        String input = "1/(2*3)";
        Expression e = RealParser.parse(input);
        assertEquals("( 1 / ( 2 * 3 ) )" , e.toString());
    }
}
