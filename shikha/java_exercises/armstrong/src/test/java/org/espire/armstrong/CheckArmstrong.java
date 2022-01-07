package org.espire.armstrong;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckArmstrong {

	@Test
	public void armstrongTest() {
		assertEquals("Number is armstrong", Armstrong.findArmstrong(370));
		assertEquals("Number is not armstrong", Armstrong.findArmstrong(323));
	}

}
