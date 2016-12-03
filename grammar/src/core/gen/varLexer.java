// Generated from C:/IdeaProjects/antlr-css1/grammar/src/parse\var.g4 by ANTLR 4.5.3
package core.gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class varLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		Character=25, Digit=26, Hex=27, WS=28, For=29, If=30, Else=31, Variable=32, 
		Color=33, Selector=34, Name=35, NumberUnit=36, Number=37, Unit=38, Html=39, 
		PseudoClass=40, PseudoElement=41, String=42;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "Character", 
		"Digit", "Hex", "WS", "For", "If", "Else", "Variable", "Color", "Selector", 
		"Name", "NumberUnit", "Number", "Unit", "Html", "PseudoClass", "PseudoElement", 
		"String"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "';'", "'>'", "'<'", "'>='", "'<='", "'=='", "'and'", "'or'", 
		"'not'", "'('", "')'", "'from'", "'to'", "'{'", "'}'", "'*'", "'/'", "'-'", 
		"'+'", "'%'", "'print'", "'true'", "'false'", null, null, null, null, 
		"'for'", "'if'", "'else'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "Character", "Digit", "Hex", "WS", "For", "If", "Else", "Variable", 
		"Color", "Selector", "Name", "NumberUnit", "Number", "Unit", "Html", "PseudoClass", 
		"PseudoElement", "String"
	};
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


	public varLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "var.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2,\u042e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 "+
		"\3 \3 \3!\3!\3!\6!\u00b8\n!\r!\16!\u00b9\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\5\"\u00c8\n\"\3#\3#\3#\3#\3#\7#\u00cf\n#\f#\16#\u00d2"+
		"\13#\3#\5#\u00d5\n#\3#\3#\3#\3#\7#\u00db\n#\f#\16#\u00de\13#\3#\3#\7#"+
		"\u00e2\n#\f#\16#\u00e5\13#\3$\6$\u00e8\n$\r$\16$\u00e9\3%\3%\3%\3&\6&"+
		"\u00f0\n&\r&\16&\u00f1\3\'\3\'\3\'\3\'\3\'\5\'\u00f9\n\'\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u02c1\n(\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u03f0\n)\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\5*\u0424\n*\3+\3+\7+\u0428\n+\f+\16+\u042b\13+\3+\3+\4\u00dc"+
		"\u0429\2,\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,\3\2\7\6\2//C\\aac|\5\2\62;CHc"+
		"h\5\2\13\f\17\17\"\"\4\2%%\60\60\4\2ssuu\u04cb\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\3W\3\2\2\2\5Y"+
		"\3\2\2\2\7[\3\2\2\2\t]\3\2\2\2\13_\3\2\2\2\rb\3\2\2\2\17e\3\2\2\2\21h"+
		"\3\2\2\2\23l\3\2\2\2\25o\3\2\2\2\27s\3\2\2\2\31u\3\2\2\2\33w\3\2\2\2\35"+
		"|\3\2\2\2\37\177\3\2\2\2!\u0081\3\2\2\2#\u0083\3\2\2\2%\u0085\3\2\2\2"+
		"\'\u0087\3\2\2\2)\u0089\3\2\2\2+\u008b\3\2\2\2-\u008d\3\2\2\2/\u0093\3"+
		"\2\2\2\61\u0098\3\2\2\2\63\u009e\3\2\2\2\65\u00a0\3\2\2\2\67\u00a2\3\2"+
		"\2\29\u00a4\3\2\2\2;\u00a8\3\2\2\2=\u00ac\3\2\2\2?\u00af\3\2\2\2A\u00b4"+
		"\3\2\2\2C\u00c7\3\2\2\2E\u00d4\3\2\2\2G\u00e7\3\2\2\2I\u00eb\3\2\2\2K"+
		"\u00ef\3\2\2\2M\u00f8\3\2\2\2O\u02c0\3\2\2\2Q\u03ef\3\2\2\2S\u0423\3\2"+
		"\2\2U\u0425\3\2\2\2WX\7?\2\2X\4\3\2\2\2YZ\7=\2\2Z\6\3\2\2\2[\\\7@\2\2"+
		"\\\b\3\2\2\2]^\7>\2\2^\n\3\2\2\2_`\7@\2\2`a\7?\2\2a\f\3\2\2\2bc\7>\2\2"+
		"cd\7?\2\2d\16\3\2\2\2ef\7?\2\2fg\7?\2\2g\20\3\2\2\2hi\7c\2\2ij\7p\2\2"+
		"jk\7f\2\2k\22\3\2\2\2lm\7q\2\2mn\7t\2\2n\24\3\2\2\2op\7p\2\2pq\7q\2\2"+
		"qr\7v\2\2r\26\3\2\2\2st\7*\2\2t\30\3\2\2\2uv\7+\2\2v\32\3\2\2\2wx\7h\2"+
		"\2xy\7t\2\2yz\7q\2\2z{\7o\2\2{\34\3\2\2\2|}\7v\2\2}~\7q\2\2~\36\3\2\2"+
		"\2\177\u0080\7}\2\2\u0080 \3\2\2\2\u0081\u0082\7\177\2\2\u0082\"\3\2\2"+
		"\2\u0083\u0084\7,\2\2\u0084$\3\2\2\2\u0085\u0086\7\61\2\2\u0086&\3\2\2"+
		"\2\u0087\u0088\7/\2\2\u0088(\3\2\2\2\u0089\u008a\7-\2\2\u008a*\3\2\2\2"+
		"\u008b\u008c\7\'\2\2\u008c,\3\2\2\2\u008d\u008e\7r\2\2\u008e\u008f\7t"+
		"\2\2\u008f\u0090\7k\2\2\u0090\u0091\7p\2\2\u0091\u0092\7v\2\2\u0092.\3"+
		"\2\2\2\u0093\u0094\7v\2\2\u0094\u0095\7t\2\2\u0095\u0096\7w\2\2\u0096"+
		"\u0097\7g\2\2\u0097\60\3\2\2\2\u0098\u0099\7h\2\2\u0099\u009a\7c\2\2\u009a"+
		"\u009b\7n\2\2\u009b\u009c\7u\2\2\u009c\u009d\7g\2\2\u009d\62\3\2\2\2\u009e"+
		"\u009f\t\2\2\2\u009f\64\3\2\2\2\u00a0\u00a1\4\62;\2\u00a1\66\3\2\2\2\u00a2"+
		"\u00a3\t\3\2\2\u00a38\3\2\2\2\u00a4\u00a5\t\4\2\2\u00a5\u00a6\3\2\2\2"+
		"\u00a6\u00a7\b\35\2\2\u00a7:\3\2\2\2\u00a8\u00a9\7h\2\2\u00a9\u00aa\7"+
		"q\2\2\u00aa\u00ab\7t\2\2\u00ab<\3\2\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae"+
		"\7h\2\2\u00ae>\3\2\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7n\2\2\u00b1\u00b2"+
		"\7u\2\2\u00b2\u00b3\7g\2\2\u00b3@\3\2\2\2\u00b4\u00b7\7&\2\2\u00b5\u00b8"+
		"\5\63\32\2\u00b6\u00b8\5\65\33\2\u00b7\u00b5\3\2\2\2\u00b7\u00b6\3\2\2"+
		"\2\u00b8\u00b9\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00baB"+
		"\3\2\2\2\u00bb\u00bc\7%\2\2\u00bc\u00bd\5\67\34\2\u00bd\u00be\5\67\34"+
		"\2\u00be\u00bf\5\67\34\2\u00bf\u00c8\3\2\2\2\u00c0\u00c1\5\67\34\2\u00c1"+
		"\u00c2\5\67\34\2\u00c2\u00c3\5\67\34\2\u00c3\u00c4\5\67\34\2\u00c4\u00c5"+
		"\5\67\34\2\u00c5\u00c6\5\67\34\2\u00c6\u00c8\3\2\2\2\u00c7\u00bb\3\2\2"+
		"\2\u00c7\u00c0\3\2\2\2\u00c8D\3\2\2\2\u00c9\u00d5\5O(\2\u00ca\u00cb\t"+
		"\5\2\2\u00cb\u00d0\5\63\32\2\u00cc\u00cf\5\63\32\2\u00cd\u00cf\5\65\33"+
		"\2\u00ce\u00cc\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce"+
		"\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d5\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3"+
		"\u00d5\7,\2\2\u00d4\u00c9\3\2\2\2\u00d4\u00ca\3\2\2\2\u00d4\u00d3\3\2"+
		"\2\2\u00d5\u00e3\3\2\2\2\u00d6\u00e2\5Q)\2\u00d7\u00d8\5S*\2\u00d8\u00dc"+
		"\7*\2\2\u00d9\u00db\13\2\2\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00dc\3\2"+
		"\2\2\u00df\u00e0\7+\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00d6\3\2\2\2\u00e1"+
		"\u00d7\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4F\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e8\5\63\32\2\u00e7\u00e6"+
		"\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"H\3\2\2\2\u00eb\u00ec\5K&\2\u00ec\u00ed\5M\'\2\u00edJ\3\2\2\2\u00ee\u00f0"+
		"\5\65\33\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00ef\3\2\2\2"+
		"\u00f1\u00f2\3\2\2\2\u00f2L\3\2\2\2\u00f3\u00f4\7g\2\2\u00f4\u00f9\7o"+
		"\2\2\u00f5\u00f6\7r\2\2\u00f6\u00f9\7z\2\2\u00f7\u00f9\7\'\2\2\u00f8\u00f3"+
		"\3\2\2\2\u00f8\u00f5\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9N\3\2\2\2\u00fa"+
		"\u02c1\7c\2\2\u00fb\u00fc\7c\2\2\u00fc\u00fd\7d\2\2\u00fd\u00fe\7d\2\2"+
		"\u00fe\u02c1\7t\2\2\u00ff\u0100\7c\2\2\u0100\u0101\7e\2\2\u0101\u0102"+
		"\7t\2\2\u0102\u0103\7q\2\2\u0103\u0104\7p\2\2\u0104\u0105\7{\2\2\u0105"+
		"\u02c1\7o\2\2\u0106\u0107\7c\2\2\u0107\u0108\7f\2\2\u0108\u0109\7f\2\2"+
		"\u0109\u010a\7t\2\2\u010a\u010b\7g\2\2\u010b\u010c\7u\2\2\u010c\u02c1"+
		"\7u\2\2\u010d\u010e\7c\2\2\u010e\u010f\7r\2\2\u010f\u0110\7r\2\2\u0110"+
		"\u0111\7n\2\2\u0111\u0112\7g\2\2\u0112\u02c1\7v\2\2\u0113\u0114\7c\2\2"+
		"\u0114\u0115\7t\2\2\u0115\u0116\7g\2\2\u0116\u02c1\7c\2\2\u0117\u02c1"+
		"\7d\2\2\u0118\u0119\7d\2\2\u0119\u011a\7c\2\2\u011a\u011b\7u\2\2\u011b"+
		"\u02c1\7g\2\2\u011c\u011d\7d\2\2\u011d\u011e\7c\2\2\u011e\u011f\7u\2\2"+
		"\u011f\u0120\7g\2\2\u0120\u0121\7h\2\2\u0121\u0122\7q\2\2\u0122\u0123"+
		"\7p\2\2\u0123\u02c1\7v\2\2\u0124\u0125\7d\2\2\u0125\u0126\7f\2\2\u0126"+
		"\u02c1\7q\2\2\u0127\u0128\7d\2\2\u0128\u0129\7k\2\2\u0129\u02c1\7i\2\2"+
		"\u012a\u012b\7d\2\2\u012b\u012c\7n\2\2\u012c\u012d\7q\2\2\u012d\u012e"+
		"\7e\2\2\u012e\u012f\7m\2\2\u012f\u0130\7s\2\2\u0130\u0131\7w\2\2\u0131"+
		"\u0132\7q\2\2\u0132\u0133\7v\2\2\u0133\u02c1\7g\2\2\u0134\u0135\7d\2\2"+
		"\u0135\u0136\7q\2\2\u0136\u0137\7f\2\2\u0137\u02c1\7{\2\2\u0138\u0139"+
		"\7d\2\2\u0139\u02c1\7t\2\2\u013a\u013b\7d\2\2\u013b\u013c\7w\2\2\u013c"+
		"\u013d\7v\2\2\u013d\u013e\7v\2\2\u013e\u013f\7q\2\2\u013f\u02c1\7p\2\2"+
		"\u0140\u0141\7e\2\2\u0141\u0142\7c\2\2\u0142\u0143\7r\2\2\u0143\u0144"+
		"\7v\2\2\u0144\u0145\7k\2\2\u0145\u0146\7q\2\2\u0146\u02c1\7p\2\2\u0147"+
		"\u0148\7e\2\2\u0148\u0149\7g\2\2\u0149\u014a\7p\2\2\u014a\u014b\7v\2\2"+
		"\u014b\u014c\7g\2\2\u014c\u02c1\7t\2\2\u014d\u014e\7e\2\2\u014e\u014f"+
		"\7k\2\2\u014f\u0150\7v\2\2\u0150\u02c1\7g\2\2\u0151\u0152\7e\2\2\u0152"+
		"\u0153\7q\2\2\u0153\u0154\7f\2\2\u0154\u02c1\7g\2\2\u0155\u0156\7e\2\2"+
		"\u0156\u0157\7q\2\2\u0157\u02c1\7n\2\2\u0158\u0159\7e\2\2\u0159\u015a"+
		"\7q\2\2\u015a\u015b\7n\2\2\u015b\u015c\7i\2\2\u015c\u015d\7t\2\2\u015d"+
		"\u015e\7q\2\2\u015e\u015f\7w\2\2\u015f\u02c1\7r\2\2\u0160\u0161\7f\2\2"+
		"\u0161\u02c1\7f\2\2\u0162\u0163\7f\2\2\u0163\u0164\7g\2\2\u0164\u02c1"+
		"\7n\2\2\u0165\u0166\7f\2\2\u0166\u0167\7h\2\2\u0167\u02c1\7p\2\2\u0168"+
		"\u0169\7f\2\2\u0169\u016a\7k\2\2\u016a\u02c1\7t\2\2\u016b\u016c\7f\2\2"+
		"\u016c\u016d\7k\2\2\u016d\u02c1\7x\2\2\u016e\u016f\7f\2\2\u016f\u02c1"+
		"\7n\2\2\u0170\u0171\7f\2\2\u0171\u02c1\7v\2\2\u0172\u0173\7g\2\2\u0173"+
		"\u02c1\7o\2\2\u0174\u0175\7h\2\2\u0175\u0176\7k\2\2\u0176\u0177\7g\2\2"+
		"\u0177\u0178\7n\2\2\u0178\u0179\7f\2\2\u0179\u017a\7u\2\2\u017a\u017b"+
		"\7g\2\2\u017b\u02c1\7v\2\2\u017c\u017d\7h\2\2\u017d\u017e\7q\2\2\u017e"+
		"\u017f\7p\2\2\u017f\u02c1\7v\2\2\u0180\u0181\7h\2\2\u0181\u0182\7q\2\2"+
		"\u0182\u0183\7t\2\2\u0183\u02c1\7o\2\2\u0184\u0185\7h\2\2\u0185\u0186"+
		"\7t\2\2\u0186\u0187\7c\2\2\u0187\u0188\7o\2\2\u0188\u02c1\7g\2\2\u0189"+
		"\u018a\7h\2\2\u018a\u018b\7t\2\2\u018b\u018c\7c\2\2\u018c\u018d\7o\2\2"+
		"\u018d\u018e\7g\2\2\u018e\u018f\7u\2\2\u018f\u0190\7g\2\2\u0190\u02c1"+
		"\7v\2\2\u0191\u0192\7j\2\2\u0192\u02c1\7\63\2\2\u0193\u0194\7j\2\2\u0194"+
		"\u02c1\7\64\2\2\u0195\u0196\7j\2\2\u0196\u02c1\7\65\2\2\u0197\u0198\7"+
		"j\2\2\u0198\u02c1\7\66\2\2\u0199\u019a\7j\2\2\u019a\u02c1\7\67\2\2\u019b"+
		"\u019c\7j\2\2\u019c\u02c1\78\2\2\u019d\u019e\7j\2\2\u019e\u019f\7g\2\2"+
		"\u019f\u01a0\7c\2\2\u01a0\u02c1\7f\2\2\u01a1\u01a2\7j\2\2\u01a2\u02c1"+
		"\7t\2\2\u01a3\u01a4\7j\2\2\u01a4\u01a5\7v\2\2\u01a5\u01a6\7o\2\2\u01a6"+
		"\u02c1\7n\2\2\u01a7\u02c1\7k\2\2\u01a8\u01a9\7k\2\2\u01a9\u01aa\7h\2\2"+
		"\u01aa\u01ab\7t\2\2\u01ab\u01ac\7c\2\2\u01ac\u01ad\7o\2\2\u01ad\u02c1"+
		"\7g\2\2\u01ae\u01af\7k\2\2\u01af\u01b0\7p\2\2\u01b0\u01b1\7r\2\2\u01b1"+
		"\u01b2\7w\2\2\u01b2\u02c1\7v\2\2\u01b3\u01b4\7k\2\2\u01b4\u01b5\7p\2\2"+
		"\u01b5\u02c1\7u\2\2\u01b6\u01b7\7k\2\2\u01b7\u01b8\7u\2\2\u01b8\u01b9"+
		"\7k\2\2\u01b9\u01ba\7p\2\2\u01ba\u01bb\7f\2\2\u01bb\u01bc\7g\2\2\u01bc"+
		"\u02c1\7z\2\2\u01bd\u01be\7m\2\2\u01be\u01bf\7d\2\2\u01bf\u02c1\7f\2\2"+
		"\u01c0\u01c1\7n\2\2\u01c1\u01c2\7c\2\2\u01c2\u01c3\7d\2\2\u01c3\u01c4"+
		"\7g\2\2\u01c4\u02c1\7n\2\2\u01c5\u01c6\7n\2\2\u01c6\u01c7\7g\2\2\u01c7"+
		"\u01c8\7i\2\2\u01c8\u01c9\7g\2\2\u01c9\u01ca\7p\2\2\u01ca\u02c1\7f\2\2"+
		"\u01cb\u01cc\7n\2\2\u01cc\u02c1\7k\2\2\u01cd\u01ce\7n\2\2\u01ce\u01cf"+
		"\7k\2\2\u01cf\u01d0\7p\2\2\u01d0\u02c1\7m\2\2\u01d1\u01d2\7o\2\2\u01d2"+
		"\u01d3\7c\2\2\u01d3\u02c1\7r\2\2\u01d4\u01d5\7o\2\2\u01d5\u01d6\7g\2\2"+
		"\u01d6\u01d7\7p\2\2\u01d7\u02c1\7w\2\2\u01d8\u01d9\7o\2\2\u01d9\u01da"+
		"\7g\2\2\u01da\u01db\7v\2\2\u01db\u02c1\7c\2\2\u01dc\u01dd\7p\2\2\u01dd"+
		"\u01de\7q\2\2\u01de\u01df\7h\2\2\u01df\u01e0\7t\2\2\u01e0\u01e1\7c\2\2"+
		"\u01e1\u01e2\7o\2\2\u01e2\u01e3\7g\2\2\u01e3\u02c1\7u\2\2\u01e4\u01e5"+
		"\7p\2\2\u01e5\u01e6\7q\2\2\u01e6\u01e7\7u\2\2\u01e7\u01e8\7e\2\2\u01e8"+
		"\u01e9\7t\2\2\u01e9\u01ea\7k\2\2\u01ea\u01eb\7r\2\2\u01eb\u02c1\7v\2\2"+
		"\u01ec\u01ed\7q\2\2\u01ed\u01ee\7d\2\2\u01ee\u01ef\7l\2\2\u01ef\u01f0"+
		"\7g\2\2\u01f0\u01f1\7e\2\2\u01f1\u02c1\7v\2\2\u01f2\u01f3\7q\2\2\u01f3"+
		"\u02c1\7n\2\2\u01f4\u01f5\7q\2\2\u01f5\u01f6\7r\2\2\u01f6\u01f7\7v\2\2"+
		"\u01f7\u01f8\7i\2\2\u01f8\u01f9\7t\2\2\u01f9\u01fa\7q\2\2\u01fa\u01fb"+
		"\7w\2\2\u01fb\u02c1\7r\2\2\u01fc\u01fd\7q\2\2\u01fd\u01fe\7r\2\2\u01fe"+
		"\u01ff\7v\2\2\u01ff\u0200\7k\2\2\u0200\u0201\7q\2\2\u0201\u02c1\7p\2\2"+
		"\u0202\u02c1\7r\2\2\u0203\u0204\7r\2\2\u0204\u0205\7c\2\2\u0205\u0206"+
		"\7t\2\2\u0206\u0207\7c\2\2\u0207\u02c1\7o\2\2\u0208\u0209\7r\2\2\u0209"+
		"\u020a\7t\2\2\u020a\u02c1\7g\2\2\u020b\u02c1\t\6\2\2\u020c\u020d\7u\2"+
		"\2\u020d\u020e\7c\2\2\u020e\u020f\7o\2\2\u020f\u02c1\7r\2\2\u0210\u0211"+
		"\7u\2\2\u0211\u0212\7e\2\2\u0212\u0213\7t\2\2\u0213\u0214\7k\2\2\u0214"+
		"\u0215\7r\2\2\u0215\u02c1\7v\2\2\u0216\u0217\7u\2\2\u0217\u0218\7g\2\2"+
		"\u0218\u0219\7n\2\2\u0219\u021a\7g\2\2\u021a\u021b\7e\2\2\u021b\u02c1"+
		"\7v\2\2\u021c\u021d\7u\2\2\u021d\u021e\7o\2\2\u021e\u021f\7c\2\2\u021f"+
		"\u0220\7n\2\2\u0220\u02c1\7n\2\2\u0221\u0222\7u\2\2\u0222\u0223\7r\2\2"+
		"\u0223\u0224\7c\2\2\u0224\u02c1\7p\2\2\u0225\u0226\7u\2\2\u0226\u0227"+
		"\7v\2\2\u0227\u0228\7t\2\2\u0228\u0229\7k\2\2\u0229\u022a\7m\2\2\u022a"+
		"\u02c1\7g\2\2\u022b\u022c\7u\2\2\u022c\u022d\7v\2\2\u022d\u022e\7t\2\2"+
		"\u022e\u022f\7q\2\2\u022f\u0230\7p\2\2\u0230\u02c1\7i\2\2\u0231\u0232"+
		"\7u\2\2\u0232\u0233\7v\2\2\u0233\u0234\7{\2\2\u0234\u0235\7n\2\2\u0235"+
		"\u02c1\7g\2\2\u0236\u0237\7u\2\2\u0237\u0238\7w\2\2\u0238\u02c1\7d\2\2"+
		"\u0239\u023a\7u\2\2\u023a\u023b\7w\2\2\u023b\u02c1\7r\2\2\u023c\u023d"+
		"\7v\2\2\u023d\u023e\7c\2\2\u023e\u023f\7d\2\2\u023f\u0240\7n\2\2\u0240"+
		"\u02c1\7g\2\2\u0241\u0242\7v\2\2\u0242\u0243\7d\2\2\u0243\u0244\7q\2\2"+
		"\u0244\u0245\7f\2\2\u0245\u02c1\7{\2\2\u0246\u0247\7v\2\2\u0247\u02c1"+
		"\7f\2\2\u0248\u0249\7v\2\2\u0249\u024a\7g\2\2\u024a\u024b\7z\2\2\u024b"+
		"\u024c\7v\2\2\u024c\u024d\7c\2\2\u024d\u024e\7t\2\2\u024e\u024f\7g\2\2"+
		"\u024f\u02c1\7c\2\2\u0250\u0251\7v\2\2\u0251\u0252\7h\2\2\u0252\u0253"+
		"\7q\2\2\u0253\u0254\7q\2\2\u0254\u02c1\7v\2\2\u0255\u0256\7v\2\2\u0256"+
		"\u02c1\7j\2\2\u0257\u0258\7v\2\2\u0258\u0259\7j\2\2\u0259\u025a\7g\2\2"+
		"\u025a\u025b\7c\2\2\u025b\u02c1\7f\2\2\u025c\u025d\7v\2\2\u025d\u025e"+
		"\7k\2\2\u025e\u025f\7v\2\2\u025f\u0260\7n\2\2\u0260\u02c1\7g\2\2\u0261"+
		"\u0262\7v\2\2\u0262\u02c1\7t\2\2\u0263\u0264\7v\2\2\u0264\u02c1\7v\2\2"+
		"\u0265\u02c1\7w\2\2\u0266\u0267\7w\2\2\u0267\u02c1\7n\2\2\u0268\u0269"+
		"\7x\2\2\u0269\u026a\7c\2\2\u026a\u02c1\7t\2\2\u026b\u026c\7j\2\2\u026c"+
		"\u026d\7g\2\2\u026d\u026e\7c\2\2\u026e\u026f\7f\2\2\u026f\u0270\7g\2\2"+
		"\u0270\u02c1\7t\2\2\u0271\u0272\7j\2\2\u0272\u0273\7i\2\2\u0273\u0274"+
		"\7t\2\2\u0274\u0275\7q\2\2\u0275\u0276\7w\2\2\u0276\u02c1\7r\2\2\u0277"+
		"\u0278\7p\2\2\u0278\u0279\7c\2\2\u0279\u02c1\7x\2\2\u027a\u027b\7c\2\2"+
		"\u027b\u027c\7t\2\2\u027c\u027d\7v\2\2\u027d\u027e\7k\2\2\u027e\u027f"+
		"\7e\2\2\u027f\u0280\7n\2\2\u0280\u02c1\7g\2\2\u0281\u0282\7u\2\2\u0282"+
		"\u0283\7g\2\2\u0283\u0284\7e\2\2\u0284\u0285\7v\2\2\u0285\u0286\7k\2\2"+
		"\u0286\u0287\7q\2\2\u0287\u02c1\7p\2\2\u0288\u0289\7c\2\2\u0289\u028a"+
		"\7u\2\2\u028a\u028b\7k\2\2\u028b\u028c\7f\2\2\u028c\u02c1\7g\2\2\u028d"+
		"\u028e\7h\2\2\u028e\u028f\7q\2\2\u028f\u0290\7q\2\2\u0290\u0291\7v\2\2"+
		"\u0291\u0292\7g\2\2\u0292\u02c1\7t\2\2\u0293\u0294\7c\2\2\u0294\u0295"+
		"\7f\2\2\u0295\u0296\7f\2\2\u0296\u0297\7t\2\2\u0297\u0298\7g\2\2\u0298"+
		"\u0299\7u\2\2\u0299\u02c1\7u\2\2\u029a\u029b\7h\2\2\u029b\u029c\7k\2\2"+
		"\u029c\u029d\7i\2\2\u029d\u029e\7w\2\2\u029e\u029f\7t\2\2\u029f\u02c1"+
		"\7g\2\2\u02a0\u02a1\7h\2\2\u02a1\u02a2\7k\2\2\u02a2\u02a3\7i\2\2\u02a3"+
		"\u02a4\7e\2\2\u02a4\u02a5\7c\2\2\u02a5\u02a6\7r\2\2\u02a6\u02a7\7v\2\2"+
		"\u02a7\u02a8\7k\2\2\u02a8\u02a9\7q\2\2\u02a9\u02c1\7p\2\2\u02aa\u02ab"+
		"\7t\2\2\u02ab\u02c1\7r\2\2\u02ac\u02ad\7t\2\2\u02ad\u02c1\7v\2\2\u02ae"+
		"\u02af\7t\2\2\u02af\u02b0\7w\2\2\u02b0\u02b1\7d\2\2\u02b1\u02c1\7{\2\2"+
		"\u02b2\u02b3\7v\2\2\u02b3\u02b4\7k\2\2\u02b4\u02b5\7o\2\2\u02b5\u02c1"+
		"\7g\2\2\u02b6\u02b7\7o\2\2\u02b7\u02b8\7c\2\2\u02b8\u02b9\7t\2\2\u02b9"+
		"\u02c1\7m\2\2\u02ba\u02bb\7d\2\2\u02bb\u02bc\7f\2\2\u02bc\u02c1\7k\2\2"+
		"\u02bd\u02be\7y\2\2\u02be\u02bf\7d\2\2\u02bf\u02c1\7t\2\2\u02c0\u00fa"+
		"\3\2\2\2\u02c0\u00fb\3\2\2\2\u02c0\u00ff\3\2\2\2\u02c0\u0106\3\2\2\2\u02c0"+
		"\u010d\3\2\2\2\u02c0\u0113\3\2\2\2\u02c0\u0117\3\2\2\2\u02c0\u0118\3\2"+
		"\2\2\u02c0\u011c\3\2\2\2\u02c0\u0124\3\2\2\2\u02c0\u0127\3\2\2\2\u02c0"+
		"\u012a\3\2\2\2\u02c0\u0134\3\2\2\2\u02c0\u0138\3\2\2\2\u02c0\u013a\3\2"+
		"\2\2\u02c0\u0140\3\2\2\2\u02c0\u0147\3\2\2\2\u02c0\u014d\3\2\2\2\u02c0"+
		"\u0151\3\2\2\2\u02c0\u0155\3\2\2\2\u02c0\u0158\3\2\2\2\u02c0\u0160\3\2"+
		"\2\2\u02c0\u0162\3\2\2\2\u02c0\u0165\3\2\2\2\u02c0\u0168\3\2\2\2\u02c0"+
		"\u016b\3\2\2\2\u02c0\u016e\3\2\2\2\u02c0\u0170\3\2\2\2\u02c0\u0172\3\2"+
		"\2\2\u02c0\u0174\3\2\2\2\u02c0\u017c\3\2\2\2\u02c0\u0180\3\2\2\2\u02c0"+
		"\u0184\3\2\2\2\u02c0\u0189\3\2\2\2\u02c0\u0191\3\2\2\2\u02c0\u0193\3\2"+
		"\2\2\u02c0\u0195\3\2\2\2\u02c0\u0197\3\2\2\2\u02c0\u0199\3\2\2\2\u02c0"+
		"\u019b\3\2\2\2\u02c0\u019d\3\2\2\2\u02c0\u01a1\3\2\2\2\u02c0\u01a3\3\2"+
		"\2\2\u02c0\u01a7\3\2\2\2\u02c0\u01a8\3\2\2\2\u02c0\u01ae\3\2\2\2\u02c0"+
		"\u01b3\3\2\2\2\u02c0\u01b6\3\2\2\2\u02c0\u01bd\3\2\2\2\u02c0\u01c0\3\2"+
		"\2\2\u02c0\u01c5\3\2\2\2\u02c0\u01cb\3\2\2\2\u02c0\u01cd\3\2\2\2\u02c0"+
		"\u01d1\3\2\2\2\u02c0\u01d4\3\2\2\2\u02c0\u01d8\3\2\2\2\u02c0\u01dc\3\2"+
		"\2\2\u02c0\u01e4\3\2\2\2\u02c0\u01ec\3\2\2\2\u02c0\u01f2\3\2\2\2\u02c0"+
		"\u01f4\3\2\2\2\u02c0\u01fc\3\2\2\2\u02c0\u0202\3\2\2\2\u02c0\u0203\3\2"+
		"\2\2\u02c0\u0208\3\2\2\2\u02c0\u020b\3\2\2\2\u02c0\u020c\3\2\2\2\u02c0"+
		"\u0210\3\2\2\2\u02c0\u0216\3\2\2\2\u02c0\u021c\3\2\2\2\u02c0\u0221\3\2"+
		"\2\2\u02c0\u0225\3\2\2\2\u02c0\u022b\3\2\2\2\u02c0\u0231\3\2\2\2\u02c0"+
		"\u0236\3\2\2\2\u02c0\u0239\3\2\2\2\u02c0\u023c\3\2\2\2\u02c0\u0241\3\2"+
		"\2\2\u02c0\u0246\3\2\2\2\u02c0\u0248\3\2\2\2\u02c0\u0250\3\2\2\2\u02c0"+
		"\u0255\3\2\2\2\u02c0\u0257\3\2\2\2\u02c0\u025c\3\2\2\2\u02c0\u0261\3\2"+
		"\2\2\u02c0\u0263\3\2\2\2\u02c0\u0265\3\2\2\2\u02c0\u0266\3\2\2\2\u02c0"+
		"\u0268\3\2\2\2\u02c0\u026b\3\2\2\2\u02c0\u0271\3\2\2\2\u02c0\u0277\3\2"+
		"\2\2\u02c0\u027a\3\2\2\2\u02c0\u0281\3\2\2\2\u02c0\u0288\3\2\2\2\u02c0"+
		"\u028d\3\2\2\2\u02c0\u0293\3\2\2\2\u02c0\u029a\3\2\2\2\u02c0\u02a0\3\2"+
		"\2\2\u02c0\u02aa\3\2\2\2\u02c0\u02ac\3\2\2\2\u02c0\u02ae\3\2\2\2\u02c0"+
		"\u02b2\3\2\2\2\u02c0\u02b6\3\2\2\2\u02c0\u02ba\3\2\2\2\u02c0\u02bd\3\2"+
		"\2\2\u02c1P\3\2\2\2\u02c2\u02c3\7<\2\2\u02c3\u02c4\7c\2\2\u02c4\u02c5"+
		"\7e\2\2\u02c5\u02c6\7v\2\2\u02c6\u02c7\7k\2\2\u02c7\u02c8\7x\2\2\u02c8"+
		"\u03f0\7g\2\2\u02c9\u02ca\7<\2\2\u02ca\u02cb\7c\2\2\u02cb\u02cc\7p\2\2"+
		"\u02cc\u03f0\7{\2\2\u02cd\u02ce\7<\2\2\u02ce\u02cf\7e\2\2\u02cf\u02d0"+
		"\7j\2\2\u02d0\u02d1\7g\2\2\u02d1\u02d2\7e\2\2\u02d2\u02d3\7m\2\2\u02d3"+
		"\u02d4\7g\2\2\u02d4\u03f0\7f\2\2\u02d5\u02d6\7<\2\2\u02d6\u02d7\7f\2\2"+
		"\u02d7\u02d8\7g\2\2\u02d8\u02d9\7h\2\2\u02d9\u02da\7c\2\2\u02da\u02db"+
		"\7w\2\2\u02db\u02dc\7n\2\2\u02dc\u03f0\7v\2\2\u02dd\u02de\7<\2\2\u02de"+
		"\u02df\7f\2\2\u02df\u02e0\7k\2\2\u02e0\u02e1\7u\2\2\u02e1\u02e2\7c\2\2"+
		"\u02e2\u02e3\7d\2\2\u02e3\u02e4\7n\2\2\u02e4\u02e5\7g\2\2\u02e5\u03f0"+
		"\7f\2\2\u02e6\u02e7\7<\2\2\u02e7\u02e8\7g\2\2\u02e8\u02e9\7o\2\2\u02e9"+
		"\u02ea\7r\2\2\u02ea\u02eb\7v\2\2\u02eb\u03f0\7{\2\2\u02ec\u02ed\7<\2\2"+
		"\u02ed\u02ee\7g\2\2\u02ee\u02ef\7p\2\2\u02ef\u02f0\7c\2\2\u02f0\u02f1"+
		"\7d\2\2\u02f1\u02f2\7n\2\2\u02f2\u02f3\7g\2\2\u02f3\u03f0\7f\2\2\u02f4"+
		"\u02f5\7<\2\2\u02f5\u02f6\7h\2\2\u02f6\u02f7\7k\2\2\u02f7\u02f8\7t\2\2"+
		"\u02f8\u02f9\7u\2\2\u02f9\u03f0\7v\2\2\u02fa\u02fb\7<\2\2\u02fb\u02fc"+
		"\7h\2\2\u02fc\u02fd\7k\2\2\u02fd\u02fe\7t\2\2\u02fe\u02ff\7u\2\2\u02ff"+
		"\u0300\7v\2\2\u0300\u0301\7/\2\2\u0301\u0302\7e\2\2\u0302\u0303\7j\2\2"+
		"\u0303\u0304\7k\2\2\u0304\u0305\7n\2\2\u0305\u03f0\7f\2\2\u0306\u0307"+
		"\7<\2\2\u0307\u0308\7h\2\2\u0308\u0309\7k\2\2\u0309\u030a\7t\2\2\u030a"+
		"\u030b\7u\2\2\u030b\u030c\7v\2\2\u030c\u030d\7/\2\2\u030d\u030e\7q\2\2"+
		"\u030e\u030f\7h\2\2\u030f\u0310\7/\2\2\u0310\u0311\7v\2\2\u0311\u0312"+
		"\7{\2\2\u0312\u0313\7r\2\2\u0313\u03f0\7g\2\2\u0314\u0315\7<\2\2\u0315"+
		"\u0316\7h\2\2\u0316\u0317\7w\2\2\u0317\u0318\7n\2\2\u0318\u0319\7n\2\2"+
		"\u0319\u031a\7u\2\2\u031a\u031b\7e\2\2\u031b\u031c\7t\2\2\u031c\u031d"+
		"\7g\2\2\u031d\u031e\7g\2\2\u031e\u03f0\7p\2\2\u031f\u0320\7<\2\2\u0320"+
		"\u0321\7h\2\2\u0321\u0322\7q\2\2\u0322\u0323\7e\2\2\u0323\u0324\7w\2\2"+
		"\u0324\u03f0\7u\2\2\u0325\u0326\7<\2\2\u0326\u0327\7j\2\2\u0327\u0328"+
		"\7q\2\2\u0328\u0329\7x\2\2\u0329\u032a\7g\2\2\u032a\u03f0\7t\2\2\u032b"+
		"\u032c\7<\2\2\u032c\u032d\7k\2\2\u032d\u032e\7p\2\2\u032e\u032f\7f\2\2"+
		"\u032f\u0330\7g\2\2\u0330\u0331\7v\2\2\u0331\u0332\7g\2\2\u0332\u0333"+
		"\7t\2\2\u0333\u0334\7o\2\2\u0334\u0335\7k\2\2\u0335\u0336\7p\2\2\u0336"+
		"\u0337\7c\2\2\u0337\u0338\7v\2\2\u0338\u03f0\7g\2\2\u0339\u033a\7<\2\2"+
		"\u033a\u033b\7k\2\2\u033b\u033c\7p\2\2\u033c\u033d\7/\2\2\u033d\u033e"+
		"\7t\2\2\u033e\u033f\7c\2\2\u033f\u0340\7p\2\2\u0340\u0341\7i\2\2\u0341"+
		"\u03f0\7g\2\2\u0342\u0343\7<\2\2\u0343\u0344\7k\2\2\u0344\u0345\7p\2\2"+
		"\u0345\u0346\7x\2\2\u0346\u0347\7c\2\2\u0347\u0348\7n\2\2\u0348\u0349"+
		"\7k\2\2\u0349\u03f0\7f\2\2\u034a\u034b\7<\2\2\u034b\u034c\7n\2\2\u034c"+
		"\u034d\7c\2\2\u034d\u034e\7u\2\2\u034e\u034f\7v\2\2\u034f\u0350\7/\2\2"+
		"\u0350\u0351\7e\2\2\u0351\u0352\7j\2\2\u0352\u0353\7k\2\2\u0353\u0354"+
		"\7n\2\2\u0354\u03f0\7f\2\2\u0355\u0356\7<\2\2\u0356\u0357\7n\2\2\u0357"+
		"\u0358\7c\2\2\u0358\u0359\7u\2\2\u0359\u035a\7v\2\2\u035a\u035b\7/\2\2"+
		"\u035b\u035c\7q\2\2\u035c\u035d\7h\2\2\u035d\u035e\7/\2\2\u035e\u035f"+
		"\7v\2\2\u035f\u0360\7{\2\2\u0360\u0361\7r\2\2\u0361\u03f0\7g\2\2\u0362"+
		"\u0363\7<\2\2\u0363\u0364\7n\2\2\u0364\u0365\7g\2\2\u0365\u0366\7h\2\2"+
		"\u0366\u03f0\7v\2\2\u0367\u0368\7<\2\2\u0368\u0369\7n\2\2\u0369\u036a"+
		"\7k\2\2\u036a\u036b\7p\2\2\u036b\u03f0\7m\2\2\u036c\u036d\7<\2\2\u036d"+
		"\u036e\7p\2\2\u036e\u036f\7v\2\2\u036f\u0370\7j\2\2\u0370\u0371\7/\2\2"+
		"\u0371\u0372\7n\2\2\u0372\u0373\7c\2\2\u0373\u0374\7u\2\2\u0374\u0375"+
		"\7v\2\2\u0375\u0376\7/\2\2\u0376\u0377\7q\2\2\u0377\u0378\7h\2\2\u0378"+
		"\u0379\7/\2\2\u0379\u037a\7v\2\2\u037a\u037b\7{\2\2\u037b\u037c\7r\2\2"+
		"\u037c\u03f0\7g\2\2\u037d\u037e\7<\2\2\u037e\u037f\7q\2\2\u037f\u0380"+
		"\7p\2\2\u0380\u0381\7n\2\2\u0381\u0382\7{\2\2\u0382\u0383\7/\2\2\u0383"+
		"\u0384\7e\2\2\u0384\u0385\7j\2\2\u0385\u0386\7k\2\2\u0386\u0387\7n\2\2"+
		"\u0387\u03f0\7f\2\2\u0388\u0389\7<\2\2\u0389\u038a\7q\2\2\u038a\u038b"+
		"\7p\2\2\u038b\u038c\7n\2\2\u038c\u038d\7{\2\2\u038d\u038e\7/\2\2\u038e"+
		"\u038f\7q\2\2\u038f\u0390\7h\2\2\u0390\u0391\7/\2\2\u0391\u0392\7v\2\2"+
		"\u0392\u0393\7{\2\2\u0393\u0394\7r\2\2\u0394\u03f0\7g\2\2\u0395\u0396"+
		"\7<\2\2\u0396\u0397\7q\2\2\u0397\u0398\7r\2\2\u0398\u0399\7v\2\2\u0399"+
		"\u039a\7k\2\2\u039a\u039b\7q\2\2\u039b\u039c\7p\2\2\u039c\u039d\7c\2\2"+
		"\u039d\u03f0\7n\2\2\u039e\u039f\7<\2\2\u039f\u03a0\7q\2\2\u03a0\u03a1"+
		"\7w\2\2\u03a1\u03a2\7v\2\2\u03a2\u03a3\7/\2\2\u03a3\u03a4\7q\2\2\u03a4"+
		"\u03a5\7h\2\2\u03a5\u03a6\7/\2\2\u03a6\u03a7\7t\2\2\u03a7\u03a8\7c\2\2"+
		"\u03a8\u03a9\7p\2\2\u03a9\u03aa\7i\2\2\u03aa\u03f0\7g\2\2\u03ab\u03ac"+
		"\7<\2\2\u03ac\u03ad\7t\2\2\u03ad\u03ae\7g\2\2\u03ae\u03af\7c\2\2\u03af"+
		"\u03b0\7f\2\2\u03b0\u03b1\7/\2\2\u03b1\u03b2\7q\2\2\u03b2\u03b3\7p\2\2"+
		"\u03b3\u03b4\7n\2\2\u03b4\u03f0\7{\2\2\u03b5\u03b6\7<\2\2\u03b6\u03b7"+
		"\7t\2\2\u03b7\u03b8\7g\2\2\u03b8\u03b9\7c\2\2\u03b9\u03ba\7f\2\2\u03ba"+
		"\u03bb\7/\2\2\u03bb\u03bc\7y\2\2\u03bc\u03bd\7t\2\2\u03bd\u03be\7k\2\2"+
		"\u03be\u03bf\7v\2\2\u03bf\u03f0\7g\2\2\u03c0\u03c1\7<\2\2\u03c1\u03c2"+
		"\7t\2\2\u03c2\u03c3\7g\2\2\u03c3\u03c4\7s\2\2\u03c4\u03c5\7w\2\2\u03c5"+
		"\u03c6\7k\2\2\u03c6\u03c7\7t\2\2\u03c7\u03c8\7g\2\2\u03c8\u03f0\7f\2\2"+
		"\u03c9\u03ca\7<\2\2\u03ca\u03cb\7t\2\2\u03cb\u03cc\7k\2\2\u03cc\u03cd"+
		"\7i\2\2\u03cd\u03ce\7j\2\2\u03ce\u03f0\7v\2\2\u03cf\u03d0\7<\2\2\u03d0"+
		"\u03d1\7t\2\2\u03d1\u03d2\7q\2\2\u03d2\u03d3\7q\2\2\u03d3\u03f0\7v\2\2"+
		"\u03d4\u03d5\7<\2\2\u03d5\u03d6\7u\2\2\u03d6\u03d7\7e\2\2\u03d7\u03d8"+
		"\7q\2\2\u03d8\u03d9\7r\2\2\u03d9\u03f0\7g\2\2\u03da\u03db\7<\2\2\u03db"+
		"\u03dc\7v\2\2\u03dc\u03dd\7c\2\2\u03dd\u03de\7t\2\2\u03de\u03df\7i\2\2"+
		"\u03df\u03e0\7g\2\2\u03e0\u03f0\7v\2\2\u03e1\u03e2\7<\2\2\u03e2\u03e3"+
		"\7x\2\2\u03e3\u03e4\7c\2\2\u03e4\u03e5\7n\2\2\u03e5\u03e6\7k\2\2\u03e6"+
		"\u03f0\7f\2\2\u03e7\u03e8\7<\2\2\u03e8\u03e9\7x\2\2\u03e9\u03ea\7k\2\2"+
		"\u03ea\u03eb\7u\2\2\u03eb\u03ec\7k\2\2\u03ec\u03ed\7v\2\2\u03ed\u03ee"+
		"\7g\2\2\u03ee\u03f0\7f\2\2\u03ef\u02c2\3\2\2\2\u03ef\u02c9\3\2\2\2\u03ef"+
		"\u02cd\3\2\2\2\u03ef\u02d5\3\2\2\2\u03ef\u02dd\3\2\2\2\u03ef\u02e6\3\2"+
		"\2\2\u03ef\u02ec\3\2\2\2\u03ef\u02f4\3\2\2\2\u03ef\u02fa\3\2\2\2\u03ef"+
		"\u0306\3\2\2\2\u03ef\u0314\3\2\2\2\u03ef\u031f\3\2\2\2\u03ef\u0325\3\2"+
		"\2\2\u03ef\u032b\3\2\2\2\u03ef\u0339\3\2\2\2\u03ef\u0342\3\2\2\2\u03ef"+
		"\u034a\3\2\2\2\u03ef\u0355\3\2\2\2\u03ef\u0362\3\2\2\2\u03ef\u0367\3\2"+
		"\2\2\u03ef\u036c\3\2\2\2\u03ef\u037d\3\2\2\2\u03ef\u0388\3\2\2\2\u03ef"+
		"\u0395\3\2\2\2\u03ef\u039e\3\2\2\2\u03ef\u03ab\3\2\2\2\u03ef\u03b5\3\2"+
		"\2\2\u03ef\u03c0\3\2\2\2\u03ef\u03c9\3\2\2\2\u03ef\u03cf\3\2\2\2\u03ef"+
		"\u03d4\3\2\2\2\u03ef\u03da\3\2\2\2\u03ef\u03e1\3\2\2\2\u03ef\u03e7\3\2"+
		"\2\2\u03f0R\3\2\2\2\u03f1\u03f2\7<\2\2\u03f2\u03f3\7f\2\2\u03f3\u03f4"+
		"\7k\2\2\u03f4\u0424\7t\2\2\u03f5\u03f6\7<\2\2\u03f6\u03f7\7n\2\2\u03f7"+
		"\u03f8\7c\2\2\u03f8\u03f9\7p\2\2\u03f9\u0424\7i\2\2\u03fa\u03fb\7<\2\2"+
		"\u03fb\u03fc\7p\2\2\u03fc\u03fd\7q\2\2\u03fd\u0424\7v\2\2\u03fe\u03ff"+
		"\7<\2\2\u03ff\u0400\7p\2\2\u0400\u0401\7v\2\2\u0401\u0402\7j\2\2\u0402"+
		"\u0403\7/\2\2\u0403\u0404\7e\2\2\u0404\u0405\7j\2\2\u0405\u0406\7k\2\2"+
		"\u0406\u0407\7n\2\2\u0407\u0424\7f\2\2\u0408\u0409\7<\2\2\u0409\u040a"+
		"\7p\2\2\u040a\u040b\7v\2\2\u040b\u040c\7j\2\2\u040c\u040d\7/\2\2\u040d"+
		"\u040e\7n\2\2\u040e\u040f\7c\2\2\u040f\u0410\7u\2\2\u0410\u0411\7v\2\2"+
		"\u0411\u0412\7/\2\2\u0412\u0413\7e\2\2\u0413\u0414\7j\2\2\u0414\u0415"+
		"\7k\2\2\u0415\u0416\7n\2\2\u0416\u0424\7f\2\2\u0417\u0418\7<\2\2\u0418"+
		"\u0419\7p\2\2\u0419\u041a\7v\2\2\u041a\u041b\7j\2\2\u041b\u041c\7/\2\2"+
		"\u041c\u041d\7q\2\2\u041d\u041e\7h\2\2\u041e\u041f\7/\2\2\u041f\u0420"+
		"\7v\2\2\u0420\u0421\7{\2\2\u0421\u0422\7r\2\2\u0422\u0424\7g\2\2\u0423"+
		"\u03f1\3\2\2\2\u0423\u03f5\3\2\2\2\u0423\u03fa\3\2\2\2\u0423\u03fe\3\2"+
		"\2\2\u0423\u0408\3\2\2\2\u0423\u0417\3\2\2\2\u0424T\3\2\2\2\u0425\u0429"+
		"\7$\2\2\u0426\u0428\13\2\2\2\u0427\u0426\3\2\2\2\u0428\u042b\3\2\2\2\u0429"+
		"\u042a\3\2\2\2\u0429\u0427\3\2\2\2\u042a\u042c\3\2\2\2\u042b\u0429\3\2"+
		"\2\2\u042c\u042d\7$\2\2\u042dV\3\2\2\2\23\2\u00b7\u00b9\u00c7\u00ce\u00d0"+
		"\u00d4\u00dc\u00e1\u00e3\u00e9\u00f1\u00f8\u02c0\u03ef\u0423\u0429\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}