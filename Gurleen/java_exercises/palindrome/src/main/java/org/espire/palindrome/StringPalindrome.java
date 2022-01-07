package org.espire.palindrome;

import java.util.Scanner;

public class StringPalindrome {		

//	boolean checkPalindromeString(String input) {
//		boolean result = true;
//		int length = input.length();
//		for(int i=0; i < length/2; i++) {
//			if(input.charAt(i) != input.charAt(length-i-1)) {
//				result = false;
//				break;
//			}
//		}
//		return result;
//	}
	
	public static String isPalindrome(String s) {
        
        System.out.print("Enter any String : ");
        Scanner in = new Scanner(System.in);
          
        //Original string
        String origString = in.nextLine();
        int length = origString.length();
         
        boolean isPalindrome = true;  
         
        for(int beginIndex = 0; beginIndex < length; beginIndex++)
        {
            if(origString.charAt(beginIndex) != origString.charAt(length-1-beginIndex)) {
                System.out.println("String is not a Palindrome.");
                isPalindrome = false;
                break;
            }
        }
          
        if(isPalindrome) {
            System.out.println("String is a Palindrome.");
        }
		return origString;
    }
	
	public static void main (String args[]) {
		isPalindrome(null);
	//	System.out.println("This is Palindrome program");
	}

 }

