package org.espire.binarysearch;

import java.util.Arrays;

public class BinarySearch {

	/*
	 * Searching position of a value
	 */

	public static int binarySearch(int a[], int first, int last, int key) {

		// checking if first element of array is lessor than last element
		if (first <= last) {

			// initialize a variable and store the value of mid index
			int mid = (first + last) / 2;

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
		return -1;

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

	public static void main(String args[]) {

		int array[] = { 10, 50, 20, 40, 30, 50 };

		BinarySearch.quickSort(array, 0, array.length - 1);
		System.out.println(Arrays.toString(array));

		int searchKey = 20;

		int output = BinarySearch.binarySearch(array, 0, array.length -1, searchKey);
		if (output == -1) {
			System.out.println("Not Found");
		} else {
			System.out.println("Found at " + output);
		}
	}

}