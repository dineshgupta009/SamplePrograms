package org.example.StringProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class charCount {

    static void charCount1(String inputString){

        Map<Character,Integer> charCount=new HashMap<>();
        char[] charAt= inputString.toCharArray();

        for (char ch:charAt){
            if(charCount.containsKey(ch))
            {
                charCount.put(ch,charCount.get(ch)+1);
            }else{
                charCount.put(ch,1);
            }
        }
        System.out.println(inputString +" : " + charCount);
        System.out.println("-------------------------------------");
        Set<Character> cha=charCount.keySet();
        for (char ch:cha){
            if (charCount.get(ch)>1){
                System.out.println(ch +" : "+charCount.get(ch));
            }
        }
    }
    public static void main(String[] args) {
        charCount1("we are here to help you");
    }
}
