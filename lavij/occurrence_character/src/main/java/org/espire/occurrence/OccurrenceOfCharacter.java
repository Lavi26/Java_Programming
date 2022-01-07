package org.espire.occurrence;

public class OccurrenceOfCharacter {

    /**
     * Count the occurrence of a character in the string
     */
    public static int countCharacter(String str, char c, Integer index) {

        //condition if character is not there
        if (index >= str.length()) {
            return 0;
        } else {
            Integer count = 0;
            //count if character at the index is equal to the given char
            if (str.charAt(index) == c) {
                count = count+1;
            }
            //recursion for remaining
            return count + countCharacter(str, c, index + 1);
        }
    }

    public static void main(String args[]) {

        String str = "java";

        System.out.println("occurrence of a is: " + countCharacter(str, 'a', 0));
    }
}
