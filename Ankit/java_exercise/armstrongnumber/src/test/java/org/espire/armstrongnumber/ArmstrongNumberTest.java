/**
 * 
 */
package org.espire.armstrongnumber;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author ankit.jaisawal
 *
 */
public class ArmstrongNumberTest {

	/**
	 * Test method for {@link org.espire.armstrongnumber.ArmstrongNumber#isArmstrongNumber(int)}.
	 */
	@Test
	public void testIsArmstrongNumber() {
		assertEquals("Number is armstrong",ArmstrongNumber.isArmstrongNumber(153));
		assertEquals("Number is not armstrong",ArmstrongNumber.isArmstrongNumber(152));
	}

}
