package parsers.integerParser;

import calculator.Expression;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.math.MathContext;

public class IntegerParser {

    public static Expression parse(String inputString){
        CharStream input = CharStreams.fromString(inputString);
        IntegerExprLexer lexer = new IntegerExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        IntegerExprParser parser = new IntegerExprParser(tokens);
        ParseTree tree = parser.input();
        IntegerExpressionVisitor visitor = new IntegerExpressionVisitor(null);
        return visitor.visit(tree);
    }
}
