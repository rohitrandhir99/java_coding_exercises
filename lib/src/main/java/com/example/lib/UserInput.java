package com.example.lib;
import java.util.Scanner;

/*
    Write a program that gets from the user 2 numbers and displays their
    division and remainder.
*/


public class UserInput {
    public static void main(String[] args) {
        // scanner for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number -: ");
        int n1 = scanner.nextInt();

        System.out.println("Enter second number -: ");
        int n2 = scanner.nextInt();

        float div = (float) n1 / n2; // division operation
        int rem = n1 % n2;

        System.out.println("Division for the given two numbers is :  " + div);
        System.out.println("The remainder is : " + rem);
    }
}
