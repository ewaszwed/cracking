package com.algoritms;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringRotationTest {
    
    public StringRotationTest() {
    }

    @org.junit.Test
    public void StringRotationCase1()
    {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";
        boolean expResult = true;
        boolean result = StringRotation.isRotation(s2, s1);
        assertEquals(expResult, result);
    }
    
}
