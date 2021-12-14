package org.espire.removeduplicates;
/*
 * Write a program to remove duplicates from an array in Java without using the Java Collection API.
 */
public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {

        String result = removeDup("AAABBBCCC");
        System.out.println(result); // ABC
	}
public static  String  removeDup( String  str) {
        String result = "";
        for (int i = 0; i < str.length(); i++)
            if (!result.contains("" + str.charAt(i)))
                result += "" + str.charAt(i);
        return result;
    }
}