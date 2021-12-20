package org.espire.quicksort;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class TestQuickSort {

	
	 
		 
		  @Test
		    public void testQuickSort() {
		        Integer[] expected = new Integer[] { 1, 2 };
		        Integer[] array = new Integer[] { 2, 1 };
		        QuickSort.quickSort(array, 2, 1);
		        assertNotNull(Arrays.equals(expected, array));
		    }}