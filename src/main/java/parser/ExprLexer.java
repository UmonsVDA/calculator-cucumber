// Generated from parser/Expr.g4 by ANTLR 4.12.0
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, SEPARATOR=11, INT=12, REAL=13, FRAC=14, PI=15, EULER=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "SEPARATOR", "INT", "REAL", "FRAC", "PI", "EULER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'gcd'", 
			"'lcm'", "','", null, null, null, "'\\u03C0'", "'e'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "SEPARATOR", 
			"INT", "REAL", "FRAC", "PI", "EULER"
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


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0010e\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0004\u000b=\b\u000b\u000b\u000b\f\u000b>\u0001\f\u0004"+
		"\fB\b\f\u000b\f\f\fC\u0001\f\u0001\f\u0004\fH\b\f\u000b\f\f\fI\u0001\f"+
		"\u0001\f\u0003\fN\b\f\u0001\f\u0004\fQ\b\f\u000b\f\f\fR\u0003\fU\b\f\u0001"+
		"\r\u0004\rX\b\r\u000b\r\f\rY\u0001\r\u0001\r\u0004\r^\b\r\u000b\r\f\r"+
		"_\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0000\u0000\u0010\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010\u0001\u0000\u0004\u0001\u000009\u0001\u0000..\u0003"+
		"\u0000++--||\u0001\u0000__l\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0001!\u0001\u0000\u0000\u0000\u0003#\u0001\u0000\u0000"+
		"\u0000\u0005%\u0001\u0000\u0000\u0000\u0007\'\u0001\u0000\u0000\u0000"+
		"\t)\u0001\u0000\u0000\u0000\u000b+\u0001\u0000\u0000\u0000\r-\u0001\u0000"+
		"\u0000\u0000\u000f/\u0001\u0000\u0000\u0000\u00111\u0001\u0000\u0000\u0000"+
		"\u00135\u0001\u0000\u0000\u0000\u00159\u0001\u0000\u0000\u0000\u0017<"+
		"\u0001\u0000\u0000\u0000\u0019A\u0001\u0000\u0000\u0000\u001bW\u0001\u0000"+
		"\u0000\u0000\u001da\u0001\u0000\u0000\u0000\u001fc\u0001\u0000\u0000\u0000"+
		"!\"\u0005(\u0000\u0000\"\u0002\u0001\u0000\u0000\u0000#$\u0005)\u0000"+
		"\u0000$\u0004\u0001\u0000\u0000\u0000%&\u0005+\u0000\u0000&\u0006\u0001"+
		"\u0000\u0000\u0000\'(\u0005-\u0000\u0000(\b\u0001\u0000\u0000\u0000)*"+
		"\u0005*\u0000\u0000*\n\u0001\u0000\u0000\u0000+,\u0005/\u0000\u0000,\f"+
		"\u0001\u0000\u0000\u0000-.\u0005%\u0000\u0000.\u000e\u0001\u0000\u0000"+
		"\u0000/0\u0005^\u0000\u00000\u0010\u0001\u0000\u0000\u000012\u0005g\u0000"+
		"\u000023\u0005c\u0000\u000034\u0005d\u0000\u00004\u0012\u0001\u0000\u0000"+
		"\u000056\u0005l\u0000\u000067\u0005c\u0000\u000078\u0005m\u0000\u0000"+
		"8\u0014\u0001\u0000\u0000\u00009:\u0005,\u0000\u0000:\u0016\u0001\u0000"+
		"\u0000\u0000;=\u0007\u0000\u0000\u0000<;\u0001\u0000\u0000\u0000=>\u0001"+
		"\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000"+
		"?\u0018\u0001\u0000\u0000\u0000@B\u0007\u0000\u0000\u0000A@\u0001\u0000"+
		"\u0000\u0000BC\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001"+
		"\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EG\u0007\u0001\u0000\u0000"+
		"FH\u0007\u0000\u0000\u0000GF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000"+
		"\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JT\u0001\u0000"+
		"\u0000\u0000KM\u0005E\u0000\u0000LN\u0007\u0002\u0000\u0000ML\u0001\u0000"+
		"\u0000\u0000MN\u0001\u0000\u0000\u0000NP\u0001\u0000\u0000\u0000OQ\u0007"+
		"\u0000\u0000\u0000PO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000"+
		"RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000SU\u0001\u0000\u0000"+
		"\u0000TK\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000U\u001a\u0001"+
		"\u0000\u0000\u0000VX\u0007\u0000\u0000\u0000WV\u0001\u0000\u0000\u0000"+
		"XY\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000"+
		"\u0000Z[\u0001\u0000\u0000\u0000[]\u0007\u0003\u0000\u0000\\^\u0007\u0000"+
		"\u0000\u0000]\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_]\u0001"+
		"\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`\u001c\u0001\u0000\u0000"+
		"\u0000ab\u0005\u03c0\u0000\u0000b\u001e\u0001\u0000\u0000\u0000cd\u0005"+
		"e\u0000\u0000d \u0001\u0000\u0000\u0000\t\u0000>CIMRTY_\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}