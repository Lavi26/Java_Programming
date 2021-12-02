package org.espire.palindrome;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalinddromeTest {

    @Test
    public void palindromeUsingLibraryTest() {

        String str = "mom";
        PalindromeUsingLibrary obj = new PalindromeUsingLibrary();
        boolean output = obj.isPalindrome(str);

        assertEquals(true, output);

    }

    @Test
    public void palindromeTest() {
        String string = "abc";
        StringPalindrome object = new StringPalindrome();
        String output = object.isPalindrome(string);
        assertEquals("cba", output);
    }
}
