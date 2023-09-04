package org.example.StringProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class countNoOfChar {
    static void characterCount(String str1){


        Map<Character,Integer> charCount=new HashMap<>();
        char [] chars=str1.toCharArray();

        for (char ch:chars){
            if (charCount.containsKey(ch)){
                charCount.put(ch,charCount.get(ch)+1);
            }else{
                charCount.put(ch,1);
            }
        }
        Set<Character> keySet=charCount.keySet();
        for (char ch:keySet){
            if (charCount.get(ch)>1){
                System.out.println(ch +" : "+charCount.get(ch) +" ");
            }
        }

    }
    public static void main(String[] args) {

        characterCount("we are here to help you");
    }
}
