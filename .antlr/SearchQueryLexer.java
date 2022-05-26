// Generated from /home/meet/Meet/Search Query/SearchQuery.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SearchQueryLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHITESPACE=1, SEPERATOR=2, COMMAND=3, TOP=4, HIGHEST=5, LAST=6, LEAST=7, 
		COUNTERTYPE=8, SOURCETYPESOURCE=9, SOURCETYPEIP=10, SOURCETYPEGROUP=11, 
		TIMELINE=12, QUOTEDIP=13, ONLYIP=14, DIGITS=15, QUOTEDVALUE=16, VALUE=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"S", "H", "O", "W", "U", "R", "C", "E", "I", "P", "G", "M", "T", "L", 
			"F", "A", "D", "Y", "V", "DIGIT", "UPPERCASE", "LOWERCASE", "OCTATE", 
			"METRIC", "LOG", "FLOW", "LASTHOUR", "TODAY", "IP", "WHITESPACE", "SEPERATOR", 
			"COMMAND", "TOP", "HIGHEST", "LAST", "LEAST", "COUNTERTYPE", "SOURCETYPESOURCE", 
			"SOURCETYPEIP", "SOURCETYPEGROUP", "TIMELINE", "QUOTEDIP", "ONLYIP", 
			"DIGITS", "QUOTEDVALUE", "VALUE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WHITESPACE", "SEPERATOR", "COMMAND", "TOP", "HIGHEST", "LAST", 
			"LEAST", "COUNTERTYPE", "SOURCETYPESOURCE", "SOURCETYPEIP", "SOURCETYPEGROUP", 
			"TIMELINE", "QUOTEDIP", "ONLYIP", "DIGITS", "QUOTEDVALUE", "VALUE"
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


	public SearchQueryLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SearchQuery.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u012a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0094\n\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\6\37\u00be"+
		"\n\37\r\37\16\37\u00bf\3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\5!\u00d2\n!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3"+
		"%\3%\3%\3%\3%\3%\3&\3&\3&\5&\u00ee\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\5*\u010e"+
		"\n*\3+\3+\3+\3+\3,\3,\3-\6-\u0117\n-\r-\16-\u0118\3.\3.\3.\3.\7.\u011f"+
		"\n.\f.\16.\u0122\13.\3.\3.\3/\6/\u0127\n/\r/\16/\u0128\2\2\60\3\2\5\2"+
		"\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%"+
		"\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\29\2;\2=\3?\4A\5C\6E\7G\bI\tK\nM"+
		"\13O\fQ\rS\16U\17W\20Y\21[\22]\23\3\2\33\4\2UUuu\4\2JJjj\4\2QQqq\4\2Y"+
		"Yyy\4\2WWww\4\2TTtt\4\2EEee\4\2GGgg\4\2KKkk\4\2RRrr\4\2IIii\4\2OOoo\4"+
		"\2VVvv\4\2NNnn\4\2HHhh\4\2CCcc\4\2FFff\4\2[[{{\4\2XXxx\3\2\62;\3\2C\\"+
		"\3\2c|\4\2\13\13\"\"\4\2$$^^\6\2\"\"$$<<^^\2\u0118\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3_\3\2\2\2\5a\3\2\2\2\7c\3\2\2\2\te\3\2\2"+
		"\2\13g\3\2\2\2\ri\3\2\2\2\17k\3\2\2\2\21m\3\2\2\2\23o\3\2\2\2\25q\3\2"+
		"\2\2\27s\3\2\2\2\31u\3\2\2\2\33w\3\2\2\2\35y\3\2\2\2\37{\3\2\2\2!}\3\2"+
		"\2\2#\177\3\2\2\2%\u0081\3\2\2\2\'\u0083\3\2\2\2)\u0085\3\2\2\2+\u0087"+
		"\3\2\2\2-\u0089\3\2\2\2/\u0093\3\2\2\2\61\u0095\3\2\2\2\63\u009c\3\2\2"+
		"\2\65\u00a0\3\2\2\2\67\u00a5\3\2\2\29\u00ae\3\2\2\2;\u00b4\3\2\2\2=\u00bd"+
		"\3\2\2\2?\u00c1\3\2\2\2A\u00d1\3\2\2\2C\u00d3\3\2\2\2E\u00d7\3\2\2\2G"+
		"\u00df\3\2\2\2I\u00e4\3\2\2\2K\u00ed\3\2\2\2M\u00ef\3\2\2\2O\u00f6\3\2"+
		"\2\2Q\u00ff\3\2\2\2S\u010d\3\2\2\2U\u010f\3\2\2\2W\u0113\3\2\2\2Y\u0116"+
		"\3\2\2\2[\u011a\3\2\2\2]\u0126\3\2\2\2_`\t\2\2\2`\4\3\2\2\2ab\t\3\2\2"+
		"b\6\3\2\2\2cd\t\4\2\2d\b\3\2\2\2ef\t\5\2\2f\n\3\2\2\2gh\t\6\2\2h\f\3\2"+
		"\2\2ij\t\7\2\2j\16\3\2\2\2kl\t\b\2\2l\20\3\2\2\2mn\t\t\2\2n\22\3\2\2\2"+
		"op\t\n\2\2p\24\3\2\2\2qr\t\13\2\2r\26\3\2\2\2st\t\f\2\2t\30\3\2\2\2uv"+
		"\t\r\2\2v\32\3\2\2\2wx\t\16\2\2x\34\3\2\2\2yz\t\17\2\2z\36\3\2\2\2{|\t"+
		"\20\2\2| \3\2\2\2}~\t\21\2\2~\"\3\2\2\2\177\u0080\t\22\2\2\u0080$\3\2"+
		"\2\2\u0081\u0082\t\23\2\2\u0082&\3\2\2\2\u0083\u0084\t\24\2\2\u0084(\3"+
		"\2\2\2\u0085\u0086\t\25\2\2\u0086*\3\2\2\2\u0087\u0088\t\26\2\2\u0088"+
		",\3\2\2\2\u0089\u008a\t\27\2\2\u008a.\3\2\2\2\u008b\u008c\5)\25\2\u008c"+
		"\u008d\5)\25\2\u008d\u008e\5)\25\2\u008e\u0094\3\2\2\2\u008f\u0090\5)"+
		"\25\2\u0090\u0091\5)\25\2\u0091\u0094\3\2\2\2\u0092\u0094\5)\25\2\u0093"+
		"\u008b\3\2\2\2\u0093\u008f\3\2\2\2\u0093\u0092\3\2\2\2\u0094\60\3\2\2"+
		"\2\u0095\u0096\5\31\r\2\u0096\u0097\5\21\t\2\u0097\u0098\5\33\16\2\u0098"+
		"\u0099\5\r\7\2\u0099\u009a\5\23\n\2\u009a\u009b\5\17\b\2\u009b\62\3\2"+
		"\2\2\u009c\u009d\5\35\17\2\u009d\u009e\5\7\4\2\u009e\u009f\5\27\f\2\u009f"+
		"\64\3\2\2\2\u00a0\u00a1\5\37\20\2\u00a1\u00a2\5\35\17\2\u00a2\u00a3\5"+
		"\7\4\2\u00a3\u00a4\5\t\5\2\u00a4\66\3\2\2\2\u00a5\u00a6\5\35\17\2\u00a6"+
		"\u00a7\5!\21\2\u00a7\u00a8\5\3\2\2\u00a8\u00a9\5\33\16\2\u00a9\u00aa\5"+
		"\5\3\2\u00aa\u00ab\5\7\4\2\u00ab\u00ac\5\13\6\2\u00ac\u00ad\5\r\7\2\u00ad"+
		"8\3\2\2\2\u00ae\u00af\5\33\16\2\u00af\u00b0\5\7\4\2\u00b0\u00b1\5#\22"+
		"\2\u00b1\u00b2\5!\21\2\u00b2\u00b3\5%\23\2\u00b3:\3\2\2\2\u00b4\u00b5"+
		"\5/\30\2\u00b5\u00b6\7\60\2\2\u00b6\u00b7\5/\30\2\u00b7\u00b8\7\60\2\2"+
		"\u00b8\u00b9\5/\30\2\u00b9\u00ba\7\60\2\2\u00ba\u00bb\5/\30\2\u00bb<\3"+
		"\2\2\2\u00bc\u00be\t\30\2\2\u00bd\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0>\3\2\2\2\u00c1\u00c2\7<\2\2\u00c2"+
		"@\3\2\2\2\u00c3\u00c4\5\3\2\2\u00c4\u00c5\5\5\3\2\u00c5\u00c6\5\7\4\2"+
		"\u00c6\u00c7\5\t\5\2\u00c7\u00d2\3\2\2\2\u00c8\u00c9\5\'\24\2\u00c9\u00ca"+
		"\5\23\n\2\u00ca\u00cb\5\21\t\2\u00cb\u00cc\5\t\5\2\u00cc\u00d2\3\2\2\2"+
		"\u00cd\u00ce\5\27\f\2\u00ce\u00cf\5\21\t\2\u00cf\u00d0\5\33\16\2\u00d0"+
		"\u00d2\3\2\2\2\u00d1\u00c3\3\2\2\2\u00d1\u00c8\3\2\2\2\u00d1\u00cd\3\2"+
		"\2\2\u00d2B\3\2\2\2\u00d3\u00d4\5\33\16\2\u00d4\u00d5\5\7\4\2\u00d5\u00d6"+
		"\5\25\13\2\u00d6D\3\2\2\2\u00d7\u00d8\5\5\3\2\u00d8\u00d9\5\23\n\2\u00d9"+
		"\u00da\5\27\f\2\u00da\u00db\5\5\3\2\u00db\u00dc\5\21\t\2\u00dc\u00dd\5"+
		"\3\2\2\u00dd\u00de\5\33\16\2\u00deF\3\2\2\2\u00df\u00e0\5\35\17\2\u00e0"+
		"\u00e1\5!\21\2\u00e1\u00e2\5\3\2\2\u00e2\u00e3\5\33\16\2\u00e3H\3\2\2"+
		"\2\u00e4\u00e5\5\35\17\2\u00e5\u00e6\5\21\t\2\u00e6\u00e7\5!\21\2\u00e7"+
		"\u00e8\5\3\2\2\u00e8\u00e9\5\33\16\2\u00e9J\3\2\2\2\u00ea\u00ee\5\61\31"+
		"\2\u00eb\u00ee\5\63\32\2\u00ec\u00ee\5\65\33\2\u00ed\u00ea\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ed\u00ec\3\2\2\2\u00eeL\3\2\2\2\u00ef\u00f0\5\3\2\2"+
		"\u00f0\u00f1\5\7\4\2\u00f1\u00f2\5\13\6\2\u00f2\u00f3\5\r\7\2\u00f3\u00f4"+
		"\5\17\b\2\u00f4\u00f5\5\21\t\2\u00f5N\3\2\2\2\u00f6\u00f7\5\3\2\2\u00f7"+
		"\u00f8\5\7\4\2\u00f8\u00f9\5\13\6\2\u00f9\u00fa\5\r\7\2\u00fa\u00fb\5"+
		"\17\b\2\u00fb\u00fc\5\21\t\2\u00fc\u00fd\5\23\n\2\u00fd\u00fe\5\25\13"+
		"\2\u00feP\3\2\2\2\u00ff\u0100\5\3\2\2\u0100\u0101\5\7\4\2\u0101\u0102"+
		"\5\13\6\2\u0102\u0103\5\r\7\2\u0103\u0104\5\17\b\2\u0104\u0105\5\21\t"+
		"\2\u0105\u0106\5\27\f\2\u0106\u0107\5\r\7\2\u0107\u0108\5\7\4\2\u0108"+
		"\u0109\5\13\6\2\u0109\u010a\5\25\13\2\u010aR\3\2\2\2\u010b\u010e\5\67"+
		"\34\2\u010c\u010e\59\35\2\u010d\u010b\3\2\2\2\u010d\u010c\3\2\2\2\u010e"+
		"T\3\2\2\2\u010f\u0110\7$\2\2\u0110\u0111\5;\36\2\u0111\u0112\7$\2\2\u0112"+
		"V\3\2\2\2\u0113\u0114\5;\36\2\u0114X\3\2\2\2\u0115\u0117\5)\25\2\u0116"+
		"\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2"+
		"\2\2\u0119Z\3\2\2\2\u011a\u0120\7$\2\2\u011b\u011f\n\31\2\2\u011c\u011d"+
		"\7^\2\2\u011d\u011f\13\2\2\2\u011e\u011b\3\2\2\2\u011e\u011c\3\2\2\2\u011f"+
		"\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\3\2"+
		"\2\2\u0122\u0120\3\2\2\2\u0123\u0124\7$\2\2\u0124\\\3\2\2\2\u0125\u0127"+
		"\n\32\2\2\u0126\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0126\3\2\2\2"+
		"\u0128\u0129\3\2\2\2\u0129^\3\2\2\2\f\2\u0093\u00bf\u00d1\u00ed\u010d"+
		"\u0118\u011e\u0120\u0128\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}