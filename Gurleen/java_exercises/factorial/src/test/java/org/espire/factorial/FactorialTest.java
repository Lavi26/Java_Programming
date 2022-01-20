/**
 * 
 */
package org.espire.factorial;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author gurleen.kaur
 *
 */
public class FactorialTest {

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
	public void testFactorial() {
//		assertEquals("This is Factorial",Factorial.isFactorial(""));
//		assertEquals("This is not Factorial",Factorial.isFactorial(""));
		assertEquals("2", Factorial.isFactorial("2"));
		System.out.println("Factorial Test is Success");
	}

}
