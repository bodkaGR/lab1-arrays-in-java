package com.bodkasoft;

public class Printer {

    public static void print(int[][] matrix){
        if (matrix == null){
            throw new IllegalArgumentException("Matrix is null");
        }

        if (MatrixChecker.checkForNullRow(matrix)){
            throw new IllegalArgumentException("One of the rows in matrix is null");
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
