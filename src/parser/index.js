import antlr4 from "antlr4";
import SearchQueryLexer from "./grammer/SearchQueryLexer";
import SearchQueryParser from "./grammer/SearchQueryParser";
import SearchContext from "./searchContext";
import DataGenerater from "./dataGenerater";

export const parse = (input) => {
    const chars = new antlr4.InputStream(input);
    const lexer = new SearchQueryLexer(chars);
    const tokens = new antlr4.CommonTokenStream(lexer);
    const parser = new SearchQueryParser(tokens);
    parser.buildParseTrees = true;

    SearchContext.setError(null)
    parser.removeErrorListeners();
    parser.addErrorListener({
        syntaxError: (recognizer, offendingSymbol, line, column, msg, err) => {
            const expectedTokens = recognizer.atn
                .getExpectedTokens(recognizer.state, recognizer._ctx)
                .toString(recognizer.literalNames, recognizer.symbolicNames);
            SearchContext.setError(
                `Encountered error at character ${column}, expecting ${expectedTokens}`
            );
        },
    });

    const tree = parser.searchEntry();
    const dataGenerater = new DataGenerater();
    antlr4.tree.ParseTreeWalker.DEFAULT.walk(dataGenerater, tree);


    console.log(SearchContext.getSuggestions())
    if (SearchContext.getError()) {
        return SearchContext.getError()
    }
    return SearchContext.getData()
};