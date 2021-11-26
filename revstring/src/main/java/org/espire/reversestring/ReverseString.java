package org.espire.reversestring;

public class ReverseString {
	
	/*
	 * Reverse a string 
	 * */
	public static String checkString(String s) {

		if (s == null) {
			return s;
		}
        
		// converting string into char array
		char[] str = s.toCharArray(); 
        
		// declare empty string
		String reverseInput = ""; 
        
		// reading from end to first
		for (int i = str.length - 1; i >= 0; i--) 
		{
			reverseInput = reverseInput + str[i];
		}
		System.out.println("Reverse String is: " + reverseInput);
		return null;

	}

}
