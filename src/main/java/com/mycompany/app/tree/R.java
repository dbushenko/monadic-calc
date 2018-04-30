package com.mycompany.app.tree;

public class R implements Tree {
    private final Op op;
    private final T t;
    private final R r;

    public R(Op op, T t, R r) {
        this.op = op;
        this.t = t;
        this.r = r;
    }

    @Override
    public String toString() {
        return "R{" +
                "op=" + op +
                ", t=" + t +
                ", r=" + r +
                '}';
    }
}
