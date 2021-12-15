package org.espire.removeduplicates;
/*
 * Write a program to remove duplicates from an array in Java without using the Java Collection API.
 */
//Creating RemoveDuplicatesFromArray class
public class RemoveDuplicatesFromArray {
//main method
	public static void main(String[] args) {

        String result = removeDup("AAABBBCCC");
        System.out.println(result); // ABC
	}
//Create removeDup() method to remove duplicate characters from sorted array	
public static  String  removeDup( String  str) {
	// Create an empty string to hold the input
        String result = "";
 // Traverse the string and check for the repeated characters   
     // Loop for as many characters there are in the string
        for (int i = 0; i < str.length(); i++)
            if (!result.contains("" + str.charAt(i)))
                result += "" + str.charAt(i);
     // Return output string
        return result;
    }
}
