// Generated from parsers/integerParser/IntegerExpr.g4 by ANTLR 4.12.0
package parsers.integerParser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class IntegerExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, SEPARATOR=11, INT=12;
	public static final int
		RULE_input = 0, RULE_expr = 1, RULE_prefixOperation = 2, RULE_postfixOperation = 3, 
		RULE_values = 4, RULE_operator = 5, RULE_infixOperation = 6, RULE_e = 7, 
		RULE_e2 = 8, RULE_t = 9, RULE_t2 = 10, RULE_f = 11, RULE_num = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"input", "expr", "prefixOperation", "postfixOperation", "values", "operator", 
			"infixOperation", "e", "e2", "t", "t2", "f", "num"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'gcd'", 
			"'lcm'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "SEPARATOR", 
			"INT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "IntegerExpr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public IntegerExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InputContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(IntegerExprParser.EOF, 0); }
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntegerExprListener ) ((IntegerExprListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntegerExprListener ) ((IntegerExprListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegerExprVisitor ) return ((IntegerExprVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			expr();
			setState(27);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public PrefixOperationContext prefixOperation() {
			return getRuleContext(PrefixOperationContext.class,0);
		}
		public InfixOperationContext infixOperation() {
			return getRuleContext(InfixOperationContext.class,0);
		}
		public PostfixOperationContext postfixOperation() {
			return getRuleContext(PostfixOperationContext.class,0);
		}
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntegerExprListener ) ((IntegerExprListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntegerExprListener ) ((IntegerExprListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegerExprVisitor ) return ((IntegerExprVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		try {
			setState(33);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				prefixOperation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				infixOperation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
				postfixOperation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(32);
				num();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrefixOperationContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public PrefixOperationContext prefixOperation() {
			return getRuleContext(PrefixOperationContext.class,0);
		}
		public TerminalNode SEPARATOR() { return getToken(IntegerExprParser.SEPARATOR, 0); }
		public PrefixOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntegerExprListener ) ((IntegerExprListener)listener).enterPrefixOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntegerExprListener ) ((IntegerExprListener)listener).exitPrefixOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegerExprVisitor ) return ((IntegerExprVisitor<? extends T>)visitor).visitPrefixOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixOperationContext prefixOperation() throws RecognitionException {
		PrefixOperationContext _localctx = new PrefixOperationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_prefixOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			operator();
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEPARATOR) {
				{
				setState(36);
				match(SEPARATOR);
				}
			}

			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(39);
				values(0);
				}
				break;
			case 2:
				{
				setState(40);
				match(T__0);
				setState(41);
				prefixOperation();
				setState(42);
				match(T__1);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PostfixOperationContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public PostfixOperationContext postfixOperation() {
			return getRuleContext(PostfixOperationContext.class,0);
		}
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public TerminalNode SEPARATOR() { return getToken(IntegerExprParser.SEPARATOR, 0); }
		public PostfixOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntegerExprListener ) ((IntegerExprListener)listener).enterPostfixOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntegerExprListener ) ((IntegerExprListener)listener).exitPostfixOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegerExprVisitor ) return ((IntegerExprVisitor<? extends T>)visitor).visitPostfixOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixOperationContext postfixOperation() throws RecognitionException {
		PostfixOperationContext _localctx = new PostfixOperationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_postfixOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(46);
				match(T__0);
				setState(47);
				postfixOperation();
				setState(48);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(50);
				values(0);
				}
				break;
			}
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEPARATOR) {
				{
				setState(53);
				match(SEPARATOR);
				}
			}

			setState(56);
			operator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValuesContext extends ParserRuleContext {
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public List<ValuesContext> values() {
			return getRuleContexts(ValuesContext.class);
		}
		public ValuesContext values(int i) {
			return getRuleContext(ValuesContext.class,i);
		}
		public TerminalNode SEPARATOR() { return getToken(IntegerExprParser.SEPARATOR, 0); }
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntegerExprListener ) ((IntegerExprListener)listener).enterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntegerExprListener ) ((IntegerExprListener)listener).exitValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegerExprVisitor ) return ((IntegerExprVisitor<? extends T>)visitor).visitValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		return values(0);
	}

	private ValuesContext values(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValuesContext _localctx = new ValuesContext(_ctx, _parentState);
		ValuesContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_values, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(59);
				num();
				}
				break;
			case T__0:
				{
				setState(60);
				match(T__0);
				setState(61);
				values(0);
				setState(62);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ValuesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_values);
					setState(66);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(67);
					match(SEPARATOR);
					setState(68);
					values(2);
					}
					} 
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperatorContext extends ParserRuleContext {
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
	 
		public OperatorContext() { }
		public void copyFrom(OperatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModuloContext extends OperatorContext {
		public ModuloContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntegerExprListener ) ((IntegerExprListener)listener).enterModulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntegerExprListener ) ((IntegerExprListener)listener).exitModulo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegerExprVisitor ) return ((IntegerExprVisitor<? extends T>)visitor).visitModulo(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TimesContext extends OperatorContext {
		public TimesContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntegerExprListener ) ((IntegerExprListener)listener).enterTimes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntegerExprListener ) ((IntegerExprListener)listener).exitTimes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegerExprVisitor ) return ((IntegerExprVisitor<? extends T>)visitor).visitTimes(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LCMContext extends OperatorContext {
		public LCMContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntegerExprListener ) ((IntegerExprListener)listener).enterLCM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntegerExprListener ) ((IntegerExprListener)listener).exitLCM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegerExprVisitor ) return ((IntegerExprVisitor<? extends T>)visitor).visitLCM(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GCDContext extends OperatorContext {
		public GCDContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntegerExprListener ) ((IntegerExprListener)listener).enterGCD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntegerExprListener ) ((IntegerExprListener)listener).exitGCD(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegerExprVisitor ) return ((IntegerExprVisitor<? extends T>)visitor).visitGCD(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusContext extends OperatorContext {
		public PlusContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntegerExprListener ) ((IntegerExprListener)listener).enterPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntegerExprListener ) ((IntegerExprListener)listener).exitPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegerExprVisitor ) return ((IntegerExprVisitor<? extends T>)visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MinusContext extends OperatorContext {
		public MinusContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntegerExprListener ) ((IntegerExprListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntegerExprListener ) ((IntegerExprListener)listener).exitMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegerExprVisitor ) return ((IntegerExprVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DividesContext extends OperatorContext {
		public DividesContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntegerExprListener ) ((IntegerExprListener)listener).enterDivides(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntegerExprListener ) ((IntegerExprListener)listener).exitDivides(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegerExprVisitor ) return ((IntegerExprVisitor<? extends T>)visitor).visitDivides(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PowerContext extends OperatorContext {
		public PowerContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntegerExprListener ) ((IntegerExprListener)listener).enterPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntegerExprListener ) ((IntegerExprListener)listener).exitPower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegerExprVisitor ) return ((IntegerExprVisitor<? extends T>)visitor).visitPower(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_operator);
		try {
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				_localctx = new PlusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(74);
				match(T__2);
				}
				}
				break;
			case T__3:
				_localctx = new MinusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(75);
				match(T__3);
				}
				}
				break;
			case T__4:
				_localctx = new TimesContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(76);
				match(T__4);
				}
				}
				break;
			case T__5:
				_localctx = new DividesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(77);
				match(T__5);
				}
				}
				break;
			case T__6:
				_localctx = new ModuloContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(78);
				match(T__6);
				}
				}
				break;
			case T__7:
				_localctx = new PowerContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(79);
				match(T__7);
				}
				}
				break;
			case T__8:
				_localctx = new GCDContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(80);
				match(T__8);
				}
				}
				break;
			case T__9:
				_localctx = new LCMContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(81);
				match(T__9);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InfixOperationContext extends ParserRuleContext {
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public InfixOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntegerExprListener ) ((IntegerExprListener)listener).enterInfixOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntegerExprListener ) ((IntegerExprListener)listener).exitInfixOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegerExprVisitor ) return ((IntegerExprVisitor<? extends T>)visitor).visitInfixOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfixOperationContext infixOperation() throws RecognitionException {
		InfixOperationContext _localctx = new InfixOperationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_infixOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			e();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EContext extends ParserRuleContext {
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
	 
		public EContext() { }
		public void copyFrom(EContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StartValueInfixContext extends EContext {
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public E2Context e2() {
			return getRuleContext(E2Context.class,0);
		}
		public StartValueInfixContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntegerExprListener ) ((IntegerExprListener)listener).enterStartValueInfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntegerExprListener ) ((IntegerExprListener)listener).exitStartValueInfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegerExprVisitor ) return ((IntegerExprVisitor<? extends T>)visitor).visitStartValueInfix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EContext e() throws RecognitionException {
		EContext _localctx = new EContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_e);
		try {
			_localctx = new StartValueInfixContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			t();
			setState(87);
			e2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class E2Context extends ParserRuleContext {
		public E2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e2; }
	 
		public E2Context() { }
		public void copyFrom(E2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InfixMinusContext extends E2Context {
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public E2Context e2() {
			return getRuleContext(E2Context.class,0);
		}
		public InfixMinusContext(E2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntegerExprListener ) ((IntegerExprListener)listener).enterInfixMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntegerExprListener ) ((IntegerExprListener)listener).exitInfixMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegerExprVisitor ) return ((IntegerExprVisitor<? extends T>)visitor).visitInfixMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InfixPlusContext extends E2Context {
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public E2Context e2() {
			return getRuleContext(E2Context.class,0);
		}
		public InfixPlusContext(E2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntegerExprListener ) ((IntegerExprListener)listener).enterInfixPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntegerExprListener ) ((IntegerExprListener)listener).exitInfixPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegerExprVisitor ) return ((IntegerExprVisitor<? extends T>)visitor).visitInfixPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VoidContext extends E2Context {
		public VoidContext(E2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntegerExprListener ) ((IntegerExprListener)listener).enterVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntegerExprListener ) ((IntegerExprListener)listener).exitVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegerExprVisitor ) return ((IntegerExprVisitor<? extends T>)visitor).visitVoid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final E2Context e2() throws RecognitionException {
		E2Context _localctx = new E2Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_e2);
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				_localctx = new InfixPlusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				match(T__2);
				setState(90);
				t();
				setState(91);
				e2();
				}
				break;
			case T__3:
				_localctx = new InfixMinusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				match(T__3);
				setState(94);
				t();
				setState(95);
				e2();
				}
				break;
			case EOF:
			case T__1:
				_localctx = new VoidContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TContext extends ParserRuleContext {
		public TContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t; }
	 
		public TContext() { }
		public void copyFrom(TContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SecondValueInfixContext extends TContext {
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public T2Context t2() {
			return getRuleContext(T2Context.class,0);
		}
		public SecondValueInfixContext(TContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntegerExprListener ) ((IntegerExprListener)listener).enterSecondValueInfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntegerExprListener ) ((IntegerExprListener)listener).exitSecondValueInfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegerExprVisitor ) return ((IntegerExprVisitor<? extends T>)visitor).visitSecondValueInfix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TContext t() throws RecognitionException {
		TContext _localctx = new TContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_t);
		try {
			_localctx = new SecondValueInfixContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			f();
			setState(101);
			t2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class T2Context extends ParserRuleContext {
		public T2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t2; }
	 
		public T2Context() { }
		public void copyFrom(T2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Void2Context extends T2Context {
		public Void2Context(T2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntegerExprListener ) ((IntegerExprListener)listener).enterVoid2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntegerExprListener ) ((IntegerExprListener)listener).exitVoid2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegerExprVisitor ) return ((IntegerExprVisitor<? extends T>)visitor).visitVoid2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InfixTimesContext extends T2Context {
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public T2Context t2() {
			return getRuleContext(T2Context.class,0);
		}
		public InfixTimesContext(T2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntegerExprListener ) ((IntegerExprListener)listener).enterInfixTimes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntegerExprListener ) ((IntegerExprListener)listener).exitInfixTimes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegerExprVisitor ) return ((IntegerExprVisitor<? extends T>)visitor).visitInfixTimes(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InfixDividesContext extends T2Context {
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public T2Context t2() {
			return getRuleContext(T2Context.class,0);
		}
		public InfixDividesContext(T2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntegerExprListener ) ((IntegerExprListener)listener).enterInfixDivides(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntegerExprListener ) ((IntegerExprListener)listener).exitInfixDivides(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegerExprVisitor ) return ((IntegerExprVisitor<? extends T>)visitor).visitInfixDivides(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T2Context t2() throws RecognitionException {
		T2Context _localctx = new T2Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_t2);
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				_localctx = new InfixTimesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				match(T__4);
				setState(104);
				f();
				setState(105);
				t2();
				}
				break;
			case T__5:
				_localctx = new InfixDividesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(T__5);
				setState(108);
				f();
				setState(109);
				t2();
				}
				break;
			case EOF:
			case T__1:
			case T__2:
			case T__3:
				_localctx = new Void2Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FContext extends ParserRuleContext {
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntegerExprListener ) ((IntegerExprListener)listener).enterF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntegerExprListener ) ((IntegerExprListener)listener).exitF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegerExprVisitor ) return ((IntegerExprVisitor<? extends T>)visitor).visitF(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FContext f() throws RecognitionException {
		FContext _localctx = new FContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_f);
		try {
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				num();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				match(T__0);
				setState(116);
				expr();
				setState(117);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumContext extends ParserRuleContext {
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
	 
		public NumContext() { }
		public void copyFrom(NumContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntegerContext extends NumContext {
		public TerminalNode INT() { return getToken(IntegerExprParser.INT, 0); }
		public IntegerContext(NumContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntegerExprListener ) ((IntegerExprListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntegerExprListener ) ((IntegerExprListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntegerExprVisitor ) return ((IntegerExprVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_num);
		try {
			_localctx = new IntegerContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return values_sempred((ValuesContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean values_sempred(ValuesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\f|\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\"\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0003\u0002&\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002-\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u00034\b\u0003\u0001\u0003\u0003\u0003"+
		"7\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004A\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004F\b\u0004\n\u0004\f\u0004I\t\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005S\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bc\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\nq\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000bx\b\u000b\u0001\f\u0001\f\u0001\f\u0000\u0001\b\r\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0000"+
		"\u0083\u0000\u001a\u0001\u0000\u0000\u0000\u0002!\u0001\u0000\u0000\u0000"+
		"\u0004#\u0001\u0000\u0000\u0000\u00063\u0001\u0000\u0000\u0000\b@\u0001"+
		"\u0000\u0000\u0000\nR\u0001\u0000\u0000\u0000\fT\u0001\u0000\u0000\u0000"+
		"\u000eV\u0001\u0000\u0000\u0000\u0010b\u0001\u0000\u0000\u0000\u0012d"+
		"\u0001\u0000\u0000\u0000\u0014p\u0001\u0000\u0000\u0000\u0016w\u0001\u0000"+
		"\u0000\u0000\u0018y\u0001\u0000\u0000\u0000\u001a\u001b\u0003\u0002\u0001"+
		"\u0000\u001b\u001c\u0005\u0000\u0000\u0001\u001c\u0001\u0001\u0000\u0000"+
		"\u0000\u001d\"\u0003\u0004\u0002\u0000\u001e\"\u0003\f\u0006\u0000\u001f"+
		"\"\u0003\u0006\u0003\u0000 \"\u0003\u0018\f\u0000!\u001d\u0001\u0000\u0000"+
		"\u0000!\u001e\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000!"+
		" \u0001\u0000\u0000\u0000\"\u0003\u0001\u0000\u0000\u0000#%\u0003\n\u0005"+
		"\u0000$&\u0005\u000b\u0000\u0000%$\u0001\u0000\u0000\u0000%&\u0001\u0000"+
		"\u0000\u0000&,\u0001\u0000\u0000\u0000\'-\u0003\b\u0004\u0000()\u0005"+
		"\u0001\u0000\u0000)*\u0003\u0004\u0002\u0000*+\u0005\u0002\u0000\u0000"+
		"+-\u0001\u0000\u0000\u0000,\'\u0001\u0000\u0000\u0000,(\u0001\u0000\u0000"+
		"\u0000-\u0005\u0001\u0000\u0000\u0000./\u0005\u0001\u0000\u0000/0\u0003"+
		"\u0006\u0003\u000001\u0005\u0002\u0000\u000014\u0001\u0000\u0000\u0000"+
		"24\u0003\b\u0004\u00003.\u0001\u0000\u0000\u000032\u0001\u0000\u0000\u0000"+
		"46\u0001\u0000\u0000\u000057\u0005\u000b\u0000\u000065\u0001\u0000\u0000"+
		"\u000067\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u000089\u0003\n\u0005"+
		"\u00009\u0007\u0001\u0000\u0000\u0000:;\u0006\u0004\uffff\uffff\u0000"+
		";A\u0003\u0018\f\u0000<=\u0005\u0001\u0000\u0000=>\u0003\b\u0004\u0000"+
		">?\u0005\u0002\u0000\u0000?A\u0001\u0000\u0000\u0000@:\u0001\u0000\u0000"+
		"\u0000@<\u0001\u0000\u0000\u0000AG\u0001\u0000\u0000\u0000BC\n\u0001\u0000"+
		"\u0000CD\u0005\u000b\u0000\u0000DF\u0003\b\u0004\u0002EB\u0001\u0000\u0000"+
		"\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000"+
		"\u0000\u0000H\t\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000JS\u0005"+
		"\u0003\u0000\u0000KS\u0005\u0004\u0000\u0000LS\u0005\u0005\u0000\u0000"+
		"MS\u0005\u0006\u0000\u0000NS\u0005\u0007\u0000\u0000OS\u0005\b\u0000\u0000"+
		"PS\u0005\t\u0000\u0000QS\u0005\n\u0000\u0000RJ\u0001\u0000\u0000\u0000"+
		"RK\u0001\u0000\u0000\u0000RL\u0001\u0000\u0000\u0000RM\u0001\u0000\u0000"+
		"\u0000RN\u0001\u0000\u0000\u0000RO\u0001\u0000\u0000\u0000RP\u0001\u0000"+
		"\u0000\u0000RQ\u0001\u0000\u0000\u0000S\u000b\u0001\u0000\u0000\u0000"+
		"TU\u0003\u000e\u0007\u0000U\r\u0001\u0000\u0000\u0000VW\u0003\u0012\t"+
		"\u0000WX\u0003\u0010\b\u0000X\u000f\u0001\u0000\u0000\u0000YZ\u0005\u0003"+
		"\u0000\u0000Z[\u0003\u0012\t\u0000[\\\u0003\u0010\b\u0000\\c\u0001\u0000"+
		"\u0000\u0000]^\u0005\u0004\u0000\u0000^_\u0003\u0012\t\u0000_`\u0003\u0010"+
		"\b\u0000`c\u0001\u0000\u0000\u0000ac\u0001\u0000\u0000\u0000bY\u0001\u0000"+
		"\u0000\u0000b]\u0001\u0000\u0000\u0000ba\u0001\u0000\u0000\u0000c\u0011"+
		"\u0001\u0000\u0000\u0000de\u0003\u0016\u000b\u0000ef\u0003\u0014\n\u0000"+
		"f\u0013\u0001\u0000\u0000\u0000gh\u0005\u0005\u0000\u0000hi\u0003\u0016"+
		"\u000b\u0000ij\u0003\u0014\n\u0000jq\u0001\u0000\u0000\u0000kl\u0005\u0006"+
		"\u0000\u0000lm\u0003\u0016\u000b\u0000mn\u0003\u0014\n\u0000nq\u0001\u0000"+
		"\u0000\u0000oq\u0001\u0000\u0000\u0000pg\u0001\u0000\u0000\u0000pk\u0001"+
		"\u0000\u0000\u0000po\u0001\u0000\u0000\u0000q\u0015\u0001\u0000\u0000"+
		"\u0000rx\u0003\u0018\f\u0000st\u0005\u0001\u0000\u0000tu\u0003\u0002\u0001"+
		"\u0000uv\u0005\u0002\u0000\u0000vx\u0001\u0000\u0000\u0000wr\u0001\u0000"+
		"\u0000\u0000ws\u0001\u0000\u0000\u0000x\u0017\u0001\u0000\u0000\u0000"+
		"yz\u0005\f\u0000\u0000z\u0019\u0001\u0000\u0000\u0000\u000b!%,36@GRbp"+
		"w";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}