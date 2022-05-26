// Generated from SearchQuery.g4 by ANTLR 4.10.1
// jshint ignore: start
import antlr4 from 'antlr4';
import SearchQueryListener from './SearchQueryListener.js';
const serializedATN = [4,1,17,56,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,
2,5,7,5,1,0,1,0,1,0,1,1,1,1,1,1,3,1,19,8,1,1,1,1,1,1,1,1,1,3,1,25,8,1,1,
2,1,2,1,3,1,3,1,3,1,3,1,3,1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,
4,3,4,46,8,4,1,5,1,5,1,5,1,5,1,5,1,5,3,5,54,8,5,1,5,0,0,6,0,2,4,6,8,10,0,
2,1,0,4,7,2,0,9,9,11,11,55,0,12,1,0,0,0,2,15,1,0,0,0,4,26,1,0,0,0,6,28,1,
0,0,0,8,45,1,0,0,0,10,53,1,0,0,0,12,13,3,2,1,0,13,14,5,0,0,1,14,1,1,0,0,
0,15,16,3,4,2,0,16,18,5,1,0,0,17,19,3,6,3,0,18,17,1,0,0,0,18,19,1,0,0,0,
19,20,1,0,0,0,20,21,3,8,4,0,21,22,5,1,0,0,22,24,3,10,5,0,23,25,5,1,0,0,24,
23,1,0,0,0,24,25,1,0,0,0,25,3,1,0,0,0,26,27,5,3,0,0,27,5,1,0,0,0,28,29,7,
0,0,0,29,30,5,1,0,0,30,31,5,15,0,0,31,32,5,1,0,0,32,7,1,0,0,0,33,34,7,1,
0,0,34,35,5,2,0,0,35,46,5,17,0,0,36,37,5,10,0,0,37,38,5,2,0,0,38,46,5,14,
0,0,39,40,7,1,0,0,40,41,5,2,0,0,41,46,5,16,0,0,42,43,5,10,0,0,43,44,5,2,
0,0,44,46,5,13,0,0,45,33,1,0,0,0,45,36,1,0,0,0,45,39,1,0,0,0,45,42,1,0,0,
0,46,9,1,0,0,0,47,48,5,8,0,0,48,49,5,2,0,0,49,54,5,17,0,0,50,51,5,8,0,0,
51,52,5,2,0,0,52,54,5,16,0,0,53,47,1,0,0,0,53,50,1,0,0,0,54,11,1,0,0,0,4,
18,24,45,53];


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

const sharedContextCache = new antlr4.PredictionContextCache();

export default class SearchQueryParser extends antlr4.Parser {

    static grammarFileName = "SearchQuery.g4";
    static literalNames = [ null, null, "':'" ];
    static symbolicNames = [ null, "WHITESPACE", "SEPERATOR", "COMMAND", 
                             "TOP", "HIGHEST", "LAST", "LEAST", "COUNTERTYPE", 
                             "SOURCETYPESOURCE", "SOURCETYPEIP", "SOURCETYPEGROUP", 
                             "TIMELINE", "QUOTEDIP", "ONLYIP", "DIGITS", 
                             "QUOTEDVALUE", "VALUE" ];
    static ruleNames = [ "searchEntry", "searchQuery", "command", "topnsorting", 
                         "source", "counter" ];

    constructor(input) {
        super(input);
        this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
        this.ruleNames = SearchQueryParser.ruleNames;
        this.literalNames = SearchQueryParser.literalNames;
        this.symbolicNames = SearchQueryParser.symbolicNames;
    }

    get atn() {
        return atn;
    }



