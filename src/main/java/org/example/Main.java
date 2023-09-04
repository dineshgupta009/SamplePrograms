package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


// Write a Java program to find the duplicate words and their number of occurrences in a string?
public class Main {

    static void duplicateWords(String str){
        String[] words= str.split(" ");
        Map<String, Integer> WordCount= new HashMap<>();

        for(String word:words){
            if(WordCount.containsKey(word.toLowerCase()))
            {
                WordCount.put(word.toLowerCase(),WordCount.get(word.toLowerCase())+1);
            }else{
                WordCount.put(word.toLowerCase(),1);
            }
        }

        Set<String> wordInString = WordCount.keySet();
        for(String word:wordInString){
            if (WordCount.get(word)>1){
                System.out.println(word +":" +WordCount.get(word));
            }
        }
    }
    public static void main(String[] args) {

        duplicateWords("Bread butter and bread");

        duplicateWords("Java is java again java");
        duplicateWords("Super Man Bat Man Spider Man");

    }


}