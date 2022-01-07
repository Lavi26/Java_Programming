/**
 * 
 */
package org.espire.squareRoot;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author gurleen.kaur
 *
 */
public class SquareRootTest {

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
	public void testSquareRoot() {
		assertEquals("9",SquareRoot.isSquareRoot("9"));
		assertEquals("1",SquareRoot.isSquareRoot("1"));
		
		System.out.println("Square Root Test Case is Passed");
	}

}
