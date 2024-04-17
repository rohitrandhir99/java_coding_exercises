package com.example.lib;

/*
    Write a program to multiply corresponding elements
    of two arrays of integers.
*/

public class MultiplyTwoArrays {
    public static void main(String[] args) {
        // arrays
        int[] arr1 = {1, 3, -5, 4};
        int[] arr2 = {1, 4, -5, -2};

        String result = "";

        for(int i = 0; i < arr1.length; i++) {
            int num1 = arr1[i];
            int num2 = arr2[i];
            result += Integer.toString(num1 * num2) + " ";

        }

        System.out.println("\n Result : " + result
        );
    }
}
