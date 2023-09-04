package org.example.StringProgram;


//Write a Java program to reverse each word of a given string?
public class reverseWord {

    static void reverseWord1(String inputString){

        String [] words= inputString.split(" ");
        String reverString = "";
        for (int i=0;i<= words.length-1;i++){
            String word= words[i];
            String reverseWord= "";
            for (int j=word.length()-1;j>=0;j--){
                reverseWord = reverseWord+word.charAt(j);
            }
            reverString= reverString + reverseWord + " ";
        }
        System.out.println(inputString);
        System.out.println(reverString);

    }
    public static void main(String[] args) {
        reverseWord1("we are here to help");
    }
}
