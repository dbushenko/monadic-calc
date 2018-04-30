package com.mycompany.app.parser;

import com.mycompany.app.Pair;
import com.mycompany.app.tree.*;

import java.util.List;
import java.util.Optional;

public class Context {
    private final EParser eParser = new EParser();
    private final TParser tParser = new TParser();
    private final RParser rParser = new RParser();
    private final LBRParser lbrParser = new LBRParser();
    private final RBRParser rbrParser = new RBRParser();
    private final OpParser opParser = new OpParser();
    private final VarParser varParser = new VarParser();

    private static final Context instance = new Context();

    public static Optional<Pair<E, List<String>>> parseE(final List<String> lexemas) {
        return instance.eParser.parse(lexemas);
    }

    public static Optional<Pair<T, List<String>>> parseT(final List<String> lexemas) {
        return instance.tParser.parse(lexemas);
    }

    public static Optional<Pair<R, List<String>>> parseR(final List<String> lexemas) {
        return instance.rParser.parse(lexemas);
    }

    public static Optional<Pair<LBR, List<String>>> parseLBR(final List<String> lexemas) {
        return instance.lbrParser.parse(lexemas);
    }

    public static Optional<Pair<RBR, List<String>>> parseRBR(final List<String> lexemas) {
        return instance.rbrParser.parse(lexemas);
    }

    public static Optional<Pair<Op, List<String>>> parseOp(final List<String> lexemas) {
        return instance.opParser.parse(lexemas);
    }

    public static Optional<Pair<Var, List<String>>> parseVar(final List<String> lexemas) {
        return instance.varParser.parse(lexemas);
    }

}
