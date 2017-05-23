package com.aheavenx.p35;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * OVERENGINEERING DETECTED!!!
 * @author Skovorodnikov
 *         Created on 22.05.2017 15:57
 */
public class PigLatin {

    public static class PigLatinUtils {

        private static final Pattern TOKENS = Pattern.compile("[~!@#$%^&*()`\\-_=+\\]\\[{}|/?.>,<\"'\\\\;:\\s]+");
        private static final Pattern BOUND = Pattern.compile("(?=\\b\\w*\\b)");
        private static final String VOWELS = "aeiouyAEIOUY";

        private boolean isFirstLetterVowel(String s) {
            return s.matches("\\b[" + VOWELS + "]+.*");
        }

        private boolean isFirstLetterDelimiter(String s) {
            return TOKENS.matcher(s).find();
        }

        private int getFirstVowelIndex(String s, int start) {
            if (isFirstLetterVowel(s) || isFirstLetterDelimiter(s)) return start;
            else return getFirstVowelIndex(s.substring(1), ++start);
        }

        private String getFirstConsonants(String s) {
            return s.substring(0, getFirstVowelIndex(s, 0));
        }

        private String pigTransformWord(String input) {
            if (isFirstLetterDelimiter(input)) return input;
            if (isFirstLetterVowel(input)) return input + "hay";
            else {
                String consonants = getFirstConsonants(input);
                boolean isFirstCapital = ((consonants.charAt(0) >= 'A') && (consonants.charAt(0) <= 'Z'));
                String result = input.substring(consonants.length()) + consonants.toLowerCase() + "ay";
                return isFirstCapital ? result.toUpperCase().charAt(0) + result.substring(1) : result;
            }
        }

        String pigTransform(String s) {
            return BOUND.splitAsStream(s).map(this::pigTransformWord).collect(Collectors.joining());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the string: ");
        String sentence = sc.nextLine();
        System.out.println(new PigLatin.PigLatinUtils().pigTransform(sentence));
    }
}
