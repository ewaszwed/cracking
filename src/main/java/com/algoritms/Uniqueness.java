// 1.1

package com.algoritms;

public class Uniqueness {

    public static boolean isUniqueChars(String word) {

        if (word.length() > 128) {
            return false;
        }
        // ASCII allows 128 different character - 2^7
        // ASCII is a subset of Unicode which allows 2^21 characters
        
        boolean[] char_set = new boolean[128];
        for (int i = 0; i < word.length(); i++) {
            int val = word.charAt(i);
            if (char_set[val]) {
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }

    public static boolean isUniqueCharsNoNewDS(String word) {
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

}
