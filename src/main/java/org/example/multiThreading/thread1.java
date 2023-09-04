package org.example.multiThreading;

public class thread1 extends Thread{


    public void run() {
        System.out.println("My first Thread is running ...");
    }

    public static void main(String[] args) {
        Thread thread=new thread1();
        thread.start();
    }
}