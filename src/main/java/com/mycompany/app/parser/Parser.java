package com.mycompany.app.parser;

import com.mycompany.app.Pair;
import com.mycompany.app.tree.Tree;

import java.util.List;
import java.util.Optional;

public interface Parser<T extends Tree> {
    Optional<Pair<T, List<String>>> parse(List<String> lexemas);
}
