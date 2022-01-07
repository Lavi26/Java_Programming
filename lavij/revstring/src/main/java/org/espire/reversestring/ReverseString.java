package org.espire.reversestring;

public class ReverseString {

    /*
     * Reverse a string
     */
    public static String checkString(String s) {

        if (s == null) {
            return s;
        }

        // declare empty string
        String reverseInput = "";

        //extract each char and add in front of existing string
        for (int i = 0; i < s.length(); i++) {
            reverseInput = s.charAt(i) + reverseInput;
        }
        return reverseInput;

    }

    public static void main(String args[]) {

        System.out.println(ReverseString.checkString("abc"));


    }

}
