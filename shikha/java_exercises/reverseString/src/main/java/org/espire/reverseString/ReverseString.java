package org.espire.reverseString;

import java.util.Scanner;

public class ReverseString {

	public static String reverse(String str) {

		// Here converting string into char array
		char[] ch = str.toCharArray();

		// declaring empty string
		String reverseString = "";

		// reading from end to first
		for (int i = ch.length - 1; i >= 0; i--) {
			reverseString = reverseString + ch[i];
		}

		return reverseString;

	}

	public static void main(String[] agrs) {

		// Taking input
		System.out.println(" Enter a String");

		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();

		// calling method and print result
		System.out.println(ReverseString.reverse(input));
	}
}
