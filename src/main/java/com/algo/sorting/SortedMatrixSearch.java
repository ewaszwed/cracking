package com.algo.sorting;

public class SortedMatrixSearch {

// find element n in matrix where columns and rows are sorted    
    boolean findElement(int[][] array, int num) {

        int row = 0; // take the fist row
        int column = array[0].length - 1; // take the last column

        //start checking
        while (row < array.length && column >= 0) {
            if (array[row][column] == num) {
                System.out.println("Number: " + num + " is at position" + row + "|" + column);
                return true;
            } else if (array[row][column] > num) {
                column--;
            } else {
                row++;
            }
        }
        return false;
    }
}
