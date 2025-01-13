package org.example.StringProgram;

public class program1 {

    public static void main(String[] args) {


        String string = "The best of both worlds";

        String[] Words = string.split(" ");
        for (int i=0;i< Words.length;i++){
            String word=Words[i];
            for (int j=word.length()-1;j>=0;j--){
                System.out.print(word.charAt(j));
            }
            System.out.print(" ");
        }

    }
}
