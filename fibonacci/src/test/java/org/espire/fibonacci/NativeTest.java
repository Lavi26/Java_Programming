package org.espire.fibonacci;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class NativeTest {

	@Test
	public void test() {
		
		int count1= 7 ;
		
		Native obj = new Native();
		int output= obj.checkFibonacci(count1);
		
		assertNotNull(output);
	}

}
