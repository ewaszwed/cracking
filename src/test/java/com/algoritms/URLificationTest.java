package com.algoritms;

import static org.junit.Assert.*;

public class URLificationTest
{

    @org.junit.Test
    public void urlIfyCase1()
    {
        String word = "Hello";
        String expResult = "Hello";
        String result = URLification.urlIfy(word, 5);
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void urlIfyCase2()
    {
        String word = "Hello     ";
        String expResult = "Hello";
        String result = URLification.urlIfy(word, 5);
        assertEquals(expResult, result);
    }

}
