// Generated from /home/meet/Meet/Search Query/SearchQuery.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SearchQueryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHITESPACE=1, SEPERATOR=2, COMMAND=3, TOP=4, HIGHEST=5, LAST=6, LEAST=7, 
		COUNTERTYPE=8, SOURCETYPESOURCE=9, SOURCETYPEIP=10, SOURCETYPEGROUP=11, 
		TIMELINE=12, QUOTEDIP=13, ONLYIP=14, DIGITS=15, QUOTEDVALUE=16, VALUE=17;
	public static final int
		RULE_searchEntry = 0, RULE_searchQuery = 1, RULE_command = 2, RULE_topnsorting = 3, 
		RULE_source = 4, RULE_counter = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"searchEntry", "searchQuery", "command", "topnsorting", "source", "counter"
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

	@Override
	public String getGrammarFileName() { return "SearchQuery.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SearchQueryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SearchEntryContext extends ParserRuleContext {
		public SearchQueryContext searchQuery() {
			return getRuleContext(SearchQueryContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SearchQueryParser.EOF, 0); }
		public SearchEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searchEntry; }
	}

	public final SearchEntryContext searchEntry() throws RecognitionException {
		SearchEntryContext _localctx = new SearchEntryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_searchEntry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			searchQuery();
			setState(13);
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

	public static class SearchQueryContext extends ParserRuleContext {
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(SearchQueryParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(SearchQueryParser.WHITESPACE, i);
		}
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public CounterContext counter() {
			return getRuleContext(CounterContext.class,0);
		}
		public TopnsortingContext topnsorting() {
			return getRuleContext(TopnsortingContext.class,0);
		}
		public SearchQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searchQuery; }
	}

	public final SearchQueryContext searchQuery() throws RecognitionException {
		SearchQueryContext _localctx = new SearchQueryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_searchQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			command();
			setState(16);
			match(WHITESPACE);
			setState(18);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOP) | (1L << HIGHEST) | (1L << LAST) | (1L << LEAST))) != 0)) {
				{
				setState(17);
				topnsorting();
				}
			}

			setState(20);
			source();
			setState(21);
			match(WHITESPACE);
			setState(22);
			counter();
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(23);
				match(WHITESPACE);
				}
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

	public static class CommandContext extends ParserRuleContext {
		public TerminalNode COMMAND() { return getToken(SearchQueryParser.COMMAND, 0); }
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(COMMAND);
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

	public static class TopnsortingContext extends ParserRuleContext {
		public List<TerminalNode> WHITESPACE() { return getTokens(SearchQueryParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(SearchQueryParser.WHITESPACE, i);
		}
		public TerminalNode DIGITS() { return getToken(SearchQueryParser.DIGITS, 0); }
		public TerminalNode TOP() { return getToken(SearchQueryParser.TOP, 0); }
		public TerminalNode HIGHEST() { return getToken(SearchQueryParser.HIGHEST, 0); }
		public TerminalNode LAST() { return getToken(SearchQueryParser.LAST, 0); }
		public TerminalNode LEAST() { return getToken(SearchQueryParser.LEAST, 0); }
		public TopnsortingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topnsorting; }
	}

	public final TopnsortingContext topnsorting() throws RecognitionException {
		TopnsortingContext _localctx = new TopnsortingContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_topnsorting);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOP) | (1L << HIGHEST) | (1L << LAST) | (1L << LEAST))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(29);
			match(WHITESPACE);
			setState(30);
			match(DIGITS);
			setState(31);
			match(WHITESPACE);
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

	public static class SourceContext extends ParserRuleContext {
		public TerminalNode SEPERATOR() { return getToken(SearchQueryParser.SEPERATOR, 0); }
		public TerminalNode VALUE() { return getToken(SearchQueryParser.VALUE, 0); }
		public TerminalNode SOURCETYPESOURCE() { return getToken(SearchQueryParser.SOURCETYPESOURCE, 0); }
		public TerminalNode SOURCETYPEGROUP() { return getToken(SearchQueryParser.SOURCETYPEGROUP, 0); }
		public TerminalNode SOURCETYPEIP() { return getToken(SearchQueryParser.SOURCETYPEIP, 0); }
		public TerminalNode ONLYIP() { return getToken(SearchQueryParser.ONLYIP, 0); }
		public TerminalNode QUOTEDVALUE() { return getToken(SearchQueryParser.QUOTEDVALUE, 0); }
		public TerminalNode QUOTEDIP() { return getToken(SearchQueryParser.QUOTEDIP, 0); }
		public SourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source; }
	}

	public final SourceContext source() throws RecognitionException {
		SourceContext _localctx = new SourceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_source);
		int _la;
		try {
			setState(45);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				_la = _input.LA(1);
				if ( !(_la==SOURCETYPESOURCE || _la==SOURCETYPEGROUP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(34);
				match(SEPERATOR);
				setState(35);
				match(VALUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				match(SOURCETYPEIP);
				setState(37);
				match(SEPERATOR);
				setState(38);
				match(ONLYIP);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				_la = _input.LA(1);
				if ( !(_la==SOURCETYPESOURCE || _la==SOURCETYPEGROUP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(40);
				match(SEPERATOR);
				setState(41);
				match(QUOTEDVALUE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(42);
				match(SOURCETYPEIP);
				setState(43);
				match(SEPERATOR);
				setState(44);
				match(QUOTEDIP);
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

	public static class CounterContext extends ParserRuleContext {
		public TerminalNode COUNTERTYPE() { return getToken(SearchQueryParser.COUNTERTYPE, 0); }
		public TerminalNode SEPERATOR() { return getToken(SearchQueryParser.SEPERATOR, 0); }
		public TerminalNode VALUE() { return getToken(SearchQueryParser.VALUE, 0); }
		public TerminalNode QUOTEDVALUE() { return getToken(SearchQueryParser.QUOTEDVALUE, 0); }
		public CounterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_counter; }
	}

	public final CounterContext counter() throws RecognitionException {
		CounterContext _localctx = new CounterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_counter);
		try {
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				match(COUNTERTYPE);
				setState(48);
				match(SEPERATOR);
				setState(49);
				match(VALUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				match(COUNTERTYPE);
				setState(51);
				match(SEPERATOR);
				setState(52);
				match(QUOTEDVALUE);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23:\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\3\3\3\3\3\5\3\25\n\3"+
		"\3\3\3\3\3\3\3\3\5\3\33\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\60\n\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\5\78\n\7\3\7\2\2\b\2\4\6\b\n\f\2\4\3\2\6\t\4\2\13\13\r\r\29\2\16\3\2"+
		"\2\2\4\21\3\2\2\2\6\34\3\2\2\2\b\36\3\2\2\2\n/\3\2\2\2\f\67\3\2\2\2\16"+
		"\17\5\4\3\2\17\20\7\2\2\3\20\3\3\2\2\2\21\22\5\6\4\2\22\24\7\3\2\2\23"+
		"\25\5\b\5\2\24\23\3\2\2\2\24\25\3\2\2\2\25\26\3\2\2\2\26\27\5\n\6\2\27"+
		"\30\7\3\2\2\30\32\5\f\7\2\31\33\7\3\2\2\32\31\3\2\2\2\32\33\3\2\2\2\33"+
		"\5\3\2\2\2\34\35\7\5\2\2\35\7\3\2\2\2\36\37\t\2\2\2\37 \7\3\2\2 !\7\21"+
		"\2\2!\"\7\3\2\2\"\t\3\2\2\2#$\t\3\2\2$%\7\4\2\2%\60\7\23\2\2&\'\7\f\2"+
		"\2\'(\7\4\2\2(\60\7\20\2\2)*\t\3\2\2*+\7\4\2\2+\60\7\22\2\2,-\7\f\2\2"+
		"-.\7\4\2\2.\60\7\17\2\2/#\3\2\2\2/&\3\2\2\2/)\3\2\2\2/,\3\2\2\2\60\13"+
		"\3\2\2\2\61\62\7\n\2\2\62\63\7\4\2\2\638\7\23\2\2\64\65\7\n\2\2\65\66"+
		"\7\4\2\2\668\7\22\2\2\67\61\3\2\2\2\67\64\3\2\2\28\r\3\2\2\2\6\24\32/"+
		"\67";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}