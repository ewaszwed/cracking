/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algo.sorting;

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ewaszwed
 */
public class AnagramsComparatorTest {

    public AnagramsComparatorTest() {
    }

    @Test
    public void testCompare() {
        String[] test = {"ewa", "kto", "ja", "wea", "aj", "otk", "ala", "maja", "adam", "jama"};

        Arrays.sort(test, new AnagramsComparator());

        for (String s : test) {
            System.out.println("word: " + s);
        }

    }

}
