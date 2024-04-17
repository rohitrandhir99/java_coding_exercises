package com.example.lib;

/*
    Write a java program to count the number of
    even and odd elements in a given array of
    integers.
*/

public class CountEvenOrOdd {
    public static void main(String[] args) {
        int[] nums = {5, 7, 2, 4, 9}; // given array

        int even_counter = 0;
        int odd_counter = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] %2 == 0) {
                even_counter++;
            } else {
                odd_counter++;
            }
        }

        System.out.println("The number of even number is : " + even_counter);
        System.out.println("The number of even number is : " + odd_counter);
    }
}
