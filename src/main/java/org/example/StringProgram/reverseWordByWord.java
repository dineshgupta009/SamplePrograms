package org.example.StringProgram;

public class reverseWordByWord {

    static void reverseWord(String inputString){

        String [] words=inputString.split(" ");
        String reverseString = "";
        for (int i=0;i<= words.length-1;i++){
            String reverseWord = "";
            String word=words[i];
            for (int j=word.length()-1;j>=0;j--){
                reverseWord = reverseWord + word.charAt(j);
            }
            reverseString =reverseString + reverseWord +" ";
        }
        System.out.println(inputString);
        System.out.println(reverseString);

    }
    public static void main(String[] args) {
        reverseWord("We Are here to help you");
    }
}
