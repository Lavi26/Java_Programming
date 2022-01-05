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
public class PalindromeWithLibraryTest {

	@Test
    public void palindromeUsingLibraryTest() {

        assertEquals(true, PalindromeWithLibrary.isPalindrome("otto"));
        assertEquals(false, PalindromeWithLibrary.isPalindrome("rajan"));

    }
}	