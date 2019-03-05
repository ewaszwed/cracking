package com.algo.math;

public class PrimeNumbers {

    public static boolean isPrimeNaive(int number) {

        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static boolean isPrimeBetter(int number) {

        if (number < 2) {
            return false;
        }

        int numSqrt = (int) Math.sqrt(number);
        for (int i = 2; i <= numSqrt; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static boolean[] sieveOfEratosthenes(int max) {
        boolean[] flags = new boolean[max + 1];
        // set all flags to 1 except 0 and 1
        init(flags);
        int prime = 2;
        while (prime <= Math.sqrt(max)) {
            // cross off remaing multiples of prime
            crossOff(flags, prime);

            // find next uncrossed number
            prime = getNextPrime(flags, prime);

        }
        return flags;

    }

    private static void init(boolean[] flags) {
        for (int i = 2; i < flags.length; i++) {
            flags[i] = true;
        }
    }

    private static void crossOff(boolean[] flags, int prime) {

        for (int i = prime * prime; i < flags.length; i += prime) {
            flags[i] = false;
        }

    }

    private static int getNextPrime(boolean[] flags, int prime) {
        int next = prime + 1;
        while (next < flags.length && !flags[next]) {
            next++;
        }
        return next;
    }
}
