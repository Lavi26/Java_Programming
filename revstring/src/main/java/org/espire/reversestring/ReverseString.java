package org.espire.reversestring;

import java.util.Scanner;

public class ReverseString {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");

		String input = sc.nextLine();

		char[] str = input.toCharArray(); // converting string into char array

		String reverseInput = ""; // declare empty string

		for (int i = str.length - 1; i >= 0; i--) // reading from end to first
		{
			reverseInput = reverseInput + str[i];
		}
		
		System.out.println("Input String is: " +input);
		System.out.println("Reverse String is: " +reverseInput);
		
	}

}
