package org.espire.binarySearch;

public class BinarySearch {

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
		int arr[] = { 10,20,30,40,50 };
		// key to be searched
		int key = 50;
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
