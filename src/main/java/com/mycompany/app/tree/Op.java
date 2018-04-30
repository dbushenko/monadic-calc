package com.mycompany.app.tree;

public class Op implements Tree {
    private final String operation;

    public Op(String operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "Op{" +
                "operation='" + operation + '\'' +
                '}';
    }
}
