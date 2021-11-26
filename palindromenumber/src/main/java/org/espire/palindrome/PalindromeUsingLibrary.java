package org.espire.palindrome;

public class PalindromeUsingLibrary {
	
	/*
	 * checcking whether string is palindrome using methods
	 * */
	public static boolean isPalindrome(String s) {
		if(s.length()==0||s.length()==1)
			return true;
	
		//pointing to last and extract the remaining string in reverse
		if (s.charAt(0) == s.charAt(s.length()-1))
			
			return isPalindrome(s.substring(1,s.length()-1));
		
		return false;

	}

	
}
