package org.espire.binarysearch;

import java.util.Arrays;

public class BinarySearch {

	/*
	 * Searching position of a value
	 */

	public static int binarySearch(Integer[] a, Integer first, Integer last, Integer key) {

		// checking if first element of array is lessor than last element
		if (first <= last) {

			// initialize a variable and store the value of mid index
			Integer mid = first + (last-first) / 2;

			// Here three conditions are occur
			// whether mid index value equal to key value....get the position
			if (a[mid] == key) {
				return mid;
			}

			// if mid index value greater than key value....checking previous values from
			// mid index
			if (a[mid] > key) {
				return binarySearch(a,first, mid - 1, key);
			} else {

				// checking next values from mid index value
				return binarySearch(a, mid + 1, last, key);
			}
		}
		//if key not present
		return -1;

	}
	/*
	 * sorting array using quick sort algorithm using recursion
	 */

	public static void quickSort(Integer array[], Integer first, Integer last) {

		Integer index = partition(array, first, last);

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
	public static int partition(Integer array[], Integer left, Integer right) {
		Integer pivot = array[left];

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
				Integer temp = array[left];
				array[left] = array[right];
				array[right] = temp;

				// increment in left side and decrement in right side
				left++;
				right--;
			}

		}
		return left;

	}

	public static void main(String args[]) {

		Integer array[] = { 10, 50, 20, 40, 30, 50 };

		BinarySearch.quickSort(array, 0, array.length - 1);
		System.out.println(Arrays.toString(array));

		Integer searchKey = 30;

		Integer output = BinarySearch.binarySearch(array, 0, array.length -1, searchKey);
		if (output == -1) {
			System.out.println("Not Found");
		} else {
			System.out.println("Found at " + output);
		}
	}

}