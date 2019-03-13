//1.4

// We need to check if character appears in pairs, at most 1 character can be without a pair
package com.algoritms;

public class PalindromePermutation
{

    private static char[] getArray(String text)
    {
        char[] textAsArray = text.toLowerCase().toCharArray();
        return textAsArray;
    }

    public static boolean isPalindromePermutiation(String word)
    {
        char[] textAsArray = getArray(word);
        int[] letters = countNumberOfChars(textAsArray);
        return checkIfNoMoreThanOne(letters);
    }

    private static int[] countNumberOfChars(char[] textAsArray)
    {
        int[] letters = new int[128];
        for (int i = 0; i < textAsArray.length; i++) {
            if (letters[textAsArray[i]] % 2 == 0) {
                letters[textAsArray[i]]++;
            }
            else {
                letters[textAsArray[i]]--;
            }

        }
        return letters;
    }

    private static boolean checkIfNoMoreThanOne(int[] letters)
    {
        int counter = 0;

        for (int i = 0; i < letters.length; i++) {
            if (letters[i] != 0 && letters[i] != 1) {
                return false;
            }
            if (letters[i] == 1) {
                counter++;
            }

        }
        return counter <= 1;
    }
}