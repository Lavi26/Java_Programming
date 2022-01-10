package org.espire.vendingmachine;

import static org.junit.Assert.*;


import org.junit.Test;

public class TestVendingMachine {
	 @Test
		public void dropCoin() { //add coin and select product
			VendingExample VM = new VendingExample();
			int balance=0;
			assertEquals(100,VM.drop("DOLLAR",balance));
			assertEquals(125,VM.drop("QUARTER",balance+100));
			assertEquals(135,VM.drop("DIME",balance+100+25));
		}

		
		@Test
		public void selectProducts() { //add coin and select product
			VendingExample VM = new VendingExample();
			int balance=150;
			assertEquals(50,VM.choose("COKE",balance));
			assertEquals(85,VM.choose("CANDY",balance));
			assertEquals(100,VM.choose("CHIPS",balance));
		}
		
	}