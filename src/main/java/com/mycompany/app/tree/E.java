package com.mycompany.app.tree;

public class E implements Tree {
    private final T t;
    private final R r;


    public E(T t, R r) {
        this.t = t;
        this.r = r;
    }

    @Override
    public String toString() {
        return "E{" +
                "t=" + t +
                ", r=" + r +
                '}';
    }
}
