package org.example.revision;

import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.Map;

public class duplicateWords {

    static void findDuplicates(String inputString){

        String words[]= inputString.split(" ");
        Map<String,Integer> wordCount=new HashMap<>();

        for (String word:words){
            if (wordCount.containsKey(word)){
                wordCount.put(word.toLowerCase(),wordCount.get(word.toLowerCase())+1);
            }else {
                wordCount.put(word.toLowerCase(),1);
            }
        }
        System.out.println(wordCount);
    }
    public static void main(String[] args) {

        findDuplicates("we are awe are we are ");
    }
}
