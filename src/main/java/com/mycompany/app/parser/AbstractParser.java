package com.mycompany.app.parser;

import com.mycompany.app.tree.Tree;

import java.util.List;

public abstract class AbstractParser<T extends Tree> implements Parser<T> {
    protected String first(List<String> lexemas) {
        return lexemas.get(0);
    }

    protected List<String> next(List<String> lexemas) {
        if (lexemas.size() == 0) return lexemas;
        return lexemas.subList(1, lexemas.size());
    }
}
