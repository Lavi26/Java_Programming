/**
 * 
 */
package com.espire.reverse_string;

import java.util.Scanner;

/**
 * @author rajan.lahoti
 *
 */
public class ReverseString {
	public static String reverse(String input) {
		// converting string into char array
				char[] ch = input.toCharArray();

				// declare empty string
				String rev = "";

				// for loop from last element to first element
				for (int i = ch.length - 1; i >= 0; i--) {
					rev = rev + ch[i];
				}

				return rev;
	}
		
	
//main method
public static void main (String[] args) {
	//taking input from user
	Scanner sc = new Scanner(System.in);
	String input = sc.nextLine();
	System.out.println(ReverseString.reverse(input));
}
}