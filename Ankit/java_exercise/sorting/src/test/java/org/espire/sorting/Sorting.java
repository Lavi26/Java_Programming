/**
 * 
 */
package org.espire.sorting;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author ankit.jaisawal
 *
 */
public class Sorting {

	/**
	 * Test method for {@link org.espire.sorting.InsertionSort#insertionSort(int[])}.
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
		System.out.println();
		
	}
	
	//Testing bubble sort
	@Test
	public void testBubbleSort() {
		int []array={10,80,33,22,7,4,2,1};
		BubbleSort.bubbleSort(array);
		int []sortedArray={1,2,4,7,10,22,33,80};
		assertArrayEquals(sortedArray, array);
	}


}
