package com.aheavenx.p25;

/**
 * Created 22.05.2017 21:57
 * by Alex
 */
public class Pair<T> {

    private T left;
    private T right;

    public Pair(T left, T right) {
        this.left = left;
        this.right = right;
    }

    public T fst() {
        return left;
    }

    public T snd() {
        return right;
    }

    @Override
    public String toString() {
        return "Pair [" + left.toString() + ":" + right.toString() + "]";
    }
}
