package org.espire.insertionsort;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestInsertionSort {

	@Test
	public void shouldSortValues() {
		int[] values = { 9, -3, 5, 0, 1 };
		int[] expectedOrder = { -3, 0, 1, 5, 9 };

		InsertionSort.insertionSort(values);

		assertArrayEquals(expectedOrder, values);
	}
}
