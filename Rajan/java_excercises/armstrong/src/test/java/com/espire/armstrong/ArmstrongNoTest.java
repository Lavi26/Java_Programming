/**
 * 
 */
package com.espire.armstrong;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author rajan.lahoti
 *
 */
public class ArmstrongNoTest {

	@Test
	public void test() {
		assertEquals("No. is armstrong", ArmstrongNo.findArmstrong(153));
		assertEquals("No. is not armstrong", ArmstrongNo.findArmstrong(120));
	}

}
