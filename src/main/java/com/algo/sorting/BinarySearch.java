package com.algo.sorting;

public class BinarySearch {

    public static int binarySearch(int[] array, int num, int start, int end) {
        if (start > end) {
            return -1;
        }
        int middle = (start + end) / 2;

        if (num < array[middle]) {
            return binarySearch(array, num, start, middle - 1);

        } else if (num > array[middle]) {
            return binarySearch(array, num, middle + 1, end);

        } else {
            return middle;
        }

    }

    public static int binarySearch(int[] array, int num) throws Exception {
        if (array == null) {
            throw new Exception();
        }
        int start = 0;
        int end = array.length - 1;
        return binarySearch(array, num, start, end);
    }

}
