package org.espire.binarysearch;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchTest {

	@Test
	public void test() {
		int array[] = { 10, 50, 20, 40, 30, 50 };
		
		assertEquals(1 ,BinarySearch.binarySearch(array,0,array.length -1, 20));
	}

}
