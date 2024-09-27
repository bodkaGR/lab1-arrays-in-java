package com.bodkasoft;

public class MatrixChecker {
    public static boolean checkForNullRow(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] == null){
                return true;
            }
        }

        return false;
    }

}
