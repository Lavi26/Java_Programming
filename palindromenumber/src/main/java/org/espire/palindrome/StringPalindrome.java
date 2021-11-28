package org.espire.palindrome;


public class StringPalindrome {

	/*
	 * check whether string is palindrome or not
	 */
    public static String isPalindrome(String s) {

		// converting string into char array
		char[] str = s.toCharArray();

		// declare empty string
		String reverseInput = "";

		// reading from end to first
		for (int i = str.length - 1; i >= 0; i--) {
			reverseInput = reverseInput + str[i];
		}
		
		//comparing
		if(s.equals(reverseInput)) {
	    	System.out.println("String is Palindrome");
	    }
		else {
			System.out.println("String is not Palindrome");
		}
		return null ;
    }
    
    
	
}
