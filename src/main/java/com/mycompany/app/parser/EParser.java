package com.mycompany.app.parser;

import com.mycompany.app.Pair;
import com.mycompany.app.tree.E;
import com.mycompany.app.tree.R;
import com.mycompany.app.tree.T;

import java.util.List;
import java.util.Optional;

import static com.mycompany.app.Bindable.$;
import static com.mycompany.app.parser.Context.parseR;
import static com.mycompany.app.parser.Context.parseT;

public class EParser extends AbstractParser<E> {
    @Override
    public Optional<Pair<E, List<String>>> parse(final List<String> lexemas) {
        return $(parseT(lexemas),  (T t, List<String> nextList)  -> { return
               $(parseR(nextList), (R r, List<String> finalList) -> { return
                       Optional.of( new Pair<>( new E(t,r), finalList));

               });});
    }
}
