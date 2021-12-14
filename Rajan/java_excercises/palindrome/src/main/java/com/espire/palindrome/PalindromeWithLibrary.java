package com.espire.palindrome;

import java.util.Scanner;

public class PalindromeWithLibrary {
	public static boolean isPalindrome(String s) {
		if (s.length() <= 1) {
			return true;
		}

        //Character by character comparision
		if (s.charAt(0) == s.charAt(s.length() - 1))

			return isPalindrome(s.substring(1, s.length() - 1));

		return false;

	}
	
//main method
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();

		if (isPalindrome(input))
			System.out.println("String is Palindrome");
		else
			System.out.println("String is not Palindrome");

	}

}