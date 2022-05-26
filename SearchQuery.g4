

// // PARSER Rules searchQuery: searchOperation ' ' searchSource ':"' searchIP '" ' searchType ':"'
// searchTask '"';

// searchOperation: (SHOW | DISPLAY | GET); searchSource: (SOURCE | SOURCEIP); searchIP: ONLYIP;
// searchType: (METRIC | LOG); searchTask: TASK;

// fragment DIGIT: [0-9]; fragment OCTATE: DIGIT DIGIT DIGIT | DIGIT DIGIT | DIGIT; fragment IP:
// OCTATE '.' OCTATE '.' OCTATE '.' OCTATE; fragment TEXT: [.a-zA-Z0-9~]+;

// // LEXER Rules ONLYIP: IP; SHOW: 'show'; DISPLAY: 'display'; GET: 'get'; LOG: 'log'; METRIC:
// 'metric'; GROUP: 'group';

// SOURCE: 'source'; SOURCEIP: 'sourceip'; TASK: [.a-zA-Z0-9~]+;

// WS: [ \n\t]+ -> skip;

grammar SearchQuery;
/*
 * Parser Rules
 */
searchEntry: searchQuery EOF;
searchQuery:
	command WHITESPACE (topnsorting)? source WHITESPACE counter WHITESPACE?;
command: COMMAND;
topnsorting: (TOP | HIGHEST | LAST | LEAST) WHITESPACE DIGITS WHITESPACE;
source: (SOURCETYPESOURCE | SOURCETYPEGROUP) SEPERATOR VALUE
	| SOURCETYPEIP SEPERATOR ONLYIP
	| (SOURCETYPESOURCE | SOURCETYPEGROUP) SEPERATOR QUOTEDVALUE
	| SOURCETYPEIP SEPERATOR QUOTEDIP;
counter:
	COUNTERTYPE SEPERATOR VALUE
	| COUNTERTYPE SEPERATOR QUOTEDVALUE;

/*
 * Lexer Rules
 */

fragment S: ('s' | 'S');

fragment H: ('h' | 'H');

fragment O: ('o' | 'O');

fragment W: ('w' | 'W');

fragment U: ('u' | 'U');

fragment R: ('r' | 'R');

fragment C: ('c' | 'C');

fragment E: ('e' | 'E');

fragment I: ('i' | 'I');

fragment P: ('p' | 'P');

fragment G: ('g' | 'G');

fragment M: ('m' | 'M');

fragment T: ('t' | 'T');

fragment L: ('l' | 'L');

fragment F: ('f' | 'F');

fragment A: ('a' | 'A');

fragment D: ('d' | 'D');

fragment Y: ('y' | 'Y');

fragment V: ('v' | 'V');

fragment DIGIT: [0-9];

fragment UPPERCASE: [A-Z];

fragment LOWERCASE: [a-z];

fragment OCTATE: DIGIT DIGIT DIGIT | DIGIT DIGIT | DIGIT;

fragment METRIC: M E T R I C;

fragment LOG: L O G;

fragment FLOW: F L O W;
fragment LASTHOUR: L A S T H O U R;
fragment TODAY: T O D A Y;
fragment IP: OCTATE '.' OCTATE '.' OCTATE '.' OCTATE;

WHITESPACE: (' ' | '\t')+;
SEPERATOR: ':';
COMMAND: S H O W | V I E W | G E T;
TOP: T O P;
HIGHEST: H I G H E S T;
LAST: L A S T;
LEAST: L E A S T;
COUNTERTYPE: (METRIC | LOG | FLOW);
SOURCETYPESOURCE: S O U R C E;
SOURCETYPEIP: S O U R C E I P;
SOURCETYPEGROUP: S O U R C E G R O U P;
TIMELINE: (LASTHOUR | TODAY);
QUOTEDIP: '"' IP '"';
ONLYIP: IP;
DIGITS: DIGIT+;
QUOTEDVALUE: '"' (~["\\] | '\\' .)* '"';
VALUE: ~["\\ :]+;
