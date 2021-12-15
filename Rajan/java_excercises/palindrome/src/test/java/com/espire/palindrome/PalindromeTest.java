/**
 * 
 */
package com.espire.palindrome;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author rajan.lahoti
 *
 */
public class PalindromeTest {

	@Test
	public void testPalindrome() {
		assertEquals("String is not palindrome",Palindrome.isPalindrome("rajan"));
	}

}
