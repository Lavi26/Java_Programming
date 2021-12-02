package org.espire.squareroot;

import static org.junit.Assert.*;

import java.util.Scanner;


import org.junit.Test;

public class SquareRootTest {

	@Test
	public void test() {
		double value= 2.0;
		assertEquals(value,SquareRoot.checkRoot(4));

	}

}
