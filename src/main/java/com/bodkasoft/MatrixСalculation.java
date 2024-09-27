package com.bodkasoft;

public class MatrixСalculation {

    public static int[][] multiply(int[][] A, int[][] B) {
        if(A == null || B == null){
            throw new IllegalArgumentException("A or B are null");
        }

        if(MatrixChecker.checkForNullRow(A) || MatrixChecker.checkForNullRow(B)){
            throw new IllegalArgumentException("One of the rows is null");
        }

        if(A[0].length != B.length){
            throw new IllegalArgumentException("Number of columns in Matrix A must equal number of rows in Matrix B.");
        }

        int[][] C = new int[A.length][B[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < A[0].length; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return C;
    }

    public static int[] avgOfCols(int[][] matrix) {
        if (matrix == null){
            throw new IllegalArgumentException("Matrix is null");
        }

        if(MatrixChecker.checkForNullRow(matrix)){
            throw new IllegalArgumentException("One of the rows is null");
        }

        int[] avg = new int[matrix[0].length];

        for (int j = 0; j < matrix[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < matrix.length; i++) {
                sum += matrix[i][j];
            }
            avg[j] = sum / matrix.length;
        }

        return avg;
    }
}
