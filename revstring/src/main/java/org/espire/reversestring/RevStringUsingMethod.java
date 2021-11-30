package org.espire.reversestring;

import java.util.Scanner;

public class RevStringUsingMethod {

	/*
	 * Reverse the string using substring
	 */
	public static String reverse(String str) {

		if (str == null || str.equals("")) {
			return str;
		}

		// last char + recur for remaining string
		return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");

		String str = sc.nextLine();
		RevStringUsingMethod obj = new RevStringUsingMethod();
		str = obj.reverse(str);

		System.out.println("Reverse of string is:" + str);
	}

}
