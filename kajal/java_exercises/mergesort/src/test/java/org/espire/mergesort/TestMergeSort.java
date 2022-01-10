package org.espire.mergesort;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class TestMergeSort {

	@Test

	public void testMergeSort() {
		int[] expected = new int[] { 1, 2, 4, 5, 6 };
		int[] array = new int[] { 2, 1, 5, 4, 6 };
		MergeSort.printArray(expected);
		assertNotNull(Arrays.equals(array, expected));

	}
}