package com.algo.sorting;

import java.util.Arrays;
import java.util.Comparator;

public class AnagramsComparator implements Comparator<String> {

    @Override
    public int compare(String word1, String word2) {
        return sortChars(word1).compareTo(sortChars(word2));

    }

    private String sortChars(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
