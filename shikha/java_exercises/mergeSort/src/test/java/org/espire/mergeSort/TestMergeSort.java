package org.espire.mergeSort;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class TestMergeSort {

	@Test
	public void test() {
		int size = 7;
		int array[] = { 12, 34, 23, 65, 10, 2, 4 };

		MergeSort obj = new MergeSort();
		obj.mergeSort(array, 0, size - 1);

		int expectedArray[] = { 2, 4, 10, 12, 23, 34, 65 };
		assertArrayEquals(expectedArray, array);
	}
}
