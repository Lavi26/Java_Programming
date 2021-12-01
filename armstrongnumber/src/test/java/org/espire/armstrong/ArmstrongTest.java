package org.espire.armstrong;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class ArmstrongTest {

	@Test
	public void test() {
		
		int num=407;
		
		Armstrong object = new Armstrong();
		String output = object.calculate(num);
		
		assertEquals("Number is Armstrong",output);
		
	}

}
