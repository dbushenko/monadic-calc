package com.mycompany.app;

public class Pair<A,B> {
    private final A left;
    private final B right;

    public A getLeft() {
        return left;
    }

    public B getRight() {
        return right;
    }

    public Pair(A left, B right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }
}
