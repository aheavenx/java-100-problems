package com.aheavenx.p3;

import java.util.Scanner;
import java.util.stream.Stream;

/**
 * TASK: Fibonacci Sequence<br>
 * Enter a number and have the program generate the Fibonacci sequence to that number or to the Nth number.
 * @author Skovorodnikov
 *         Created on 17.05.2017 16:01
 */
public class FibonacciSequence {

    private static Scanner sc = new Scanner(System.in);
    /**
     * Generates an Nth number using standard method (sum of 2 previous numbers) via functional style
     * @param n the index of a number to be generated
     * @return the generated number
     * @throws IllegalArgumentException
     */
    public long nthFibonacciNumber(int n) throws IllegalArgumentException {
        if (n < 1) throw new IllegalArgumentException("Index must be greater than 0");
        return Stream.iterate(new long[] {1, 1}, pair -> new long[] {pair[1], pair[0] + pair[1]})
                .limit(n)
                .reduce((first, last) -> last)
                .orElse(null)[0];
    }

    /**
     * Returns the next fibonacci number based on previous entries
     * @param prePrev the pre-previous number
     * @param prev the previous number
     * @return the next fibonacci number
     */
    private long nextFibonacciNumber(long prePrev, long prev) {
        return prePrev + prev;
    }

    private int getIntFromConsole() {
        return sc.nextInt();
    }

    public static void main(String[] args) {
        FibonacciSequence worker = new FibonacciSequence();
        System.out.println(
                "Please enter the mode of operation: \n" +
                "1: generate immediate fibonacci number by index\n" +
                "2: generate numbers up to index");
        int choice = worker.getIntFromConsole();
        switch (choice) {
            case 1:
                System.out.println("Please enter the number index: ");
                System.out.println(worker.nthFibonacciNumber(worker.getIntFromConsole()));
                break;
            case 2:
                long prePrev = 0, prev = 1, curr;
                System.out.println("Please enter the number index: ");
                int index = worker.getIntFromConsole();
                for (int i = 1; i <= index; i++) {
                    System.out.printf("%d ", prev);
                    curr = worker.nextFibonacciNumber(prePrev, prev);
                    prePrev = prev;
                    prev = curr;
                }
                break;
            default:
                System.out.println("You were so wrong...");
                System.exit(0);
        }
    }
}
