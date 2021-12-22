package org.espire.mergesort;

/*Write a program to implement merge sort algorithm */

  public class MergeSort {

  // Merges two subarrays of array.

	void merge(int arr[], int left, int mid, int right) {
		// Find sizes of two subarrays to be merged
		int n1 = mid - left + 1;
		int n2 = right - mid;

		// Create temp arrays
		int Left[] = new int[n1];
		int Right[] = new int[n2];

		// Copy data to temp arrays
		for (int i = 0; i < n1; ++i)
			Left[i] = arr[left + i];
		for (int j = 0; j < n2; ++j)
			Right[j] = arr[mid + 1 + j];

		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarray array
		int k = left;
		while (i < n1 && j < n2) {
			if (Left[i] <= Right[j]) {
				arr[k] = Left[i];
				i++;
			} else {
				arr[k] = Right[j];
				j++;
			}
			k++;
		}

		// Copy remaining elements of Left array
		while (i < n1) {
			arr[k] = Left[i];
			i++;
			k++;
		}

		// Copy remaining elements of Right array
		while (j < n2) {
			arr[k] = Right[j];
			j++;
			k++;
		}
	}

	// Main function that sorts arr[l..r] using
	// merge()
	void sort(int arr[], int left, int right) {
		if (left < right) {
			// Find the middle point
			int mid = left + (right - left) / 2;

			// Sort first and second halves
			sort(arr, left, mid);
			sort(arr, mid + 1, right);

			// Merge the sorted halves
			merge(arr, left, mid, right);
		}
	}

	// A utility function to print array of size n
	public static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// main method
	public static void main(String args[]) {
		int arr[] = { 12, 11, 13, 5, 6, 7 };

		System.out.println("Unsorted array");
		printArray(arr);

		MergeSort ob = new MergeSort();
		ob.sort(arr, 0, arr.length - 1);

		System.out.println("\nSorted array");
		printArray(arr);
	}
}
