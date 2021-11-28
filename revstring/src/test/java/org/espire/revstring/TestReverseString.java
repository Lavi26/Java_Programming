package org.espire.revstring;

import java.util.Scanner;

import org.espire.reversestring.ReverseString;

public class TestReverseString {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");

		String input = sc.nextLine();

		ReverseString obj= new ReverseString();
		obj.checkString(input);
		System.out.println("Input String is: " +input);
		
		
	}


}
