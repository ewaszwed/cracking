//1.2

package com.algoritms;

import java.util.Arrays;

public class Permutation
{

    private static String sort(String s)
    {
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }
    // uses sorting, is a clean algorithm
    public static boolean isPermutation(String word1, String word2)
    {
        if (word1.length() != word2.length()) {
            return false;
        }
        return sort(word1).equals(sort(word2));
    }

    public static boolean isPermutation2(String word1, String word2)
    {

        if (word1.length() != word2.length()) {
            return false;
        }
        int[] letters = new int[128];

        for (int i = 0; i < word1.length(); i++) {
            letters[word1.charAt(i)]++;
        }
        for (int i = 0; i < word2.length(); i++) {
            letters[word2.charAt(i)]--;
            if(letters[word2.charAt(i)] < 0)
                return false;
        }
        return true;
    }
}