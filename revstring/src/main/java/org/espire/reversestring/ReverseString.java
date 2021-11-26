package org.espire.reversestring;

import java.util.Scanner;

public class ReverseString {
	public static String checkString(String s) {
		
		if(s==null) {
			return s;
			}
		
		char[] str = s.toCharArray(); // converting string into char array

		String reverseInput = ""; // declare empty string

		for (int i = str.length - 1; i >= 0; i--) // reading from end to first
		{
			reverseInput = reverseInput + str[i];
		}
		System.out.println("Reverse String is: " +reverseInput);
		return null;
		
	}

	
}
