package org.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.partitioningBy;

public class practice3 {


    public static void main(String[] args) {

        List<Integer> list=Arrays.asList(10,12,15,17,16,19,52,45,21,35);
        List<Integer> list1=list.stream()
                .filter(a->a%2==0)
                .collect(Collectors.toList());
        System.out.println(list1);

        List<Integer> myList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Map<Boolean, List<Integer>> evenAndOdds = myList.stream()
                .collect(partitioningBy(i -> i % 3 == 0));
        System.out.println(evenAndOdds);

        List<student> students=new ArrayList<>();
        students.add(new student("dinesh",15 , 2000d));
        students.add(new student("dinesh",5 , 25000d));
        students.add(new student("dinesh",10, 25000d));
        students.add(new student("dinesh",25 , 250d));
        students.add(new student("dinesh",35 , 2500d));

        Map<Boolean, List<student>> age1 = students.stream()
//                .filter(a->a.age>10)
                .collect(partitioningBy(a->a.age>=10));
        List<student> even = age1.get(true);
        List<student> odd = age1.get(false);
        System.out.println(even);
        System.out.println(odd);

    }
}

