package org.espire.palindrome;

import java.util.Scanner;

public class StringPalindrome {

	/*
	 * check whether string is palindrome or not
	 */
    
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");

		String input = sc.nextLine();

		// converting string into char array
		char[] str = input.toCharArray();

		// declare empty string
		String reverseInput = "";

		// reading from end to first
		for (int i = str.length - 1; i >= 0; i--) {
			reverseInput = reverseInput + str[i];
		}

		System.out.println("Input String is: " + input);
		System.out.println("Reverse String is: " + reverseInput);

		// checking input is equal to the reverse or not
		if (input.equals(reverseInput))
			System.out.println("String is Palindrome");
		else
			System.out.println("String is not Palindrome");

	}

}
