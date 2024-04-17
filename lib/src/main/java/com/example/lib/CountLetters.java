package com.example.lib;
import java.util.Scanner;

/*
    ----- VERY IMPORTANT FOR INTERVIEWS -----
    Write a program to count the letters, spaces, numbers
    and other characters of an input string.
*/

public class CountLetters {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter any string : ");
        String input_string = sc.nextLine();


        count(input_string);
    }

    public static void count(String x){
        char[] ch = x.toCharArray();

        int letter = 0;
        int space = 0;
        int num = 0;
        int others = 0;

        // check for characters
       for(int i = 0; i < x.length(); i++) {
           if(Character.isLetter(ch[i])) {
               letter++;
           } else if (Character.isDigit(ch[i])) {
               num++;
           } else if (Character.isSpaceChar(ch[i])) {
               space++;
           } else {
               others++;
           }
       }

        System.out.println("No of Letters : " + letter);
        System.out.println("No of Numbers : " + num);
        System.out.println("No of Spaces : " + space);
        System.out.println("No of Other Characters : " + others);
    }
}
