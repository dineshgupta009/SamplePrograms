package org.example.revision;

public class reveseString {

    public static void reverse(String inputString){
        String[] words = inputString.split(" ");
        String reverseString = "";
        for(int i=0;i<= words.length-1;i++){
            String word=words[i];
           String  reverseWord= "";
            for(int j=word.length()-1;j>=0;j--){
                reverseWord= reverseWord+ word.charAt(j) ;
            }
            reverseString= reverseString +reverseWord +" ";
        }
        System.out.println(inputString);
        System.out.println(reverseString);
    }

    public static void main(String[] args) {
        reverse("we are here to help you");
    }
}
