package org.espire.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BucketSort {

	/*
	 * Sorting array using bucket sort algo
	 */
	public static void bucketSort(int array[]) {

		// max is the maximum element
		int max = maxValue(array);

		// create bucket array
		int bucket[] = new int[max + 1];

		// Make bucket an empty array
		for (int i = 0; i <= max; i++) {

			bucket[i] = 0;
		}

		// insert array element into bucket
		for (int i = 0; i < array.length; i++) {
			bucket[array[i]]++;
		}

		// sort the bucket
		for (int i = 0, j = 0; i <= max; i++) {

			while (bucket[i] > 0) {

				array[j] = i;
				j++;
				bucket[i]--;
			}
		}

	}

	// function to get maximum element
	public static int maxValue(int array[]) {

		int maxValue = array[0];
		for (int i = 1; i < array.length; i++) {

			if (array[i] > maxValue) {

				maxValue = array[i];
			}
		}
		return maxValue;
	}

	// Main Method
	public static void main(String args[]) {

		int array[] = { 6, 8, 4, 3, 5, 7 };

		BucketSort.bucketSort(array);
		System.out.println(Arrays.toString(array));

	}

}
