package quicksort;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuickSortTest {

	@SuppressWarnings("static-access")
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
