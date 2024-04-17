package com.example.lib;


/*
    Write a program to make sucn a pattern like pyramid with a
    number which will repeat the number in the same row.

    example -:

            1
          2   2
        3   3   3
      4   4  4    4
*/

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        int i, j, x, n, s;

        System.out.println("Please enter a number : ");

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        s = n + 4 - 1;

        for (i = 1; i <= n; i++) { // rows

            for(x = s; x != 0; x--) { // spaces
                System.out.print(" ");
            }

            for (j = 1; j <= i; j++) { // numbers
                System.out.print(i + " ");
            }

            System.out.println();
            s--;
        }

    }
}
