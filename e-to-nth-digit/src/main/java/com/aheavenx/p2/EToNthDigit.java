package com.aheavenx.p2;

import java.util.Scanner;
import java.util.stream.LongStream;

/**
 * TASK: Find e to the Nth Digit<br>
 * Just like the previous problem, but with e instead of PI.<br>
 * Enter a number and have the program generate e up to that many decimal places.<br>
 * Keep a limit to how far the program will go.
 * @author Skovorodnikov
 *         Created on 17.05.2017 15:02
 */
public class EToNthDigit {

    /**
     * Calculates the factorial of a number using the /kinda/ functional approach
     * @param n the number which factorial is to be calculated
     * @return the factorial of a number
     * @throws IllegalArgumentException
     */
    public long factorial(long n) throws IllegalArgumentException {
        if ((n < 1) || (n > 25)) throw new IllegalArgumentException("n is out of range");
        return LongStream.range(2, n + 1).reduce(1, (f1, f2) -> f1 * f2);
    }

    /**
     * Calculates the E number up to the given digit<br>
     * This method uses th <b>Series method</b>:
     * <ol>
     *     <li>Set up the initial values {@code eHigh} and {@code eLow}</li>
     *     <li>Calculate the epsilon value of precision</li>
     *     <li>Perform the loop of calculating infinite series till the precision limits are met</li>
     * </ol>
     * @param digit the digit limit
     * @return E with the given precision
     */
    public double eUpToDigit(short digit) throws IllegalArgumentException {
        if (digit < 1) throw new IllegalArgumentException("digit must be greater than 0");
        double eHigh = 2., eLow = eHigh + 0.5;
        double epsilon = Math.pow(10., -digit - 1.);
        for (int i = 3; Math.abs(eHigh - eLow) > epsilon; i++) {
            eHigh = eLow + 1. / factorial(i);
            eLow = eHigh + 1. / factorial(++i);
        }
        return eHigh;
    }

    public static void main(String[] args) {
        EToNthDigit worker = new EToNthDigit();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the digit: ");
        short digits = sc.nextShort();
        long start = System.currentTimeMillis();
        double result = worker.eUpToDigit(digits);

        System.out.printf("%." + digits + "f\nTime elapsed: %d milliseconds", result, System.currentTimeMillis() - start);
    }

}
