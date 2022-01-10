package org.espire.binarysearch;

/*
 * Binary search
 */
public class BinarySearch {
<<<<<<< HEAD
=======

>>>>>>> 825caa0e5b94ed926fe7798db25d2269b6e26e2c
	// recursive method for binary search
	public static int binarySearch(int arr[], int first, int last, int key) {
		// if array is in order then perform binary search on the array
		if (last >= first) {
			// calculate mid of the array
			int mid = first + (last - first) / 2;
			// if key =intArray[mid] return mid
			if (arr[mid] == key) {
				return mid;
			}
			// if intArray[mid] > key then key is in left half of array
			if (arr[mid] > key) {
				return binarySearch(arr, first, mid - 1, key); // recursively search for key
			} else// key is in right half of the array
			{

				return binarySearch(arr, mid + 1, last, key); // recursively search for key
			}
		}
		return -1;
	}

	// main method
	public static void main(String args[]) {
		// define array and key
		int arr[] = { 1, 2, 3, 4, 5 };
		// key to be searched
		int key = 3;
		int last = arr.length - 1;
		// call binary search method
		int result = binarySearch(arr, 0, last, key);
		// print the result
		if (result == -1)
			System.out.println("Element is not found!");
		else
			System.out.println("Element is found at index: " + result);
	}
}
