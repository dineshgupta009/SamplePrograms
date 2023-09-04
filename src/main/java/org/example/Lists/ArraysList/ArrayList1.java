package org.example.Lists.ArraysList;

import java.util.*;

public class ArrayList1 {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("dinesh");
        arrayList.add("Armpit");
        arrayList.add("ramesh");
        arrayList.add("Armpit");
        Collections.sort(arrayList);
        System.out.println(arrayList);
        Set<String> strings=new HashSet<>(arrayList);
        System.out.println(strings);
        arrayList.add("dinesh");
        List<String> list=  Arrays.asList("dinesh","ramesh","ganesh");

        Collections.sort(list);
        System.out.println(list);
        //Traversing list through Iterator

        Iterator iterator= arrayList.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
