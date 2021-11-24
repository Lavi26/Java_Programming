package org.espire.palindrome;

import java.util.Scanner;

public class PalindromeUsingLibrary{
	public static void main(String args[]) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String: ");
		
		String orgStr =sc.nextLine();
		
		String revStr= new StringBuilder(orgStr).reverse().toString();
		
		if(orgStr.equals(revStr))                      //checking
			System.out.println("String is Palindrome");
		else
			System.out.println("String is not Palindrome");
		
	}
	
}

