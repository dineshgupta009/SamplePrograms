package org.example.revision;

public class reveresCharByChar {

    static void reverse(String inputString) {

        String[] Words = inputString.split(" ");
        String reverseString = "";
        for (String s : Words) {
            String reverseWord = "";
            String word = s;
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            reverseString = reverseString + reverseWord + " ";
        }
        System.out.println("Input String : " + inputString);
        System.out.println("Reversed String : " + reverseString);
    }

    public static void main(String[] args) {

        reverse("we are here to help you");

        int age=18;
        String s = age >= 18 ? "Can Vote" : "under age ";
        System.out.println(s);

    }
}
