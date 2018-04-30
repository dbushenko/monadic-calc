package com.mycompany.app.tree;

public class T implements Tree {
    private final E e;
    private final Var var;

    public T(E e, Var var) {
        this.e = e;
        this.var = var;
    }

    @Override
    public String toString() {
        return "T{" +
                ( e != null ? "e=" + e : "") +
                ( var != null ? "var=" + var : "") +
                '}';
    }
}
