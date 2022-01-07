/**
 * 
 */
package org.espire.armstrongNumber;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author gurleen.kaur
 *
 */
public class ArmstrongNumberTest {

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
	public void testArmstrongNumber() {
        System.out.println("It is an Armstrong Number Test Case");
        //String str1="153";
        assertEquals("It is an Armstrong Number", ArmstrongNumber.isArmstrong("It is an Armstrong Number"));
    }
}
