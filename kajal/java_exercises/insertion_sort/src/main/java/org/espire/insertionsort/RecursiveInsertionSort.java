package org.espire.insertionsort;

import java.util.Arrays;

public class RecursiveInsertionSort {
	// Recursive function to sort an array using insertion sort
	static void recursiveInsertionSort(int my_arr[], int arr_len) {
		// Base case
		if (arr_len <= 1)
			return;
		// Sort first n-1 elements
		recursiveInsertionSort(my_arr, arr_len - 1);
		// Insert last element at its correct position in sorted array
		int last = my_arr[arr_len - 1];
		int j = arr_len - 2;
		// Move elements of arr[0..i-1], that are greater than key, to one position
		// ahead of their current position
		while (j >= 0 && my_arr[j] > last) {
			my_arr[j + 1] = my_arr[j];
			j--;
		}
		my_arr[j + 1] = last;
	}

	// main method
	public static void main(String[] args) {
		int my_arr[] = { 11, 23, 67, 83, 42, 11, 0 };
		recursiveInsertionSort(my_arr, my_arr.length);
		System.out.println("The array elements after implementing insertion sort is ");
		System.out.println(Arrays.toString(my_arr));
	}
}
