package com.algoritms;

public class OneEditAway
{
    private static char[] getArray(String text)
    {
        char[] textAsArray = text.toLowerCase().toCharArray();
        return textAsArray;
    }

    private static char[] getShorter(char[] one, char[] two)
    {
        if (one.length < two.length) {
            return one;
        }
        else {
            return two;
        }
    }

    private static char[] getLonger(char[] one, char[] two)
    {
        if (one.length > two.length) {
            return one;
        }
        else {
            return two;
        }
    }

    public static boolean isOneEditAway(String one, String two)
    {
        char[] wordOne = getArray(one);
        char[] wordTwo = getArray(two);

        if (wordOne.length == wordTwo.length) {
            return handleSameLength(wordOne, wordTwo);
        }
        else {
            return handleDifferentLength(wordOne, wordTwo);
        }

    }

    private static boolean handleDifferentLength(char[] wordOne, char[] wordTwo)
    {
        int count = 0;
        
        char[] shorter = getShorter(wordOne, wordTwo);
        char[] longer = getLonger(wordOne, wordTwo);

        if (longer.length - shorter.length > 1) {
            return false;
        }

        int longerIndex = 0;

        for (int shorterIndex = 0; shorterIndex < shorter.length; shorterIndex++) {

            if (longer[longerIndex] != shorter[shorterIndex]) {
                longerIndex = shorterIndex + 2;
                count++;
            }
            else {
                longerIndex++;
            }
            if (count > 1) {
                return false;
            }
        }
        return true;
    }

    private static boolean handleSameLength(char[] wordOne, char[] wordTwo)
    {
        int count = 0;

        for (int i = 0; i < wordOne.length; i++) {
            if (wordOne[i] != wordTwo[i]) {
                count++;
            }
            if (count > 1) {
                return false;
            }
        }
        return true;
    }
}
