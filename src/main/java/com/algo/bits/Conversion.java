package com.algo.bits;

// write a function that will return how many bits you need to flip to convert int 1 to int 2
public class Conversion {

    public static int numberOfFlips(int n, int m) {

        // for every bit in bigger number
        //
        int counter = 0;
        for (int prod = n ^ m; prod != 0; prod = prod >>> 1) {
            counter += prod & 1;
        }
        return counter;
    }
}
