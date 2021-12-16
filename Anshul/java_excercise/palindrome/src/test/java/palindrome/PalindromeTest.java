package palindrome;
import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeTest {
	 @Test
	    public void palindromeUsingLibraryTest() {

	        assertEquals(true, PalindromeUsingLibrary.isPalindrome("mom"));
	        assertEquals(true, PalindromeUsingLibrary.isPalindrome("madam"));

	    }

	    @Test
	    public void palindromeTest() {
	       
	        assertEquals(false,Palindrome.isPalindrome("abc"));
	    }
    
}