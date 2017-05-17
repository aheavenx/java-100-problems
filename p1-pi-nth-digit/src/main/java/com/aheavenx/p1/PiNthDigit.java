package com.aheavenx.p1;

import java.util.Scanner;

/**
 * TASK:
 * Find PI to the Nth Digit<br>
 * Enter a number and have the program generate PI up to that many decimal places.<br>
 * Keep a limit to how far the program will go.
 * @author Skovorodnikov
 *         Created on 17.05.2017 13:05
 */
public class PiNthDigit {

    /**
     * Calculates the PI number up to the given digit<br>
     * This method uses th <b>Gaussian method</b>:
     * <ol>
     *     <li>Set up the initial values {@code piHigh} and {@code piLow}</li>
     *     <li>Calculate the epsilon value of precision</li>
     *     <li>Perform the loop of calculating infinite series till the precision limits are met</li>
     * </ol>
     * It becomes kinda slow after the 8th...
     * @param digit the digit limit
     * @return PI with the given precision
     */
    public double piUpToDigit(short digit) throws IllegalArgumentException {

        if (digit < 1) throw new IllegalArgumentException("The number should be greater than 0");

        double piHigh = 4.0 - 4.0 / 3, piLow = piHigh + 4.0 / 5;
        double epsilon = Math.pow(10.0, -digit + .0);

        for (int i = 3; Math.abs(piHigh - piLow) > epsilon; i += 2) {
            piHigh = piLow - 4.0 / (2 * i + 1);
            piLow = piHigh + 4.0 / (2 * i + 3);
        }
        return piHigh;
    }

    public static void main(String[] args) {

        PiNthDigit worker = new PiNthDigit();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the n-th digit: ");
        short digits = sc.nextShort();

        long start = System.currentTimeMillis();
        double result = worker.piUpToDigit(digits);

        System.out.printf("%." + digits + "f\nTime elapsed: %d milliseconds", result, System.currentTimeMillis() - start);
    }
}
