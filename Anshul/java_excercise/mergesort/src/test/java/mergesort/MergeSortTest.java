package mergesort;

import static org.junit.Assert.*;

import org.junit.Test;

public class MergeSortTest {

	@Test
	public void mergeSorttest() {
		
		int size= 4;
		int array[]= {2,4,3,5};
	
		MergeSort.mergeSort(array, 0, size-1);
		
		int expArray[]= {2,3,4,5};
		assertArrayEquals(expArray,array);
		
	}
	
}
