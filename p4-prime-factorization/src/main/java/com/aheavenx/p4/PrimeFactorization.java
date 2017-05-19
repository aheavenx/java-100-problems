package com.aheavenx.p4;

import java.util.Scanner;
import java.util.stream.LongStream;

/**
 * @author Skovorodnikov
 *         Created on 19.05.2017 14:58
 */
public class PrimeFactorization {


    public LongStream getPrimeFactorsStream(long number) {
        return LongStream.rangeClosed(2, number)
                .filter(n -> number % n == 0)
                .mapToObj(n -> LongStream.concat(LongStream.of(n), getPrimeFactorsStream(number / n)))
                .findFirst()
                .orElse(LongStream.of(number));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Please enter the number to factorize");
            long number = sc.nextLong();
            if (number < 0) break;
            long start = System.currentTimeMillis();
            LongStream primeFactorsStream = new PrimeFactorization().getPrimeFactorsStream(number).distinct();
            System.out.println("Time elapsed approx: " + ((System.currentTimeMillis() - start) / 1000) + " secs\nFactors:");
            primeFactorsStream.forEach(n -> System.out.printf("%d ", n));
        }
    }
}
