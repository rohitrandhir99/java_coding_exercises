package com.example.lib;
import java.util.Scanner;

/*
    ----- VERY IMPORTANT FOR INTERVIEWS -----
    Write a program to reverse a string
*/

public class ReverseAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string : ");
        char[] letters = sc.nextLine().toCharArray();

        System.out.println("The revered string is : ");

        for(int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i]);
        }
        System.out.print("\n");
    }
}
