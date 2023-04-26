// Generated from parsers/integerParser/IntegerExpr.g4 by ANTLR 4.12.0
package parsers.integerParser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IntegerExprParser}.
 */
public interface IntegerExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IntegerExprParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(IntegerExprParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntegerExprParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(IntegerExprParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntegerExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(IntegerExprParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntegerExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(IntegerExprParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntegerExprParser#prefixOperation}.
	 * @param ctx the parse tree
	 */
	void enterPrefixOperation(IntegerExprParser.PrefixOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntegerExprParser#prefixOperation}.
	 * @param ctx the parse tree
	 */
	void exitPrefixOperation(IntegerExprParser.PrefixOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntegerExprParser#postfixOperation}.
	 * @param ctx the parse tree
	 */
	void enterPostfixOperation(IntegerExprParser.PostfixOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntegerExprParser#postfixOperation}.
	 * @param ctx the parse tree
	 */
	void exitPostfixOperation(IntegerExprParser.PostfixOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code values}
	 * labeled alternative in {@link IntegerExprParser#operatoroperatoroperatoroperatoroperatoroperatoroperatoroperatoree2e2e2tt2t2t2num}.
	 * @param ctx the parse tree
	 */
	void enterValues(IntegerExprParser.ValuesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code values}
	 * labeled alternative in {@link IntegerExprParser#operatoroperatoroperatoroperatoroperatoroperatoroperatoroperatoree2e2e2tt2t2t2num}.
	 * @param ctx the parse tree
	 */
	void exitValues(IntegerExprParser.ValuesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link IntegerExprParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterPlus(IntegerExprParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link IntegerExprParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitPlus(IntegerExprParser.PlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link IntegerExprParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterMinus(IntegerExprParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link IntegerExprParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitMinus(IntegerExprParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Times}
	 * labeled alternative in {@link IntegerExprParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterTimes(IntegerExprParser.TimesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Times}
	 * labeled alternative in {@link IntegerExprParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitTimes(IntegerExprParser.TimesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Divides}
	 * labeled alternative in {@link IntegerExprParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterDivides(IntegerExprParser.DividesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Divides}
	 * labeled alternative in {@link IntegerExprParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitDivides(IntegerExprParser.DividesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Modulo}
	 * labeled alternative in {@link IntegerExprParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterModulo(IntegerExprParser.ModuloContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Modulo}
	 * labeled alternative in {@link IntegerExprParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitModulo(IntegerExprParser.ModuloContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Power}
	 * labeled alternative in {@link IntegerExprParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterPower(IntegerExprParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Power}
	 * labeled alternative in {@link IntegerExprParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitPower(IntegerExprParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GCD}
	 * labeled alternative in {@link IntegerExprParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterGCD(IntegerExprParser.GCDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GCD}
	 * labeled alternative in {@link IntegerExprParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitGCD(IntegerExprParser.GCDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LCM}
	 * labeled alternative in {@link IntegerExprParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterLCM(IntegerExprParser.LCMContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LCM}
	 * labeled alternative in {@link IntegerExprParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitLCM(IntegerExprParser.LCMContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntegerExprParser#infixOperation}.
	 * @param ctx the parse tree
	 */
	void enterInfixOperation(IntegerExprParser.InfixOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntegerExprParser#infixOperation}.
	 * @param ctx the parse tree
	 */
	void exitInfixOperation(IntegerExprParser.InfixOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StartValueInfix}
	 * labeled alternative in {@link IntegerExprParser#e}.
	 * @param ctx the parse tree
	 */
	void enterStartValueInfix(IntegerExprParser.StartValueInfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StartValueInfix}
	 * labeled alternative in {@link IntegerExprParser#e}.
	 * @param ctx the parse tree
	 */
	void exitStartValueInfix(IntegerExprParser.StartValueInfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InfixPlus}
	 * labeled alternative in {@link IntegerExprParser#e2}.
	 * @param ctx the parse tree
	 */
	void enterInfixPlus(IntegerExprParser.InfixPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InfixPlus}
	 * labeled alternative in {@link IntegerExprParser#e2}.
	 * @param ctx the parse tree
	 */
	void exitInfixPlus(IntegerExprParser.InfixPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InfixMinus}
	 * labeled alternative in {@link IntegerExprParser#e2}.
	 * @param ctx the parse tree
	 */
	void enterInfixMinus(IntegerExprParser.InfixMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InfixMinus}
	 * labeled alternative in {@link IntegerExprParser#e2}.
	 * @param ctx the parse tree
	 */
	void exitInfixMinus(IntegerExprParser.InfixMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Void}
	 * labeled alternative in {@link IntegerExprParser#e2}.
	 * @param ctx the parse tree
	 */
	void enterVoid(IntegerExprParser.VoidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Void}
	 * labeled alternative in {@link IntegerExprParser#e2}.
	 * @param ctx the parse tree
	 */
	void exitVoid(IntegerExprParser.VoidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SecondValueInfix}
	 * labeled alternative in {@link IntegerExprParser#t}.
	 * @param ctx the parse tree
	 */
	void enterSecondValueInfix(IntegerExprParser.SecondValueInfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SecondValueInfix}
	 * labeled alternative in {@link IntegerExprParser#t}.
	 * @param ctx the parse tree
	 */
	void exitSecondValueInfix(IntegerExprParser.SecondValueInfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InfixTimes}
	 * labeled alternative in {@link IntegerExprParser#t2}.
	 * @param ctx the parse tree
	 */
	void enterInfixTimes(IntegerExprParser.InfixTimesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InfixTimes}
	 * labeled alternative in {@link IntegerExprParser#t2}.
	 * @param ctx the parse tree
	 */
	void exitInfixTimes(IntegerExprParser.InfixTimesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InfixDivides}
	 * labeled alternative in {@link IntegerExprParser#t2}.
	 * @param ctx the parse tree
	 */
	void enterInfixDivides(IntegerExprParser.InfixDividesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InfixDivides}
	 * labeled alternative in {@link IntegerExprParser#t2}.
	 * @param ctx the parse tree
	 */
	void exitInfixDivides(IntegerExprParser.InfixDividesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Void2}
	 * labeled alternative in {@link IntegerExprParser#t2}.
	 * @param ctx the parse tree
	 */
	void enterVoid2(IntegerExprParser.Void2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Void2}
	 * labeled alternative in {@link IntegerExprParser#t2}.
	 * @param ctx the parse tree
	 */
	void exitVoid2(IntegerExprParser.Void2Context ctx);
	/**
	 * Enter a parse tree produced by {@link IntegerExprParser#f}.
	 * @param ctx the parse tree
	 */
	void enterF(IntegerExprParser.FContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntegerExprParser#f}.
	 * @param ctx the parse tree
	 */
	void exitF(IntegerExprParser.FContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link IntegerExprParser#num}.
	 * @param ctx the parse tree
	 */
	void enterInteger(IntegerExprParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link IntegerExprParser#num}.
	 * @param ctx the parse tree
	 */
	void exitInteger(IntegerExprParser.IntegerContext ctx);
}