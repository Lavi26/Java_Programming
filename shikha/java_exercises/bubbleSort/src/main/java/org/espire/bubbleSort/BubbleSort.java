package org.espire.bubbleSort;

import java.util.Arrays;

public class BubbleSort {

	public static void bubbleSorting(Integer[] array) {

		int i, j, temp;

		for (i = 0; i < array.length; i++) {

			for (j = i + 1; j < array.length; j++) {

				// comparing current element to the next
				if (array[j] < array[i]) {

					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}

	public static void main(String args[]) {

		Integer array[] = { 24, 18, 22, 15, 5, 46 };

		BubbleSort.bubbleSorting(array);

		System.out.println(Arrays.toString(array));

	}
}
