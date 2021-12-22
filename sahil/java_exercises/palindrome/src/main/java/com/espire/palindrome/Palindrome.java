package com.espire.palindrome;

import java.util.Scanner;

/*
 *program to check wheather given String is palindrome or not!
 */
public class Palindrome {

	public static boolean palindrome(String a)
	/*
	 * Step1: Check if the length is equal to zero or one .Print it is a palindrome
	 */

	{
		if (a.length() == 0 || a.length() == 1) {
			return true;
		}
		/*
		 * Step2: Checking each character in substring from front and rear, if found
		 * equal Print it is palindrome
		 */

		if (a.charAt(0) == a.charAt(a.length() - 1)) {
			return palindrome(a.substring(1, a.length() - 1));
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String string = inp.nextLine();

		if (palindrome(string))
		/*
		 * If steps 1&2 = pass, Print "Palindrome"
		 */
		{
			System.out.println(string + " is palindrome");
		} else
		/*
		 * If steps 1=2=fails, Print !Palindrome
		 */
		{
			System.out.println(string + " not palindrome");
		}
	}
}
