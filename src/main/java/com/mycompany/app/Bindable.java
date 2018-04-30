package com.mycompany.app;

import java.util.List;
import java.util.Optional;

public class Bindable {
    public static <A,B> Optional<Pair<B, List<String>>> $
            ( final Optional<Pair<A, List<String>>> ma
            , final Func2<A, List<String>, Optional<Pair<B, List<String>>>> func
            ) {
        if (!ma.isPresent()) return Optional.empty();
        final A a = ma.get().getLeft();
        final List<String> strs = ma.get().getRight();

        return func.apply(a, strs);
    }

    public static interface Func2<A,B,C> {
        C apply(A a, B b);
    }
}
