/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algo.math;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ewaszwed
 */
public class PrimeNumbersTest {

    public PrimeNumbersTest() {
    }

    /**
     * Test of isPrimeNaive method, of class PrimeNumbers.
     */
    @Test
    public void testIsPrimeNaive() {
    }

    /**
     * Test of isPrimeBetter method, of class PrimeNumbers.
     */
    @Test
    public void testIsPrimeBetter() {
    }

    /**
     * Test of sieveOfEratosthenes method, of class PrimeNumbers.
     */
    @Test
    public void testSieveOfEratosthenes() {

        int max = 50000;
        
        boolean[] primes = PrimeNumbers.sieveOfEratosthenes(max);

        int noOfPrimes = 0;
        int noOfNoPrimes = 0;
        
        for (int i = 0; i < primes.length; i++) {
            boolean result = PrimeNumbers.isPrimeBetter(i);

            if (primes[i] == true) {
                System.out.println("Prime: " + i);
                boolean expResult = true;
                assertEquals(expResult, result);
                noOfPrimes++;
            } else {
                System.out.println("Not prime: " + i);
                boolean expResult = false;
                assertEquals(expResult, result);
                noOfNoPrimes++;
            }

        }

        System.out.println("No of primes numbers to " + max + " - " + noOfPrimes);
        System.out.println("No of non primes numbers to " + max + " - " + noOfNoPrimes);
    }
}
