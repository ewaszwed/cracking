package com.algoritms;

import java.util.ArrayList;

public class ZeroMatrix {

    public static int[][] zeroMatrix(int[][] matrix) {

        ArrayList<Integer> rowsToClear = new ArrayList();
        ArrayList<Integer> colsToClear = new ArrayList();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    rowsToClear.add(i);
                    colsToClear.add(j);
                }
            }
        }

        clearRows(rowsToClear, matrix);
        clearColumns(colsToClear, matrix);
        return matrix;

    }

    private static void clearRows(ArrayList<Integer> rowsToClear, int[][] matrix) {
        rowsToClear.forEach((row) -> {
            for (int i = 0; i < matrix.length; i++) {
                matrix[row][i] = 0;
            }
        });
    }

    private static void clearColumns(ArrayList<Integer> colsToClear, int[][] matrix) {
        colsToClear.forEach((col) -> {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[j][col] = 0;
            }
        });
    }

}
