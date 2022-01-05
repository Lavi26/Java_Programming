/**
 * 
 */
package com.espire.palindrome;

import static org.junit.Assert.*;


import org.junit.Test;

/**
 * @author sahil.jamwal
 *
 */
public class PalindromeTest {

	@Test 
	public void testPalindrome()
	{ 
		assertTrue(Palindrome.palindrome("mom")); 
		assertFalse(Palindrome.palindrome("father"));
		assertTrue(Palindrome.palindrome("")); 
		assertTrue(Palindrome.palindrome("aibohphobia"));
	}
	@Test 
	public void testPalindromeUsingLibrary()
	{
		
	       assertFalse(PalindromeUsingLib.isPalindrome("espire"));
	       assertTrue(PalindromeUsingLib.isPalindrome("dad"));
	     
    }

}
