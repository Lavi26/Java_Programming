package org.espire.sorting;

import static org.junit.Assert.*;

import org.junit.Test;

public class SortingTest {

	@Test
	public void bubbleSorttest() {
		
		int size= 4;
		int array[]= {2,4,3,5};
		
		BubbleSort obj = new BubbleSort();
		int[] output= obj.bubbleSort(array, size);
		
		int expArray[]= {2,3,4,5};
		assertArrayEquals(expArray,output);
		
	}
	
	@Test
	public void bucketSorttest() {
		
		int array[]= {2,4,3,5};
		
		BucketSort obj = new BucketSort();
		obj.bucketSort(array);
		
		int expArray[]= {2,3,4,5};
		assertArrayEquals(expArray,array);
		
	}
	
	@Test
	public void HeapSorttest() {
		
		int size= 4;
		int array[]= {2,4,3,5};
		
		HeapSort obj = new HeapSort();
		obj.heapSort(array, size);
		
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
