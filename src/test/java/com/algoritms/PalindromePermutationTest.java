package com.algoritms;

import static org.junit.Assert.*;

public class PalindromePermutationTest
{

    @org.junit.Test
    public void shouldReturnFalse()
    {
        String word = "Hello     ";
        boolean result = PalindromePermutation.isPalindromePermutiation(word);
        assertEquals(false, result);
    }

    @org.junit.Test
    public void shouldReturnTrueForPalindrom()
    {
        String word = "kobyla ma malybok";
        boolean result = PalindromePermutation.isPalindromePermutiation(word);
        assertEquals(true, result);
    }

    @org.junit.Test
    public void shouldReturnTrueForPalindromPermutation()
    {
        String word = "obyyl ma malbaokk";
        boolean result = PalindromePermutation.isPalindromePermutiation(word);
        assertEquals(true, result);
    }

    @org.junit.Test
    public void shouldReturnTrueForPalindromPermutationCase()
    {
        String word = "TactCoa";
        boolean result = PalindromePermutation.isPalindromePermutiation(word);
        assertEquals(true, result);
    }

}
