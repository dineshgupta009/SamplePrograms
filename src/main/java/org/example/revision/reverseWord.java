package org.example.revision;

import java.util.Map;

public class reverseWord {

    static void reverse(String inputString){
        StringBuffer sbf= new StringBuffer(inputString);
        StringBuffer str= (sbf.reverse());
        System.out.println(str);

        System.out.println("-----------------------------");

        for (int i=inputString.length()-1;i>=0;i--){
            System.out.print(inputString.charAt(i));
        }
    }
    public static void main(String[] args) {

        reverse("we are here to help you");
    }
}
