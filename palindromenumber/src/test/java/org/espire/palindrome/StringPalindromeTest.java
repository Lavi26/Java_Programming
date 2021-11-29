package org.espire.palindrome;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class StringPalindromeTest {

	@Test
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");

		String input = sc.nextLine();
		
		System.out.println("Enter the expected output: ");
		String expOutput = sc.nextLine();

		StringPalindrome object = new StringPalindrome();
		String output=object.isPalindrome(input);
		
		assertEquals(expOutput,output);
	}

}
