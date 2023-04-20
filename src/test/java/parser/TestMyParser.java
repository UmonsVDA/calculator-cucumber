package parser;

import static org.junit.jupiter.api.Assertions.*;

import calculator.*;
import org.junit.jupiter.api.*;


public class TestMyParser {

    @Test
    void testPrefix(){
        String testString = "+(1,2,3)";
        Expression e = MyParser.parse(testString);
        Operation op = (Operation) e;
        assertEquals(Notation.PREFIX,op.notation);
    }

    @Test
    void testInfix(){
        String testString = "3+2";
        Expression e = MyParser.parse(testString);
        Operation op = (Operation) e;
        assertEquals(Notation.INFIX,op.notation);
    }

    @Test
    void testPostfix(){
        String testString = "(3,6,8)-";
        Expression e = MyParser.parse(testString);
        Operation op = (Operation) e;
        assertEquals(Notation.POSTFIX,op.notation);
    }

    @Test
    void testMultipleExpr(){
        String testString = "+(1,2,(*(6,3,(-(7,3)))))";
        String expectedString = "+ (1, 2, * (6, 3, - (7, 3)))";
        Expression e = MyParser.parse(testString);
        assertEquals(expectedString,e.toString());
    }

    @Test
    void testMultipleTypeExpr(){
        String testString = "-(1,(1+2))";
        String expectedString = "- (1, ( 1 + 2 ))";
        Expression e = MyParser.parse(testString);
        assertEquals(expectedString,e.toString());
    }

    @Test
    void testInteger(){
        String testString = "12";
        Expression e = MyParser.parse(testString);
        assertEquals(MyInteger.class, e.getClass());
    }

    @Test
    void testReal(){
        String testString = "3.14";
        Expression e = MyParser.parse(testString);
        assertEquals(MyRealNumber.class, e.getClass());
    }

    @Test
    void testRational(){
        String testString = "5_6";
        Expression e = MyParser.parse(testString);
        assertEquals(MyRationalNumber.class, e.getClass());
    }

    @Test
    void testOperation(){
        String values = "(1,2,3)";
        String testString;
        String[] op = new String[]{"+","-","/","*"};
        Class[] opClass = new Class[]{Plus.class,Minus.class,Divides.class,Times.class};
        for (int i=0; i<4; i++){
            testString = op[i].concat(values);
            Expression e = MyParser.parse(testString);
            assertEquals(opClass[i],e.getClass());
        }
    }
}
