/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algo.sorting;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ewaszwed
 */
public class ArrayMergeTest {
    
    public ArrayMergeTest() {
    }

    @Test
    public void testMergeArrays() {
        
        int[] arrayA = {1,2,3,4,5,6,0,0,0,0,0,0};
        int[] arrayB = {3,4,5,6,8,9};
        
        int[] result = {1,2,3,3,4,4,5,5,6,6,8,9};
        ArrayMerge.mergeArrays(arrayA, arrayB);
        System.out.println("array" + arrayA);
        assertArrayEquals(result, arrayA);
        
    }
    
}
