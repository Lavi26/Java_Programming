package org.espire.sorting;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class SortingTest {

	@Test
	public void bubbleSorttest() {

		Integer array[] = {4,6,2,3,1,8};
		Integer expArray[]= {1,2,3,4,6,8};
		
		BubbleSort.bubbleSort(array);
		System.out.println(Arrays.toString(array));
		assertArrayEquals(expArray,array);
		
	}
	
	@Test
	public void bucketSorttest() {
		
		int array[] = {4,6,2,3,1,8};
		int expArray[]= {1,2,3,4,6,8};
		
		BucketSort.bucketSort(array);
		System.out.println(Arrays.toString(array));
		assertArrayEquals(expArray,array);
	}
	
	@Test
	public void HeapSorttest() {
		
		int size= 4;
		int array[]= {2,4,3,5};
		
		HeapSort obj = new HeapSort();
		obj.heapSort(array);
		
		int expArray[]= {2,3,4,5};
		assertArrayEquals(expArray,array);
		
	}
	
	@Test
	public void insertionSorttest() {
		
		int array[]= {2,4,3,5};
		
		InsertionSort obj = new InsertionSort();
		obj.insertionSort(array);
		
		int expArray[]= {2,3,4,5};
		assertArrayEquals(expArray,array);
		
	}
	
	@Test
	public void mergeSorttest() {
		
		int size= 4;
		int array[]= {2,4,3,5};
		
		MergeSort obj = new MergeSort();
		obj.mergeSort(array, 0, size-1);
		
		int expArray[]= {2,3,4,5};
		assertArrayEquals(expArray,array);
		
	}
	

	@Test
	public void quickSorttest() {
		
		int size= 4;
		int array[]= {2,4,3,5};
		
		QuickSort obj = new QuickSort();
		obj.quickSort(array, 0, size-1);
		
		int expArray[]= {2,3,4,5};
		assertArrayEquals(expArray,array);
		
	}


}
