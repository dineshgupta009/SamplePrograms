package org.example.StringProgram;


import java.util.Scanner;

//   Write a Java program to count the number of words in a string?
public class CountNoOfString {
    public static void main(String[] args) {

        String str= " we are here to help you ";

        String [] word=str.trim().split(" ");
        System.out.println("Number of Words :" +word.length);
    }



}
