package org.espire.palindrome;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckPalindrome {

	@Test
	public void palindromeTest() {
		assertEquals("The string is palindrome.", Palindrome.isPalindrome("radar"));
		assertEquals("The string is not palindrome.", Palindrome.isPalindrome("cat"));
	}

}
