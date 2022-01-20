package org.espire.binarySearch;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBinarySearch {

	@Test
	public void testBinarySearch() {
		int[] array = { 2, 5, 6, 9, 11, 14, 17, 21, 14, 25, 27 };

		assertEquals(9, BinarySearch.binarySearch(array, 0, 11, 25));

		// Input not present in array
		assertEquals(-1, BinarySearch.binarySearch(array, 0, 11, 20));
	}
}
