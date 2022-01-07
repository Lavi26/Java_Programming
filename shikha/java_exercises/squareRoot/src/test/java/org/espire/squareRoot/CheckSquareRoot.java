package org.espire.squareRoot;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckSquareRoot {

	@Test
	public void testSquareRoot() {
		assertEquals(4.0,SquareRoot.findSquareRoot(16),4.0);
	}

}
