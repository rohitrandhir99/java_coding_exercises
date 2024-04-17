package com.example.lib;
import java.util.Scanner;

/*
    Write a code to convert decimal into binary
*/



public class DecimalToBinary {
    public static void main(String[] args) {
        int dec_num, quot, i = 1, j;
        int bin_num[] = new int[100];

        Scanner sc = new Scanner(System.in);

        // take decimal input from user
        System.out.println("Enter any decimal number : ");
        dec_num = sc.nextInt();

        // convert into binary
        quot = dec_num;

        while (quot != 0) {
            bin_num[i++] = quot % 2;
            quot = quot / 2;
        }

        System.out.println("The binary number is : ");

        for (j = i - 1; j > 0; j-- ) {
            System.out.println(bin_num[j]);
        }

        System.out.println();
    }
}
