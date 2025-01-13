package org.example.StringProgram;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Program2 {


    public static void wordCount(String str){

        String Words[] = str.split(" ");

        Map<String,Long> wordsCount= Arrays.stream(str.toUpperCase().split(" "))
                .collect(Collectors.groupingBy(word->word,Collectors.counting()));
        wordsCount.forEach((word, count) -> System.out.println(word + " : " +count) );
    }

    public static void main(String[] args) {

        String toFind = "we are here to help you are";
        wordCount(toFind);

    }

}
