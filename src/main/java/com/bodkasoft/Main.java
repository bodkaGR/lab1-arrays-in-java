package com.bodkasoft;

/* TODO
* C5 = 4 (C = A * B)
* C7 = 3 (int)
* C11 = Знайти середнє значення елементів кожного стовпчика матриця
* */

public class Main {

    public static void main(String[] args) {

        int[][] A = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] B = {
                {7, 8},
                {9, 10},
                {11, 12}
        };

        try{

            System.out.println("<----- Matrix A ----->");
            Printer.print(A);

            System.out.println("<----- Matrix B ----->");
            Printer.print(B);

            int[][] result = MatrixСalculation.multiply(A, B);

            System.out.println("\n<----- Matrix multiplication ----->");
            Printer.print(result);

            int[] avg = MatrixСalculation.avgOfCols(result);

            System.out.println("\n<----- Avg of columns elements ----->");
            for(int element : avg){
                System.out.print(element + " ");
            }

        }catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }

}