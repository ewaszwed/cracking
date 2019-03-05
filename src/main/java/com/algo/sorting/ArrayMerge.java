package com.algo.sorting;

public class ArrayMerge {

    // arrayA = {1,2,3,4,5,x,x,x,x}
    // arrayB = {3,4,5,6}
    // arrayA = {1,2,3,3,4,4,5,5,6}
    public static void mergeArrays(int[] arrayA, int[] arrayB) {

        int lastA = arrayA.length - 1;
        int lastB = arrayB.length - 1;

        int lastANonEmpty = getLastNonEmpty(arrayA);

        while (lastANonEmpty <= 0 || lastB <= 0) {
            if (arrayA[lastANonEmpty] > arrayB[lastB]) {
                arrayA[lastA] = arrayA[lastANonEmpty];
                lastA--;
                lastANonEmpty--;
            }

            if (arrayA[lastANonEmpty] < arrayB[lastB]) {
                arrayA[lastA] = arrayB[lastB];
                lastB--;
                lastANonEmpty--;
            }
            if (arrayA[lastANonEmpty] == arrayB[lastB]) {
                arrayA[lastA] = arrayA[lastANonEmpty];
                arrayA[lastA - 1] = arrayB[lastB - 1];
                lastA--;
                lastB--;
                lastANonEmpty--;
            }
        }

    }

    private static int getLastNonEmpty(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] != 0) {
                return i;
            }
        }
        return -1;
    }

}
