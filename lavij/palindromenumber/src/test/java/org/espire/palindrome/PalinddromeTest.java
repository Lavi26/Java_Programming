package org.espire.palindrome;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalinddromeTest {

    @Test
    public void palindromeUsingLibraryTest() {

        assertEquals(true, PalindromeUsingLibrary.isPalindrome("mom"));

    }

    @Test
    public void palindromeUsingLibraryTest1() {

        assertEquals(true, PalindromeUsingLibrary.isPalindrome("madam"));

    }

    @Test
    public void palindromeTest() {

        assertEquals("String is not Palindrome", StringPalindrome.isPalindrome("abc"));
    }
}
