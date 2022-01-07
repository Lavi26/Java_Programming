package org.espire.quickSort;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestQuickSort {

	@Test
	public void test() {
		int size = 8;
		int array[] = { 6, 4, 3, 5, 4, 10, 2, 4 };

		QuickSort obj = new QuickSort();
		obj.quickSort(array, 0, size - 1);
	}

}
