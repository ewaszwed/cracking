package com.algoritms;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;

public class UniquenessTest
{

    public UniquenessTest()
    {
    }

    @BeforeClass
    public static void setUpClass()
    {
    }

    @AfterClass
    public static void tearDownClass()
    {
    }

    @Before
    public void setUp()
    {
    }

    @After
    public void tearDown()
    {
    }

    @org.junit.Test
    public void isUniqueChars_shouldReturnTrue()
    {
        String word = "qwertyu";
        boolean expResult = true;
        boolean result = Uniqueness.isUniqueChars(word);
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void isUniqueChars_shouldReturnTrueForLongStrings()
    {
        String word = "1234567890qwertyuiopasdfghjklzxcvbnm,./";
        boolean expResult = true;
        boolean result = Uniqueness.isUniqueChars(word);
        assertEquals(expResult, result);
    }

    @org.junit.Test(expected = ArrayIndexOutOfBoundsException.class)
    public void isUniqueChars_ShoudThowException_forNonASCII()
    {
        String word = "1234567890qwertyuiopasdfghjklzxcvbnm,./ą";
        boolean expResult = true;
        boolean result = Uniqueness.isUniqueChars(word);
    }

    @org.junit.Test
    public void isUniqueChars_shouldReturnTrue_forUpperAndLowerCase()
    {
        String word = "qwertyuQWERTYU";
        boolean expResult = true;
        boolean result = Uniqueness.isUniqueChars(word);
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void isUniqueChars_shouldReturnFalse()
    {
        String word = "qwertyuq";
        boolean expResult = false;
        boolean result = Uniqueness.isUniqueChars(word);
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void isUniqueCharsNoNewDS_shouldReturnTrue()
    {
        String word = "qwertyu";
        boolean expResult = true;
        boolean result = Uniqueness.isUniqueCharsNoNewDS(word);
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void isUniqueCharsNoNewDS_shouldReturnTrueForLongStrings()
    {
        String word = "1234567890qwertyuiopasdfghjklzxcvbnm,./";
        boolean expResult = true;
        boolean result = Uniqueness.isUniqueCharsNoNewDS(word);
        assertEquals(expResult, result);
    }

    @org.junit.Test
    
    public void isUniqueCharsNoNewDS_shouldReturnTrue_forNonASCII()
    {
        String word = "1234567890qwertyuiopasdfghjklzxcvbnm,./ą";
        boolean expResult = true;
        boolean result = Uniqueness.isUniqueCharsNoNewDS(word);
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void isUniqueCharsNoNewDS_shouldReturnTrue_forUpperAndLowerCase()
    {
        String word = "qwertyuQWERTYU";
        boolean expResult = true;
        boolean result = Uniqueness.isUniqueCharsNoNewDS(word);
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void isUniqueCharsNoNewDS_shouldReturnFalse()
    {
        String word = "qwertyuq";
        boolean expResult = false;
        boolean result = Uniqueness.isUniqueCharsNoNewDS(word);
        assertEquals(expResult, result);
    }

}
