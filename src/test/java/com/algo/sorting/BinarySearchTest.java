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
public class BinarySearchTest {

    public BinarySearchTest() {
    }

    @Test
    public void testBinarySearchCase1() throws Exception {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int num = 2;
        int expRes = 1;
        int result = BinarySearch.binarySearch(array, num);
        assertEquals(expRes, result);

    }

    @Test
    public void testBinarySearchCase2() throws Exception {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int num = 20;
        int expRes = -1;
        int result = BinarySearch.binarySearch(array, num);
        assertEquals(expRes, result);
    }

}
