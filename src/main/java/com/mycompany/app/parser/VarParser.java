package com.mycompany.app.parser;

import com.mycompany.app.Pair;
import com.mycompany.app.tree.Var;

import java.util.List;
import java.util.Optional;

public class VarParser extends AbstractParser<Var> {
    @Override
    public Optional<Pair<Var, List<String>>> parse(List<String> lexemas) {
        if (lexemas.size() < 1) return Optional.empty();

        final String lexema = first(lexemas);

        if ( lexema.equalsIgnoreCase("(") || lexema.equalsIgnoreCase(")") ||
             lexema.equalsIgnoreCase("+") || lexema.equalsIgnoreCase("*")) {
            return Optional.empty();
        }

        return Optional.of( new Pair( new Var( lexema )
                                    , next( lexemas )
                                    )
                          );
    }
}
