package org.espire.palindrome;
/*
 * Palindrome Program in Java using Library methods (strings)
 */
public class PalindromeUsingLibrary {
<<<<<<< HEAD
	public static boolean isPalindrome(String str){
		// create a StringBuilder object
	    StringBuilder sb=new StringBuilder(str);  
	 // reverse the string
	    sb.reverse();  
	    String rev=sb.toString(); 
	     //check if str is palindrome
=======


	public static boolean isPalindrome(String str){  
		// create a StringBuilder object
	    StringBuilder sb=new StringBuilder(str);  
		 // reverse the string
	    sb.reverse();  
	    String rev=sb.toString();  
		 //check if str is palindrome

>>>>>>> 825caa0e5b94ed926fe7798db25d2269b6e26e2c
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
