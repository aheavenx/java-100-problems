package com.aheavenx.p25;

/**
 * Created 22.05.2017 21:57
 * by Alex
 */
public class Pair<T> {

    private T left;
    private T right;

    Pair(T left, T right) {
        this.left = left;
        this.right = right;
    }

    T fst() {
        return left;
    }

    T snd() {
        return right;
    }

    @Override
    public String toString() {
        return "Pair [" + left.toString() + ":" + right.toString() + "]";
    }
}
