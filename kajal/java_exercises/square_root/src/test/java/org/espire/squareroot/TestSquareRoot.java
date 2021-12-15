package org.espire.squareroot;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSquareRoot {

	@Test
	public void squareRoot() {
		assertEquals(4,SquareRoot.square(16),4);
		assertEquals(5,SquareRoot.square(25),5);
		assertEquals(25,SquareRoot.square(625),25);
		 

}
}