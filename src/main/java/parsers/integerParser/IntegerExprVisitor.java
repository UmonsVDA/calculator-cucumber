// Generated from parsers/integerParser/IntegerExpr.g4 by ANTLR 4.12.0
package parsers.integerParser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link IntegerExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface IntegerExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link IntegerExprParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(IntegerExprParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link IntegerExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(IntegerExprParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link IntegerExprParser#prefixOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixOperation(IntegerExprParser.PrefixOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link IntegerExprParser#postfixOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixOperation(IntegerExprParser.PostfixOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code values}
	 * labeled alternative in {@link IntegerExprParser#operatoroperatoroperatoroperatoroperatoroperatoroperatoroperatoree2e2e2tt2t2t2num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues(IntegerExprParser.ValuesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link IntegerExprParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(IntegerExprParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link IntegerExprParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(IntegerExprParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Times}
	 * labeled alternative in {@link IntegerExprParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimes(IntegerExprParser.TimesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Divides}
	 * labeled alternative in {@link IntegerExprParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivides(IntegerExprParser.DividesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Modulo}
	 * labeled alternative in {@link IntegerExprParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModulo(IntegerExprParser.ModuloContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Power}
	 * labeled alternative in {@link IntegerExprParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(IntegerExprParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GCD}
	 * labeled alternative in {@link IntegerExprParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGCD(IntegerExprParser.GCDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LCM}
	 * labeled alternative in {@link IntegerExprParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLCM(IntegerExprParser.LCMContext ctx);
	/**
	 * Visit a parse tree produced by {@link IntegerExprParser#infixOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixOperation(IntegerExprParser.InfixOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StartValueInfix}
	 * labeled alternative in {@link IntegerExprParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartValueInfix(IntegerExprParser.StartValueInfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InfixPlus}
	 * labeled alternative in {@link IntegerExprParser#e2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixPlus(IntegerExprParser.InfixPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InfixMinus}
	 * labeled alternative in {@link IntegerExprParser#e2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixMinus(IntegerExprParser.InfixMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Void}
	 * labeled alternative in {@link IntegerExprParser#e2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoid(IntegerExprParser.VoidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SecondValueInfix}
	 * labeled alternative in {@link IntegerExprParser#t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecondValueInfix(IntegerExprParser.SecondValueInfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InfixTimes}
	 * labeled alternative in {@link IntegerExprParser#t2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixTimes(IntegerExprParser.InfixTimesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InfixDivides}
	 * labeled alternative in {@link IntegerExprParser#t2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixDivides(IntegerExprParser.InfixDividesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Void2}
	 * labeled alternative in {@link IntegerExprParser#t2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoid2(IntegerExprParser.Void2Context ctx);
	/**
	 * Visit a parse tree produced by {@link IntegerExprParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF(IntegerExprParser.FContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link IntegerExprParser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(IntegerExprParser.IntegerContext ctx);
}