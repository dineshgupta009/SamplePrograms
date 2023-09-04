package org.example.multiThreading;

public class threadSleep1 extends Thread{
    public void run(){
        for (int i=0;i<=5;i++){
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        Thread thread= new threadSleep1();
        Thread thread1= new threadSleep1();
        thread.start();
        thread1.start();
    }
}
