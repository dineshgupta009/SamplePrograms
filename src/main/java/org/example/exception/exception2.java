package org.example.exception;

public class exception2 {

    public static void main(String[] args) {
        try {
            int i = 100 / 0;

        } catch(NullPointerException e){
                System.out.println(e);
            }
         catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("we are at finally part ...");
        }
    }
}
