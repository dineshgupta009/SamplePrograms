package org.example.exception;

public class exception1 {
    public static void main(String[] args) {
        try {
            int i = 100/0;


        }catch (Exception e){
            System.out.println(e);
        }
        try {
            String s = null;
            System.out.println(s.length());
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Code running after exception... ");
    }
}
