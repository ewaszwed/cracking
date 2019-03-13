package com.algoritms;
//1.7

public class RotateMatrix {

    public static boolean rotate(int[][] matrix) {
        if (matrix.length == 0 || matrix.length != matrix[0].length) {
            return false;
        }
        int n = matrix.length;
        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer;
            int last = n - 1 - layer;
            for (int i = first; i < last; i++) {
                int offset = i - first;
                int top = matrix[first][i]; //save top

                //left --> top
                matrix[first][i] = matrix[last - offset][first];

                //bottom --> left
                matrix[last - offset][first] = matrix[last][last - offset];

                //right --> bottom
                matrix[last][last - offset] = matrix[i][last];

                //top --> right
                matrix[i][last] = top;
            }
        }
        return true;
    }

    public static int[][] rotate2(int[][] matrix) {
        int[][] rotatedMatrix = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {

                rotatedMatrix[j][matrix.length - i - 1] = matrix[i][j];
            }
        }
        return rotatedMatrix;
    }

    public static void main(String[] args) {

        int[][] matrix = {{2, 3, 4}, {6, 8, 4}, {13, 65, 34}};

        int[][] rotatedMax = rotate2(matrix);

        for (int[] rotatedMax1 : rotatedMax) {
            for (int j = 0; j < rotatedMax[0].length; j++) {
                System.out.println(rotatedMax1[j]);
            }
        }
    }
}