	searchEntry() {
	    let localctx = new SearchEntryContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 0, SearchQueryParser.RULE_searchEntry);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 12;
	        this.searchQuery();
	        this.state = 13;
	        this.match(SearchQueryParser.EOF);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	searchQuery() {
	    let localctx = new SearchQueryContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 2, SearchQueryParser.RULE_searchQuery);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 15;
	        this.command();
	        this.state = 16;
	        this.match(SearchQueryParser.WHITESPACE);
	        this.state = 18;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << SearchQueryParser.TOP) | (1 << SearchQueryParser.HIGHEST) | (1 << SearchQueryParser.LAST) | (1 << SearchQueryParser.LEAST))) !== 0)) {
	            this.state = 17;
	            this.topnsorting();
	        }

	        this.state = 20;
	        this.source();
	        this.state = 21;
	        this.match(SearchQueryParser.WHITESPACE);
	        this.state = 22;
	        this.counter();
	        this.state = 24;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===SearchQueryParser.WHITESPACE) {
	            this.state = 23;
	            this.match(SearchQueryParser.WHITESPACE);
	        }

	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	command() {
	    let localctx = new CommandContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 4, SearchQueryParser.RULE_command);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 26;
	        this.match(SearchQueryParser.COMMAND);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	topnsorting() {
	    let localctx = new TopnsortingContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 6, SearchQueryParser.RULE_topnsorting);
	    var _la = 0; // Token type
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 28;
	        _la = this._input.LA(1);
	        if(!((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << SearchQueryParser.TOP) | (1 << SearchQueryParser.HIGHEST) | (1 << SearchQueryParser.LAST) | (1 << SearchQueryParser.LEAST))) !== 0))) {
	        this._errHandler.recoverInline(this);
	        }
	        else {
	        	this._errHandler.reportMatch(this);
	            this.consume();
	        }
	        this.state = 29;
	        this.match(SearchQueryParser.WHITESPACE);
	        this.state = 30;
	        this.match(SearchQueryParser.DIGITS);
	        this.state = 31;
	        this.match(SearchQueryParser.WHITESPACE);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	source() {
	    let localctx = new SourceContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 8, SearchQueryParser.RULE_source);
	    var _la = 0; // Token type
	    try {
	        this.state = 45;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,2,this._ctx);
	        switch(la_) {
	        case 1:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 33;
	            _la = this._input.LA(1);
	            if(!(_la===SearchQueryParser.SOURCETYPESOURCE || _la===SearchQueryParser.SOURCETYPEGROUP)) {
	            this._errHandler.recoverInline(this);
	            }
	            else {
	            	this._errHandler.reportMatch(this);
	                this.consume();
	            }
	            this.state = 34;
	            this.match(SearchQueryParser.SEPERATOR);
	            this.state = 35;
	            this.match(SearchQueryParser.VALUE);
	            break;

	        case 2:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 36;
	            this.match(SearchQueryParser.SOURCETYPEIP);
	            this.state = 37;
	            this.match(SearchQueryParser.SEPERATOR);
	            this.state = 38;
	            this.match(SearchQueryParser.ONLYIP);
	            break;

	        case 3:
	            this.enterOuterAlt(localctx, 3);
	            this.state = 39;
	            _la = this._input.LA(1);
	            if(!(_la===SearchQueryParser.SOURCETYPESOURCE || _la===SearchQueryParser.SOURCETYPEGROUP)) {
	            this._errHandler.recoverInline(this);
	            }
	            else {
	            	this._errHandler.reportMatch(this);
	                this.consume();
	            }
	            this.state = 40;
	            this.match(SearchQueryParser.SEPERATOR);
	            this.state = 41;
	            this.match(SearchQueryParser.QUOTEDVALUE);
	            break;

	        case 4:
	            this.enterOuterAlt(localctx, 4);
	            this.state = 42;
	            this.match(SearchQueryParser.SOURCETYPEIP);
	            this.state = 43;
	            this.match(SearchQueryParser.SEPERATOR);
	            this.state = 44;
	            this.match(SearchQueryParser.QUOTEDIP);
	            break;

	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	counter() {
	    let localctx = new CounterContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 10, SearchQueryParser.RULE_counter);
	    try {
	        this.state = 53;
	        this._errHandler.sync(this);
	        var la_ = this._interp.adaptivePredict(this._input,3,this._ctx);
	        switch(la_) {
	        case 1:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 47;
	            this.match(SearchQueryParser.COUNTERTYPE);
	            this.state = 48;
	            this.match(SearchQueryParser.SEPERATOR);
	            this.state = 49;
	            this.match(SearchQueryParser.VALUE);
	            break;

	        case 2:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 50;
	            this.match(SearchQueryParser.COUNTERTYPE);
	            this.state = 51;
	            this.match(SearchQueryParser.SEPERATOR);
	            this.state = 52;
	            this.match(SearchQueryParser.QUOTEDVALUE);
	            break;

	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}


}

SearchQueryParser.EOF = antlr4.Token.EOF;
SearchQueryParser.WHITESPACE = 1;
SearchQueryParser.SEPERATOR = 2;
SearchQueryParser.COMMAND = 3;
SearchQueryParser.TOP = 4;
SearchQueryParser.HIGHEST = 5;
SearchQueryParser.LAST = 6;
SearchQueryParser.LEAST = 7;
SearchQueryParser.COUNTERTYPE = 8;
SearchQueryParser.SOURCETYPESOURCE = 9;
SearchQueryParser.SOURCETYPEIP = 10;
SearchQueryParser.SOURCETYPEGROUP = 11;
SearchQueryParser.TIMELINE = 12;
SearchQueryParser.QUOTEDIP = 13;
SearchQueryParser.ONLYIP = 14;
SearchQueryParser.DIGITS = 15;
SearchQueryParser.QUOTEDVALUE = 16;
SearchQueryParser.VALUE = 17;

SearchQueryParser.RULE_searchEntry = 0;
SearchQueryParser.RULE_searchQuery = 1;
SearchQueryParser.RULE_command = 2;
SearchQueryParser.RULE_topnsorting = 3;
SearchQueryParser.RULE_source = 4;
SearchQueryParser.RULE_counter = 5;

class SearchEntryContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = SearchQueryParser.RULE_searchEntry;
    }

	searchQuery() {
	    return this.getTypedRuleContext(SearchQueryContext,0);
	};

	EOF() {
	    return this.getToken(SearchQueryParser.EOF, 0);
	};

	enterRule(listener) {
	    if(listener instanceof SearchQueryListener ) {
	        listener.enterSearchEntry(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof SearchQueryListener ) {
	        listener.exitSearchEntry(this);
		}
	}


}



class SearchQueryContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = SearchQueryParser.RULE_searchQuery;
    }

	command() {
	    return this.getTypedRuleContext(CommandContext,0);
	};

	WHITESPACE = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(SearchQueryParser.WHITESPACE);
	    } else {
	        return this.getToken(SearchQueryParser.WHITESPACE, i);
	    }
	};


	source() {
	    return this.getTypedRuleContext(SourceContext,0);
	};

	counter() {
	    return this.getTypedRuleContext(CounterContext,0);
	};

	topnsorting() {
	    return this.getTypedRuleContext(TopnsortingContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof SearchQueryListener ) {
	        listener.enterSearchQuery(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof SearchQueryListener ) {
	        listener.exitSearchQuery(this);
		}
	}


}



class CommandContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = SearchQueryParser.RULE_command;
    }

	COMMAND() {
	    return this.getToken(SearchQueryParser.COMMAND, 0);
	};

	enterRule(listener) {
	    if(listener instanceof SearchQueryListener ) {
	        listener.enterCommand(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof SearchQueryListener ) {
	        listener.exitCommand(this);
		}
	}


}



class TopnsortingContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = SearchQueryParser.RULE_topnsorting;
    }

	WHITESPACE = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(SearchQueryParser.WHITESPACE);
	    } else {
	        return this.getToken(SearchQueryParser.WHITESPACE, i);
	    }
	};


	DIGITS() {
	    return this.getToken(SearchQueryParser.DIGITS, 0);
	};

	TOP() {
	    return this.getToken(SearchQueryParser.TOP, 0);
	};

	HIGHEST() {
	    return this.getToken(SearchQueryParser.HIGHEST, 0);
	};

	LAST() {
	    return this.getToken(SearchQueryParser.LAST, 0);
	};

	LEAST() {
	    return this.getToken(SearchQueryParser.LEAST, 0);
	};

	enterRule(listener) {
	    if(listener instanceof SearchQueryListener ) {
	        listener.enterTopnsorting(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof SearchQueryListener ) {
	        listener.exitTopnsorting(this);
		}
	}


}



class SourceContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = SearchQueryParser.RULE_source;
    }

	SEPERATOR() {
	    return this.getToken(SearchQueryParser.SEPERATOR, 0);
	};

	VALUE() {
	    return this.getToken(SearchQueryParser.VALUE, 0);
	};

	SOURCETYPESOURCE() {
	    return this.getToken(SearchQueryParser.SOURCETYPESOURCE, 0);
	};

	SOURCETYPEGROUP() {
	    return this.getToken(SearchQueryParser.SOURCETYPEGROUP, 0);
	};

	SOURCETYPEIP() {
	    return this.getToken(SearchQueryParser.SOURCETYPEIP, 0);
	};

	ONLYIP() {
	    return this.getToken(SearchQueryParser.ONLYIP, 0);
	};

	QUOTEDVALUE() {
	    return this.getToken(SearchQueryParser.QUOTEDVALUE, 0);
	};

	QUOTEDIP() {
	    return this.getToken(SearchQueryParser.QUOTEDIP, 0);
	};

	enterRule(listener) {
	    if(listener instanceof SearchQueryListener ) {
	        listener.enterSource(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof SearchQueryListener ) {
	        listener.exitSource(this);
		}
	}


}



class CounterContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = SearchQueryParser.RULE_counter;
    }

	COUNTERTYPE() {
	    return this.getToken(SearchQueryParser.COUNTERTYPE, 0);
	};

	SEPERATOR() {
	    return this.getToken(SearchQueryParser.SEPERATOR, 0);
	};

	VALUE() {
	    return this.getToken(SearchQueryParser.VALUE, 0);
	};

	QUOTEDVALUE() {
	    return this.getToken(SearchQueryParser.QUOTEDVALUE, 0);
	};

	enterRule(listener) {
	    if(listener instanceof SearchQueryListener ) {
	        listener.enterCounter(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof SearchQueryListener ) {
	        listener.exitCounter(this);
		}
	}


}




SearchQueryParser.SearchEntryContext = SearchEntryContext; 
SearchQueryParser.SearchQueryContext = SearchQueryContext; 
SearchQueryParser.CommandContext = CommandContext; 
SearchQueryParser.TopnsortingContext = TopnsortingContext; 
SearchQueryParser.SourceContext = SourceContext; 
SearchQueryParser.CounterContext = CounterContext; 
