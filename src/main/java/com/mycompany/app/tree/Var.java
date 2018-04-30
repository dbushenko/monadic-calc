package com.mycompany.app.tree;

public class Var implements Tree {
    private final String lexema;

    public Var(String lexema) {
        this.lexema = lexema;
    }

    @Override
    public String toString() {
        return "Var{" +
                "lexema='" + lexema + '\'' +
                '}';
    }
}
