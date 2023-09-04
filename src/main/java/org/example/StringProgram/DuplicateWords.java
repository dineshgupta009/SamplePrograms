package org.example.StringProgram;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWords {

    static void duplicateWords1(String str){
        String [] words= str.split(" ");
        Map<String,Integer> wordCount=new HashMap<>();
        for(String word:words){
            if(wordCount.containsKey(word.toLowerCase())){
                wordCount.put(word.toLowerCase(),wordCount.get(word.toLowerCase())+1);
            }else {
                wordCount.put(word.toLowerCase(),1);
            }
        }
        Set<String> wordInString=wordCount.keySet();
        for(String word:wordInString){
            if(wordCount.get(word)>1){
                System.out.println(word +" : "+ wordCount.get(word));
            }
        }

    }
    public static void main(String[] args) {

        duplicateWords1("Bread butter and bread");
        duplicateWords1("Java is java again java");
        duplicateWords1("Super Man Bat Man Spider Man");
    }

}
