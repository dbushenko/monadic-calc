package com.mycompany.app.parser;

import com.mycompany.app.Pair;
import com.mycompany.app.tree.LBR;

import java.util.List;
import java.util.Optional;

public class LBRParser extends AbstractParser<LBR> {
    @Override
    public Optional<Pair<LBR, List<String>>> parse(List<String> lexemas) {
        if (lexemas.size() < 1) return Optional.empty();

        final String lexema = first(lexemas);

        if ( !lexema.equalsIgnoreCase("(") ) {
            return Optional.empty();
        }

        return Optional.of( new Pair( new LBR()
                                    , next( lexemas )
                                    )
                         );
    }
}
