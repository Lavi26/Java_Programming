package org.espire.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

	/*
	 * sorting array using quick sort algorithm using recursion
	 */

	public static void quickSort(int array[], int first, int last) {

		int index = partition(array, first, last);

		// call quickSort with left part of partitioned array
		if (first < index-1) {
			quickSort(array, first, index - 1);
		}

		// call quickSort with right part of partitioned array
		if (last > index) {
			quickSort(array, index+1, last);
		}
		return;

	}

	/*
	 * Divide array from pivot, left side is lesser than pivot and right side is
	 * greater than pivot
	 */
	public static int partition(int array[], int first, int last) {
		int pivot = array[(first)];

		while (first <= last) {

			// searching greater than pivot
			while (array[first] < pivot) {
				first++;
			}

			// searching lesser than pivot
			while (array[last] > pivot) {
				last--;
			}

			// swap
			if (first <= last) {
				int temp = array[first];
				array[first] = array[last];
				array[last] = temp;

				// increment in left side and decrement in right side
				first++;
				last--;
			}

		}
		return first;

	}

	public static void main(String args[]) {


		int array[] = { 6, 8, 4, 3, 5, 7 };

		QuickSort.quickSort(array, 0,array.length-1);
		System.out.println(Arrays.toString(array));
	}

}
