package org.example.multiThreading;

public class thread2 implements Runnable{
    @Override
    public void run() {
        System.out.println("My second Thread is running ..");
    }

    public static void main(String[] args) {
        thread2 thread2 =new thread2();
        Thread thread=new Thread(thread2);
        thread.start();
    }
}
