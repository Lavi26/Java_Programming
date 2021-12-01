package org.espire.binarysearch;

import java.util.Scanner;

public class BinarySearch {

	/*
	 * Searching position of a value
	 */

	public static int binarySearch(int a[], int first, int last, int key) {

		// checking if first element of array is lessor than last element
		if (first <= last) {

			// initialize a variable and store the value of mid index
			int mid = first + (last - first) / 2;

			// Here three conditions are occur
			// whether mid index value equal to key value....get the position
			if (a[mid] == key) {
				return mid;
			}

			// if mid index value greater than key value....checking previous values from
			// mid index
			if (a[mid] > key) {
				return binarySearch(a, mid - 1, last, key);
			} else {

				// checking next values from mid index value
				return binarySearch(a, mid + 1, last, key);

			}
		}
		return -1;
	}

}