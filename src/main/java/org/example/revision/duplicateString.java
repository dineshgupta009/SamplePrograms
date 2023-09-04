package org.example.revision;

import java.util.HashMap;
import java.util.Map;

public class duplicateString {

    public static void duplicateCount(String inputString){

        String[] words=inputString.split(" ");
        Map<String,Integer> wordCount= new HashMap<>();
        for (String word:words)
        if(wordCount.containsKey(word)){
            wordCount.put(word.toLowerCase(),wordCount.get(word.toLowerCase())+1);
        }else {
            wordCount.put(word.toLowerCase(),1);
        }

        System.out.println(wordCount);
    }
    public static void main(String[] args) {
        duplicateCount("we are here to to help you");
    }
}
