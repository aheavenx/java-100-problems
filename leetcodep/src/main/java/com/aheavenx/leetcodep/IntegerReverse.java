package com.aheavenx.leetcodep;

/**
 * Created by aheavenx on 28.11.17.
 */
public class IntegerReverse {
    public static void main(String[] args) {
        System.out.println(new IntegerReverse().reverse(123));
    }

    public int reverse (int xx) {
        int lastDigit;
        int reversedNumber = 0;
        int addable;
        int x = Math.abs(xx);
        while (x / 10 != 0) {
            lastDigit = x % 10;
            addable = reversedNumber * 10 + lastDigit;
            if (addable < reversedNumber)
                return 0;
            reversedNumber = addable;
            x /= 10;
        }
        addable = reversedNumber * 10 + x % 10;
        reversedNumber = (xx < 0) ? -addable : addable;
        return reversedNumber;
    }
}
