package org.example.multiThreading;

public class thread3 {

    public static void main(String[] args) {
        Thread thread = new Thread("My thread with out extending thread class");

        thread.start();
        String str = thread.getName();
        System.out.println(str);
    }
}
