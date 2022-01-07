package bubble_sort;


import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class BubbleSortTest {

	@Test
	public void bubbleSorttest() {

		int array[] = {4,6,2,3,1,8};
		int expArray[]= {1,2,3,4,6,8};
		
		BubbleSort.bubbleSort(array);
		System.out.println(Arrays.toString(array));
		assertArrayEquals(expArray,array);
		
	}

}
