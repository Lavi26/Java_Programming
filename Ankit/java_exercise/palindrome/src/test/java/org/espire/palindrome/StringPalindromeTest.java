/**
 * 
 */
package org.espire.palindrome;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author ankit.jaisawal
 *
 */
public class StringPalindromeTest {

	/**
	 * Test method for {@link org.espire.palindrome.StringPalindrome#isPalindrome(java.lang.String)}.
	 */
	@Test
	public void testIsPalindrome() {
		assertEquals("The string is not palindrome",StringPalindrome.isPalindrome("abc"));
		assertEquals("The string is palindrome",StringPalindrome.isPalindrome("aba"));
	}
	
	/**
	 * Test method for {@link org.espire.palindrome.PalindromeUsingLibraryMethod#isPalindrome(java.lang.String)}.
	 */
	@Test
	public void palindromeUsingLibrary() {
		assertEquals(true,PalindromeUsingLibraryMethod.isPalindrome("mam"));
		assertEquals(false, PalindromeUsingLibraryMethod.isPalindrome("ram"));
	}

	

}
