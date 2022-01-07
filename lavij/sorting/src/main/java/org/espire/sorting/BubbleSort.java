package org.espire.sorting;

import java.util.Arrays;

public class BubbleSort {

	// sorting array using bubble sort
	public static void bubbleSort(Integer[] array) {

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

		Integer array[] = { 4, 8, 2, 5, 6 };
		
		bubbleSort(array);

		System.out.println(Arrays.toString(array));

	}

}
