package com.espire.remove_duplicates;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {
	public static void removeDuplicateUsingSorting(int arr[]) {
		// Sort an unsorted array
		Arrays.sort(arr);
		int len = arr.length;
		int j = 0;
		// Traverse an array
		for (int i = 0; i < len - 1; i++) {
			// if value present at i and i+1 index is not equal
			if (arr[i] != arr[i + 1]) {
				arr[j++] = arr[i];
			}
		}
		arr[j++] = arr[len - 1];
		for (int k = 0; k < j; k++) {
			System.out.print(arr[k] + " ");
		}
	}

//main method
	public static void main(String[] args) {
		int arr[] = { 3, 6, 6, 6, 1, 9, 5, 5, 5, 7 };
		removeDuplicateUsingSorting(arr);
	}

}
