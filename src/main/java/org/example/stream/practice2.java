package org.example.stream;

import java.util.*;
import java.util.stream.Collectors;

public class practice2 {

    static  String s1 = "its static ";
            public static void findCountOfChars(String s) {
               String s1 = "its a static variable ";

            Map<String, Long> map = Arrays.stream(s.split(""))
                    .map(String::toLowerCase)
                    .collect(Collectors
                            .groupingBy(str -> str,
                                    LinkedHashMap::new, Collectors.counting()));


        }



    public static void main(String[] args) {


                findCountOfChars("we are here to help you");
        System.out.println(s1);

    }
}
