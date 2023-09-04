package org.example.StringProgram;

import java.util.Arrays;

public class reverseString {

    public static void main(String[] args) {
        String str= "we are here to help you";
        StringBuffer str1=new StringBuffer(str);
        System.out.println(str1.reverse());

        System.out.println("------------------------------");


        char[] chars=str.toCharArray();
        for (int i= chars.length-1;i>=0;i--){
        System.out.print(chars[i]);}
    }


}
