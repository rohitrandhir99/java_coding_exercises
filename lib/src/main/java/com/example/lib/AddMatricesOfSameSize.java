package com.example.lib;
import java.util.Scanner;

/*
    Write a program to add two matrices of the same size.

    example -:

    1  2  1         2  1  2         3  3  3
    2  1  3   +     3  2  1    =    5  3  4
    3  2  1         1  3  2         4  5  3

*/

public class AddMatricesOfSameSize {
    public static void main(String[] args) {
        int row, col, c, d;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Row's : ");
        row = sc.nextInt();

        System.out.println("Enter the number of Col's : ");
        col = sc.nextInt();

        // Creating the matrices
        int array1[][] = new int[row][col];
        int array2[][] = new int[row][col];
        int sum[][] = new int[row][col];

        // Getting the elements of Matrix

        // 1st matrix
        System.out.println("Enter the elements of 1st matrix : ");
        for(c = 0; c < row; c++) { // row
            for(d = 0; d < col; d++) { // col
                array1[c][d] = sc.nextInt();
            }
        }

        // 2nd matrix
        System.out.println("Enter the elements of 2nd matrix : ");
        for(c = 0; c < row; c++) { // row
            for(d = 0; d < col; d++) { // col
                array2[c][d] = sc.nextInt();
            }
        }

        // Making the addition of 2 matrices
        System.out.println("Adding two matrices : ");
        for(c = 0; c < row; c++) {
            for(d = 0; d < col; d++) { // col
                sum[c][d] = array1[c][d] + array2[c][d];
            }
        }

        System.out.println("Sum of the Matrices : ");

        // Displaying the result matrix
        for(c = 0; c < row; c++) {
            for(d = 0; d < col; d++) { // col
                System.out.print(sum[c][d] + "\t");
            }
            System.out.println();
        }


    }
}
