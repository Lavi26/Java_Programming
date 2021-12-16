/**
 * 
 */
package org.espire.binarysearch;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author ankit.jaisawal
 *
 */
public class BinarySearchTest {

	/**
	 * Test method for {@link org.espire.binarysearch.BinarySearch#binarySearch(int[], int, int, int)}.
	 */
	@Test
	public void testBinarySearch() {
		//First test case
		int array[]= {10,20,30,50,66,88,95};
		assertEquals(4, BinarySearch.binarySearch(array, 0, array.length-1, 50));
		
		//Second test case
		int array1[]= {10,20,30,50,66,88,95};
		assertEquals(-1, BinarySearch.binarySearch(array1, 0, array.length-1, 500));
	}

}
