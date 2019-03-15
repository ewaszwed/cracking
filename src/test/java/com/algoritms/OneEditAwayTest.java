package com.algoritms;

import static org.junit.Assert.*;

public class OneEditAwayTest
{

    @org.junit.Test
    public void shouldReturnTrueForTheSameStrings()
    {
        String word1 = "ewa";
        String word2 = "ewa";
        boolean result = OneEditAway.isOneEditAway(word1, word2);
        assertEquals(true, result);
    }

    @org.junit.Test
    public void shouldReturnTrueForOneReplacement()
    {
        String word1 = "ew1";
        String word2 = "ewa";
        boolean result = OneEditAway.isOneEditAway(word1, word2);
        assertEquals(true, result);
    }

    @org.junit.Test
    public void shouldReturnFalseForTwoReplacements()
    {
        String word1 = "2w1";
        String word2 = "ewa";
        boolean result = OneEditAway.isOneEditAway(word1, word2);
        assertEquals(false, result);
    }

    @org.junit.Test
    public void shouldReturnFalseForTwoStringWithLenghtsDifferentMoreThanOne()
    {
        String word1 = "ewawe";
        String word2 = "ewa";
        boolean result = OneEditAway.isOneEditAway(word1, word2);
        assertEquals(false, result);
    }

    @org.junit.Test
    public void shouldReturnTrueForOneAddition()
    {
        String word1 = "ewa";
        String word2 = "tewa";
        boolean result = OneEditAway.isOneEditAway(word1, word2);
        assertEquals(true, result);
    }

    @org.junit.Test
    public void shouldReturnTrueForOneDeletion()
    {
        String word1 = "tewa";
        String word2 = "ewa";
        boolean result = OneEditAway.isOneEditAway(word1, word2);
        assertEquals(true, result);
    }

    @org.junit.Test
    public void shouldReturnTrueForOneAdditionAtTheEnd()
    {
        String word1 = "ewat";
        String word2 = "ewa";
        boolean result = OneEditAway.isOneEditAway(word1, word2);
        assertEquals(true, result);
    }

    @org.junit.Test
    public void shouldReturnTrueForMoreThanOneAddition()
    {
        String word1 = "ewat";
        String word2 = "twa";
        boolean result = OneEditAway.isOneEditAway(word1, word2);
        assertEquals(false, result);
    }
}
