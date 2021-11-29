package org.espire.palindrome;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class PalindromeUsingLibraryTest {

	@Test
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();

		System.out.println("Enter the expected output: ");
		boolean expOutput = sc.nextBoolean();

		PalindromeUsingLibrary obj = new PalindromeUsingLibrary();
		boolean output= obj.isPalindrome(str);
		
		assertEquals(expOutput,output);

	}

}
