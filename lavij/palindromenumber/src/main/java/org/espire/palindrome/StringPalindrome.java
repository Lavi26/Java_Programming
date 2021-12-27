package org.espire.palindrome;

import java.util.Scanner;

public class StringPalindrome {

    /*
     * check whether string is palindrome or not
     */
    public static String isPalindrome(String s) {

        // declare empty string
        String reverseInput = "";

        // reading from end to first
        for (int i = s.length() - 1; i >= 0; i--) {
            reverseInput = reverseInput + s.charAt(i);
        }
        // comparing
        if (s.equalsIgnoreCase(reverseInput)) {
            return "String is Palindrome";
        } else {
            return "String is not Palindrome";
        }
        
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        System.out.println(isPalindrome(input));

    }

}
