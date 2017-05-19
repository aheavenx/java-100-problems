package com.aheavenx.p5;

import java.util.Scanner;
import java.util.stream.LongStream;

/**
 * @author Skovorodnikov
 *         Created on 19.05.2017 16:51
 */
public class NextPrimes {

    private boolean isPrime(long x) {
        return LongStream.rangeClosed(2, ((long) Math.sqrt(x))).allMatch(n -> x % n != 0);
    }

    private long nextPrime(long prevPrime) {
        return LongStream.iterate(prevPrime + 1, n -> n + 1).filter(this::isPrime).findFirst().orElse(prevPrime);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long firstPrime = 2;
        while (sc.nextInt() > 0) {
            System.out.println(firstPrime);
            firstPrime = new NextPrimes().nextPrime(firstPrime);
        }
    }
}
