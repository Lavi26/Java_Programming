package org.espire.insertionSort;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestInsertionSort {

	@Test
	public void testInsertion() {
		int array[] = { 3, 1, 6, 4, 5 };

		InsertionSort sort = new InsertionSort();
		sort.sortInsertion(array);
	}

}
