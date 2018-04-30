package com.mycompany.app.parser;

import com.mycompany.app.Pair;
import com.mycompany.app.tree.*;

import java.util.List;
import java.util.Optional;

import static com.mycompany.app.Bindable.$;
import static com.mycompany.app.parser.Context.*;

public class TParser extends AbstractParser<T> {
    @Override
    public Optional<Pair<T, List<String>>> parse(List<String> lexemas) {
        final Optional<Pair<T, List<String>>> maybeE = parseExpr(lexemas);
        if (maybeE.isPresent()) return maybeE;

        return parseVariable(lexemas);
    }

    protected Optional<Pair<T, List<String>>> parseExpr(List<String> lexemas) {
        return $(parseLBR(lexemas),   (LBR lbr, List<String> nextList)  -> { return
               $(parseE(nextList),    (E e, List<String> nextList2)     -> { return
               $(parseRBR(nextList2), (RBR rbr, List<String> nextList3) -> { return
                       Optional.of( new Pair<>( new T(e, null), nextList3));

               });});});
    }

    protected Optional<Pair<T, List<String>>> parseVariable(List<String> lexemas) {
        final Optional<Pair<Var, List<String>>> maybeVar = parseVar(lexemas);
        if (!maybeVar.isPresent()) return Optional.empty();

        final Var var = maybeVar.get().getLeft();
        final List<String> nextList = maybeVar.get().getRight();

        return Optional.of( new Pair<>( new T(null, var), nextList) );
    }
}
