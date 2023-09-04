package org.example.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class StreamPra2 {


    public static void main(String[] args) {
        List<student> list1= new ArrayList();
        list1.add(new student("dinesh",25,25000d));
        list1.add(new student("dinesh",5,254410d));
        list1.add(new student("dinesh",35,254410d));
        list1.add(new student("dinesh",45,254410d));


        Optional<student> st= list1.stream()
                .filter(s->s.sal>=25000D)
                .limit(2)
                .sorted()
                .findFirst();
//                .sorted()
//                .count();

        System.out.println(st);
    }

}
