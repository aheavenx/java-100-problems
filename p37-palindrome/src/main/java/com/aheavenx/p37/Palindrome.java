package com.aheavenx.p37;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author Skovorodnikov
 *         Created on 23.05.2017 10:43
 */
public class Palindrome {

    public static void main(String[] args) {
        System.out.println("Please enter a sentence (word): ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String nonJunk = Arrays.stream(s.toLowerCase().split("\\W+")).collect(Collectors.joining());
        boolean isPalindrome = nonJunk.equals(new StringBuilder(nonJunk).reverse().toString());
        System.out.println("This is" + (isPalindrome ? "" : " not") + " a palindrome");
    }
}
