// Generated from SearchQuery.g4 by ANTLR 4.10.1
// jshint ignore: start
import antlr4 from 'antlr4';
import SearchContext from '../searchContext';

// This class defines a complete listener for a parse tree produced by SearchQueryParser.
export default class SearchQueryListener extends antlr4.tree.ParseTreeListener {

	// Enter a parse tree produced by SearchQueryParser#searchEntry.
	enterSearchEntry(ctx) {
	}

	// Exit a parse tree produced by SearchQueryParser#searchEntry.
	exitSearchEntry(ctx) {
	}


	// Enter a parse tree produced by SearchQueryParser#searchQuery.
	enterSearchQuery(ctx) {
	}

	// Exit a parse tree produced by SearchQueryParser#searchQuery.
	exitSearchQuery(ctx) {
	}


	// Enter a parse tree produced by SearchQueryParser#command.
	enterCommand(ctx) {
		SearchContext.setRange(SearchQueryListener.getRange(ctx))
		if (ctx.getChildCount() == 0) {
			SearchContext.setSuggestions(["get ", "show "]);
		}
	}

	// Exit a parse tree produced by SearchQueryParser#command.
	exitCommand(ctx) {
	}


	// Enter a parse tree produced by SearchQueryParser#topnsorting.
	enterTopnsorting(ctx) {
		SearchContext.setRange(SearchQueryListener.getRange(ctx))
		if (ctx.getChildCount() == 0) {
			SearchContext.setSuggestions(["top 10", "last 10", "least 10"]);
		}
	}

	// Exit a parse tree produced by SearchQueryParser#topnsorting.
	exitTopnsorting(ctx) {
	}


	// Enter a parse tree produced by SearchQueryParser#source.
	enterSource(ctx) {
		// console.log(
		// 	document
		// 		.getElementById("rawText")
		// 		.value.slice(SearchQueryListener.getRange(ctx).start, SearchQueryListener.getRange(ctx).end)
		// );
		SearchContext.setRange(SearchQueryListener.getRange(ctx))
		if (ctx.getChildCount() == 0) {
			SearchContext.setSuggestions([
				`source:'ubuntu.oracle.local' `,
				`source:'rac2.oracle.local' `,
			]);
		}
	}

	// Exit a parse tree produced by SearchQueryParser#source.
	exitSource(ctx) {
	}


	// Enter a parse tree produced by SearchQueryParser#counter.
	enterCounter(ctx) {
		SearchContext.setRange(SearchQueryListener.getRange(ctx))
		if (ctx.getChildCount() == 0) {
			SearchContext.setSuggestions([
				`metric:'system.network.interface~in.bytes.per.sec'`,
				`metric:'system.network.udp.connections'`,
			]);
		}
	}

	// Exit a parse tree produced by SearchQueryParser#counter.
	exitCounter(ctx) {
		if (ctx.getChildCount() == 3) {
			SearchContext.setSuggestions(null);
		}
	}

	static getRange(node) {
		return {
			start: node.start.start,
			end: Math.max(
				(node.stop === null || node.stop === undefined ? node.start : node.stop).stop,
				node.start.start
			),
		};
	}

}