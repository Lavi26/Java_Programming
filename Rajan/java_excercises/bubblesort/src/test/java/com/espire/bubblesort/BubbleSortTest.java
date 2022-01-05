/**
 * 
 */
package com.espire.bubblesort;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

/**
 * @author rajan.lahoti
 *
 */
public class BubbleSortTest {

	@Test
	public void test() {
		Integer array[] = { 6, 14, 8, 7, 9, 13 };
		Integer expArray[] = { 6, 7, 8, 9, 13, 14 };

		BubbleSort.bubbleSort(array);
		System.out.println(Arrays.toString(array));
		assertArrayEquals(expArray, array);

	}
}
