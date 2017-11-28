package com.aheavenx.p14;

/**
 * @author Skovorodnikov
 *         Created on 7/28/2017 3:11 PM
 */



public class CreditCardValidator {

    private boolean isValid(String number) {
        int lastDigit = number.charAt(number.length() - 1) - 0x30;
        int sum = 0;
        String validating = new StringBuilder(number.substring(0, number.length() - 1)).reverse().toString();
        for (int i = 0; i < validating.length(); i++) {
            int num = validating.charAt(i) - 0x30;
            sum += i % 2 != 0 ?
                    num :
                    ((num * 2) > 9 ? num * 2 - 9 : num * 2);
        }
        return sum % 10 == lastDigit;
    }

    public static void main(String[] args) {
        System.out.println(new CreditCardValidator().isValid("676280389877527353"));
        System.out.println(new CreditCardValidator().isValid("4556737586899855"));
        System.out.println(new CreditCardValidator().isValid("6761593990156606"));
        System.out.println(new CreditCardValidator().isValid("5595672452489525"));
        System.out.println(new CreditCardValidator().isValid("34"));
    }
}
