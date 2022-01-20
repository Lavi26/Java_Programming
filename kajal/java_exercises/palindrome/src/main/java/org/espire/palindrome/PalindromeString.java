package org.espire.palindrome;

/*
 *  string is called a palindrome string if the reverse of that string is the same as the original string.
 *   For example, radar, level, etc.
 *   To check a Palindrome , first reverse the string and compare the reversed string with the original value
 */
public class PalindromeString {
	public static void main(String[] args) {

		String str = "Radar", reverseStr = "";

		int strLength = str.length();
// loop runs from the end to the beginning of the string.
		for (int i = (strLength - 1); i >= 0; --i) {
// charAt() method accesses each character of the string		    	
//Each character of the string is accessed in reverse order and stored in reverseStr.		    	
			reverseStr = reverseStr + str.charAt(i);
		}
// toLowerCase() method converts both str and reverseStr to lowercase
//equals() method checks if two strings are equal.		    

		if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
			System.out.println(str + " is a Palindrome String.");
		} else {
			System.out.println(str + " is not a Palindrome String.");
		}
	}
}
