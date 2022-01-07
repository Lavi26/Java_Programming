/**
 * 
 */
package com.espire.insertionsort;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author rajan.lahoti
 *
 */
public class InsertionSortTest {
	Integer[] array = { 15, 5, 16, 67, 55 };
	Integer[] sortedArray = { 5, 15, 16, 55, 67 };

	@Test
	public void test() {

		InsertionSort.insertionSort(array);
		assertArrayEquals(sortedArray, array);

	}

}
