package com.espire.reverse;

import java.util.Scanner;

public class Reverse {
	
	public static String reverse(String s) {

		// declaration
		String rev = "";

		// "for loop" from last -> first element
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}

		return rev;
}


//main method
public static void main (String[] args) {
//User Input
Scanner sc = new Scanner(System.in);
String input = sc.nextLine();
System.out.println(Reverse.reverse(input));
}

}
