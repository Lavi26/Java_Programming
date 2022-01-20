package org.espire.palindrome;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import junit.framework.ComparisonFailure;

//public class StringPalindromeTest {
	
//	@Test
//    public void contextLoads() {
//    
//	}

//	@Test 
//	public void testPalindrome() { 
////	//	assertEquals(true, checker.isPalindrome("madam"));
////	//	assertFalse(isPalindrome("cat")); 
////		org.junit.Assert.assertTrue(isPalindrome("aaa")); 
////	//	assertTrue(isPalindrome("BOB"));
//	//	assertEquals(false, StringPalindrome.isPalindrome("java"));
//        Assert.assertTrue("String is Palindrome", StringPalindrome.isPalindrome("madam"));
//	}
	
	public class StringPalindromeTest {

		@Test
		public void testPalindrome() {

//			assertEquals("String is not palindrome",StringPalindrome.isPalindrome("String is not palindrome"));
//			assertEquals("String is palindrome",StringPalindrome.isPalindrome("madam"));
			assertEquals("abc",StringPalindrome.isPalindrome("abc"));
		}



}
