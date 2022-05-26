import SearchQueryListener from "./grammer/SearchQueryListener";
import SearchContext from "./searchContext";

export default class DataGenerater extends SearchQueryListener {

    exitSearchQuery(ctx) {
        let lastParser = ctx.parser.ruleNames.at(-1);
        try {
            var data = [];
            if (ctx[lastParser]()) {
                ctx.parser.ruleNames.slice(2).map((rule) => {
                    if (ctx[rule]()) {
                        data.push({
                            name: rule,
                            value: ctx[rule]().getText()
                        })
                    }
                });
                SearchContext.setData(data)
            }
        } catch (error) {
            SearchContext.setError(error);
        }
    }
}
