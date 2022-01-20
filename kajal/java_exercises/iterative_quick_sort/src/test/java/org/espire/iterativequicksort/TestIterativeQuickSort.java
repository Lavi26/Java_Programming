package org.espire.iterativequicksort;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class TestIterativeQuickSort {

	@Test

	public void testQuickSort() {
		int[] expected = new int[] { 1, 2 };
		int[] array = new int[] { 2, 1 };
		IterativeQuickSort iterativeQuickSort = new IterativeQuickSort();
		iterativeQuickSort.QuickSort(array, 0, 1);
		assertNotNull(Arrays.equals(expected, array));

	}

}
