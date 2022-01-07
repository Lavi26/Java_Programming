package org.espire.binarysearch;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {

	@Test
	public void test1() {
		Integer array[] = { 10, 50, 20, 40, 30, 50 };
		BinarySearch.quickSort(array, 0, array.length - 1);

		assertEquals(1 ,BinarySearch.binarySearch(array,0,array.length -1, 20));
	}
	
	@Test
    public void test2() {
		Integer array[] = { 10, 50, 20, 40, 30, 50 };
		BinarySearch.quickSort(array, 0, array.length - 1);
        assertEquals(-1 ,BinarySearch.binarySearch(array,0,array.length -1, 80));
    }

}
