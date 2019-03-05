package com.algoritms;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StringCompressionTest
{

    public StringCompressionTest()
    {
    }

    @Test
    public void testCompress()
    {
    }

    @org.junit.Test
    public void shouldReturnInputString()
    {
        String word = "ewa";
        String expResult = "ewa";

        String result = StringCompression.compress(word);
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void shouldReturnCompressedString()
    {
        String word = "ewaaaaaa";
        String expResult = "e1w1a6";

        String result = StringCompression.compress(word);
        assertEquals(expResult, result);
    }
    
        @org.junit.Test
    public void shouldReturnInputStringEfficient()
    {
        String word = "ewa";
        String expResult = "ewa";

        String result = StringCompression.compressEfficient(word);
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void shouldReturnCompressedStringEfficient()
    {
        String word = "ewaaaaaa";
        String expResult = "e1w1a6";

        String result = StringCompression.compressEfficient(word);
        assertEquals(expResult, result);
    }
}
