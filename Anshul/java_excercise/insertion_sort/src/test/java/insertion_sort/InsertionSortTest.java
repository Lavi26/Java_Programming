package insertion_sort;

import static org.junit.Assert.*;

import org.junit.Test;

public class InsertionSortTest {
	@Test
	public void insertionSorttest() {
		
		int array[]= {2,4,3,5};
		
		InsertionSort obj = new InsertionSort();
		obj.insertionSort(array);
		
		int expArray[]= {2,3,4,5};
		assertArrayEquals(expArray,array);
		
	}
}
