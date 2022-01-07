package com.espire.bubblesort;

import java.util.Arrays;

public class BubbleSortUsingRecursion {
	public static void sortUsingRecursuion(int[] arr, int n) {
		if (n == 1) {
			return;
		}
		for (int j = 0; j < n - 1; j++) {
			if (arr[j] > arr[j + 1]) {
				int temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
		}
		sortUsingRecursuion(arr, n - 1);

	}

//main method
	public static void main(String args[]) {

		int arr[] = { 12, 14, 3, 6, 9, 2, 6 };

		BubbleSortUsingRecursion.sortUsingRecursuion(arr, arr.length);

		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);

		}
	}
}
