package org.example.stream;

import java.util.Arrays;
import java.util.List;

public class streamPrac3 {

    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(10,15,25,26,54,84,56,12,74);

        list.stream()
                .filter(n->n%2==0)
                .filter(n->n>25)
                .map(a->a*2).limit(1)
                .forEach(System.out:: println);
    }
}
