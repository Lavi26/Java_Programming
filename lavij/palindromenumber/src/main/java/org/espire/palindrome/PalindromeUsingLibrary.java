package org.espire.palindrome;

import java.util.Scanner;

public class PalindromeUsingLibrary {

	/*
	 * checcking whether string is palindrome using methods
	 */
	public static boolean isPalindrome(String s) {
		if (s.length() <= 1) {
			return true;
		}

		// pointing to last and extract the remaining string in reverse
		if (s.charAt(0) == s.charAt(s.length() - 1))

			return isPalindrome(s.substring(1, s.length() - 1));

		return false;

	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		String orgStr = sc.nextLine();

		if (isPalindrome(orgStr)) // checking
			System.out.println("String is Palindrome");
		else
			System.out.println("String is not Palindrome");

	}

}
