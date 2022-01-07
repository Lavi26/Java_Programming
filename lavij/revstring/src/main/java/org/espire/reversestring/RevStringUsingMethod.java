package org.espire.reversestring;

public class RevStringUsingMethod {

    /*
     * Reverse the string using substring
     */
    public static String reverse(String str) {

        if (str == null || str.equals("")) {
            return str;
        }

        // last char + recurse for remaining string
        return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));

    }

    public static void main(String args[]) {
        System.out.println(RevStringUsingMethod.reverse("abcd"));
    }

}
