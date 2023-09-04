package org.example.revision;

public class reve1 {

    public static void reverse(String inputString){

        String[] words=inputString.split(" ");
        String reveseString = "";
        for (String word: words){
            String reverseWord="";
            for (int i=word.length()-1;i>=0;i--){
                reverseWord = reverseWord + word.charAt(i);
            }
            reveseString= reveseString + reverseWord + " ";
        }
        System.out.println(inputString);
        System.out.println(reveseString);

    }
    public static void main(String[] args) {

        reverse("we are here to help you");
    }
}
