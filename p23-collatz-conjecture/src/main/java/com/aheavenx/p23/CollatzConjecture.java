package com.aheavenx.p23;

import java.util.Scanner;

/**
 * Created 22.05.2017 20:52
 * by Alex
 */
public class CollatzConjecture {

    private static boolean isEven(long number) {
        return (number & 1) == 0;
    }

    private static long conjRecursive(long number, long step) {
        if (number == 1L) return step;
        if (isEven(number)) return conjRecursive(number / 2, ++step);
        else return conjRecursive(number * 3 + 1, ++step);
    }

    private static long conjunct(long number) {
        return conjRecursive(number, 0);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number > 1: ");
        long num = sc.nextLong();
        long start = System.nanoTime();
        System.out.println("Conjunction in: " + conjunct(num) + " steps took " + ((.0 + start - System.nanoTime()) / 1e6) + " ms.");
    }
}
