/**
 * 
 */
package com.espire.squareroot;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author sahil.jamwal
 *
 */
public class SquareRootTest {

	@Test
	public void testCheckRoot() {
		assertEquals(1.7320508075688772, SquareRoot.findSquareRoot(3), 1.7320508075688772);
	}

}
