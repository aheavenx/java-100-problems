package com.aheavenx.p34;

import java.util.Scanner;

/**
 * @author Skovorodnikov
 *         Created on 22.05.2017 14:07
 */
public class ReverseString {

    private static String reverseRecur(String candidate) {
        if (candidate.length() == 0) return candidate;
        return reverseRecur(candidate.substring(1)) + candidate.charAt(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print    ("Please enter the string: ");
        String candidate = sc.nextLine();
        long start = System.nanoTime();
        System.out.println  ("Reverse StringBuilder:   " + new StringBuilder(candidate).reverse().toString() + "\n It took " + ((System.nanoTime() - start) / 1e6) + "ms");
        start = System.nanoTime();
        System.out.println  ("Reverse recursive:       " + reverseRecur(candidate) + "\n It took " + ((System.nanoTime() - start) / 1e6) + "ms");
    }
}
