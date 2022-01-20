package org.espire.reverseString;

import java.util.Scanner;

public class ReverseString {

	private static String reverseString;

	public static String isReverseString() {
		String original, reverse = "";
	    Scanner in = new Scanner(System.in);

	    System.out.println("Enter a string to reverse");
	    original = in.nextLine();

	    int length = original.length();

	    for (int i = length - 1 ; i >= 0 ; i--)
	      reverse = reverse + original.charAt(i);

	    System.out.println("Reverse of the string: " + reverse);
		return reverse;

	}
	
	public static void main(String args[]) {
		reverseString = isReverseString();
	}

}
