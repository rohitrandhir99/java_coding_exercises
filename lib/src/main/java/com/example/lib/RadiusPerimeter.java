package com.example.lib;
import java.util.Scanner;

/*
    Write a program that gets from the user the radius and print the area
    and perimeter of a circle.
*/

public class RadiusPerimeter {

    public static void main(String[] args) {
        // scanner for user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius in meters : ");

        float radius = sc.nextFloat(); // enter the radius

        // since the output can contain decimal value
        // we need to convert it to float to get accurate
        // results.
        float area = (float) ((float) Math.PI * radius * radius); // calculate area

        float perimeter = (float) (2 * Math.PI * radius); // calculate perimeter

        // display the result's
        System.out.println("The area is : " + area + " sq meters");
        System.out.println("The perimeter is : " + perimeter + " meters");
    }
}
