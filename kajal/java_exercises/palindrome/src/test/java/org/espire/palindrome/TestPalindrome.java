package org.espire.palindrome;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPalindrome {

	
	@Test 
	public void testPalindrome()
	{ 
		assertTrue(Palindrome.palindrome("madam")); 
		assertFalse(Palindrome.palindrome("programming"));
		assertTrue(Palindrome.palindrome("")); 
		assertTrue(Palindrome.palindrome("AIA"));
	}
	@Test 
	public void testPalindromeUsingLibrary()
	{
		
	       assertFalse(PalindromeUsingLibrary.isPalindrome("wonder"));
	       assertTrue(PalindromeUsingLibrary.isPalindrome("nitin"));
	     
    }
	}
	
