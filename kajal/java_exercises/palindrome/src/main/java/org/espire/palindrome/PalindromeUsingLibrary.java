package org.espire.palindrome;
/*
 * Palindrome Program in Java using Library methods (strings)
 */
public class PalindromeUsingLibrary {
	public static boolean isPalindrome(String str){  
	    StringBuilder sb=new StringBuilder(str);  
	    sb.reverse();  
	    String rev=sb.toString();  
	    if(str.equals(rev)){  
	        return true;  
	    }
	    else
	    {  
	        return false;  
	    }  }
	    public static void main(String[] args) {  
	        System.out.println(PalindromeUsingLibrary.isPalindrome("nitin"));
	}  
	}  
