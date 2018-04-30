package com.mycompany.app.parser;

import com.mycompany.app.Pair;
import com.mycompany.app.tree.Empty;
import com.mycompany.app.tree.Op;
import com.mycompany.app.tree.R;
import com.mycompany.app.tree.T;

import java.util.List;
import java.util.Optional;

import static com.mycompany.app.Bindable.$;
import static com.mycompany.app.parser.Context.parseOp;
import static com.mycompany.app.parser.Context.parseR;
import static com.mycompany.app.parser.Context.parseT;

public class RParser extends AbstractParser<R> {
    @Override
    public Optional<Pair<R, List<String>>> parse(final List<String> lexemas) {
        final Optional<Pair<R, List<String>>> result =
               $(parseOp(lexemas),  (Op op, List<String> nextList) -> { return
               $(parseT(nextList),  (T t, List<String> nextList2)  -> { return
               $(parseR(nextList2), (R r, List<String> finalList)  -> { return
                   Optional.of( new Pair<>( new R( op, t, r), finalList));

               });});});

        return result.isPresent() ? result : empty(lexemas);
    }

    protected Optional<Pair<R, List<String>>> empty(final List<String> lexemas) {
        return Optional.of(new Pair<>(new Empty(), lexemas));
    }
}
