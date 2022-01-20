/**
 * 
 */
package org.espire.reverseString;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author gurleen.kaur
 *
 */
public class ReverseStringTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testReverseString() {
		equals(ReverseString.isReverseString());
		
		System.out.println("Reverse String Test Case is Success");
	}

}
