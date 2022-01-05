package org.espire.array;

import java.util.Arrays;

public class RemoveDuplicacyInArray {

	/*
	 * Remove Duplicate Element From An Array n is the size of array[]
	 */
	public static int removeDuplicates(int[] array) {

		if (array.length <= 1) {
			return array.length;
		}

		int j = 0;
		int comp[] = new int[array.length];

		// checking the element..whether it is not equal to the next element
		// store the elements in the temporary array
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] != array[i + 1]) {
				comp[j] = array[i];
				j++;
			}
		}
        //for last element
		comp[j] = array[array.length -1];
		j++;

		// store the element of temporary array into original array
		for (int i = 0; i < j; i++) {
			array[i] = comp[i];
		}
		return j ;
	}

	/*
	 * sorting array using quick sort algorithm using recursion
	 */

	public static void quickSort(int array[], int first, int last) {

		int index = partition(array, first, last);

		// call quickSort with left part of partitioned array
		if (first < index - 1) {
			quickSort(array, first, index - 1);
		}

		// call quickSort with right part of partitioned array
		if (last > index) {
			quickSort(array, index, last);
		}
		return;

	}

	/*
	 * Divide array from pivot, left side is lesser than pivot and right side is
	 * greater than pivot
	 */
	public static int partition(int array[], int left, int right) {
		int pivot = array[left];

		while (left <= right) {

			// searching greater than pivot
			while (array[left] < pivot) {
				left++;
			}

			// searching lesser than pivot
			while (array[right] > pivot) {
				right--;
			}

			// swap
			if (left <= right) {
				int temp = array[left];
				array[left] = array[right];
				array[right] = temp;

				// increment in left side and decrement in right side
				left++;
				right--;
			}

		}
		return left;

	}

	public static void main(String[] args) {
		int[] array = { 1, 4, 3, 5, 7, 5 };
		
		RemoveDuplicacyInArray.quickSort(array, 0,array.length -1);
		System.out.println(Arrays.toString(array));

		RemoveDuplicacyInArray.removeDuplicates(array);
		System.out.println(Arrays.toString(array));
	}
}
