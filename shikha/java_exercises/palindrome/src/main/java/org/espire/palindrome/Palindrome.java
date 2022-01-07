package org.espire.palindrome;

import java.util.Scanner;

public class Palindrome {

	/*
	 * check whether string is palindrome or not
	 */
	public static String isPalindrome(String s) {

		// declare empty string
		String reverse = "";

		// reading from end to first
		for (int i = s.length() - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);
		}

		// comparing the reverse and user input
		if (s.equals(reverse)) {
			return "The string is palindrome.";
		} else {
			return "The string is not palindrome.";
		}

	}

	public static void main(String args[]) {
        System.out.println("Enter a String :");
		// taking user input
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();

		isPalindrome(input);

	}
}