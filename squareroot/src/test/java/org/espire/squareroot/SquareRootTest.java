package org.espire.squareroot;

import static org.junit.Assert.*;

import java.util.Scanner;


import org.junit.Test;

public class SquareRootTest {

	@Test
	public void test() {
		
		int num = 4;

		SquareRoot obj = new SquareRoot();
		double output= obj.checkRoot(num);
		
		assertEquals(2,output);

	}

}
