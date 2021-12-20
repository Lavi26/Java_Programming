package org.espire.palindrome;
/*
 * Palindrome Program in Java using Library methods (strings)
 */
public class PalindromeUsingLibrary {


	public static boolean isPalindrome(String str){  
		// create a StringBuilder object
	    StringBuilder sb=new StringBuilder(str);  
		 // reverse the string
	    sb.reverse();  
	    String rev=sb.toString();  
		 //check if str is palindrome

	    if(str.equals(rev)){  
	        return true;  
	    }
	    else
	    {  
	        return false;  
	    }  }
	//main method
	    public static void main(String[] args) {  
	        System.out.println(PalindromeUsingLibrary.isPalindrome("nitin"));
	}  
	}  
