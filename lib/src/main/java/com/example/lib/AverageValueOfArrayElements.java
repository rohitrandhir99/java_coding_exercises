package com.example.lib;


/*
    Write a program to calculate the average value of array
    elements.
*/

public class AverageValueOfArrayElements {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,5,7,8,9};

        // Calculate the sum of all the elements
        int sum = 0;

        for(int i = 0; i< numbers.length; i++) {
            sum += numbers[i];
        }

        // calculate the average value
        double average = (double) sum / numbers.length;
        System.out.println("The average is : " + average);
     }
}
