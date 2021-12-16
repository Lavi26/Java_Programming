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
	 * Test method for
	 * {@link org.espire.sorting.InsertionSort#insertionSort(int[])}.
	 */
	Integer[] array = { 10, 80, 33, 22 };
	Integer[] sortedArray = { 10, 22, 33, 80 };
	// For second test case
	Integer[] array1 = { 10, 80, 33, 22, 7, 4, 2, 1 };
	Integer[] sortedArray1 = { 1, 2, 4, 7, 10, 22, 33, 80 };

	// Test cases for insertion sort
	@Test
	public void testInsertionSort1() {
		InsertionSort.insertionSort(array);
		assertArrayEquals(sortedArray, array);
	}

	@Test
	public void testInsertionSort2() {
		// Second test case
		InsertionSort.insertionSort(array1);
		assertArrayEquals(sortedArray1, array1);

	}

	// Test cases for bubble sort
	@Test
	public void testBubbleSort1() {
		BubbleSort.bubbleSort(array);
		assertArrayEquals(sortedArray, array);
	}

	@Test
	public void testBubbleSort2() {
		BubbleSort.bubbleSort(array);
		assertArrayEquals(sortedArray, array);
	}

}
