/**
 * 
 */
package org.espire.insertionsort;


import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

/**
 * @author ankit.jaisawal
 *
 */
public class InsertionSortTest {

	/**
	 * Test method for {@link org.espire.insertionsort.InsertionSort#insertionSort(int[])}.
	 */
	@Test
	public void testInsertionSort() {
		//First test case
		int [] array= {10,80,33,22};
		InsertionSort.insertionSort(array);
		int [] sortedArray= {10,22,33,80};
		assertArrayEquals(sortedArray, array);
		
		
		//Second test case
		int [] array1= {10,80,33,22,7,4,2,1};
		InsertionSort.insertionSort(array1);
		int [] sortedArray1= {1,2,4,7,10,22,33,80};
		assertArrayEquals(sortedArray1, array1);
		
	}

}
