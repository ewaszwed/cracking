package com.algo.sorting;

public class QuickSorting {

    void quickSort(int[] arr, int left, int right) {
        int pivot = partition(arr, left, right);

        if (pivot >= left) {
            quickSort(arr, left, pivot - 1);

        }
        if (pivot < right) {
            quickSort(arr, pivot + 1, right);
        }
    }

    int partition(int[] array, int left, int right) {
        int pivot = array[right];

        int i = (left - 1); // Index of smaller element

        for (int j = left; j <= right - 1; j++) {
            // If current element is smaller than or
            // equal to pivot
            if (array[j] <= pivot) {
                i++;    // increment index of smaller element

                int arrayI = array[i];
                int arrayJ = array[j];

                array[i] = arrayJ;
                array[j] = arrayI;
            }
        }
        int arrayI = array[i + 1];
        int arrayRight = array[right];

        array[i + 1] = arrayRight;
        array[right] = arrayI;

        return (i + 1);
    }

}
