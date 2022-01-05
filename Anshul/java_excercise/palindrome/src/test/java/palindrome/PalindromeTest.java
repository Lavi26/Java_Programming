package palindrome;
import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeTest {
	 @Test
	    public void palindromeUsingLibraryTest() {

	        assertEquals(true, PalindromeUsingLibrary.isPalindrome("bob"));
	        assertEquals(true, PalindromeUsingLibrary.isPalindrome("maam"));

	    }

	    @Test
	    public void palindromeTest() {
	       
	        assertEquals(false,Palindrome.isPalindrome("abc"));
	    }
    
}

/*
@Test
public void emptyStringTest() throws Exception {

    input = "";

    assertTrue(pali.isPalindrome1(input));

}
@Test
public void validPalindromeTest() throws Exception {

    input = "No lemon no melon";

    assertTrue(pali.isPalindrome1(input));
}

@Test
public void invalidPalindromeTest() throws Exception {

    input = "hello bob";

    assertFalse(pali.isPalindrome1(input));
}
*/