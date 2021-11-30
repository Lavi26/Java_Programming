package org.espire.reversestring;

import java.util.Scanner;

public class ReverseString {

	/*
	 * Reverse a string
	 */
	public static String checkString(String s) {

		if (s == null) {
			return s;
		}

		// converting string into char array
		char[] str = s.toCharArray();

		// declare empty string
		String reverseInput = "";

		// reading from end to first
		for (int i = str.length - 1; i >= 0; i--) {
			reverseInput = reverseInput + str[i];
		}
		System.out.println("Reverse String is: " + reverseInput);
		return reverseInput;
		

	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");

		String input = sc.nextLine();

		ReverseString obj = new ReverseString();
		obj.checkString(input);
		

	}

}
