package org.espire.string;

public class ReverseStringUsingMethod {
	// Method to reverse a string in Java using recursion
	public static String reverse(String str) {
		// base case: if the string is null or empty
		if (str == null || str.equals("")) {
			return str;
		}

		// last character + recur for the remaining string
		return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
	}

	public static void main(String[] args) {
		String str = "kajal";

		// string is immutable
		str = reverse(str);

		System.out.println("The reverse of the given string is: " + str);
	}
}
