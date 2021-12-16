package reverse_string;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseStringTest {

	@Test
	public void reverseStringTest() {
		
		assertEquals("cba",ReverseString.reverse("abc"));
		assertEquals("edcba",ReverseString.reverse("abcde"));
	}
	
}