package com.mycompany.app.parser;

import com.mycompany.app.Pair;
import com.mycompany.app.tree.RBR;

import java.util.List;
import java.util.Optional;

public class RBRParser extends AbstractParser<RBR> {
    @Override
    public Optional<Pair<RBR, List<String>>> parse(List<String> lexemas) {
        if (lexemas.size() < 1) return Optional.empty();

        final String lexema = first(lexemas);

        if ( !lexema.equalsIgnoreCase(")") ) {
            return Optional.empty();
        }

        return Optional.of( new Pair( new RBR()
                                    , next( lexemas )
                                    )
                          );
    }
}
