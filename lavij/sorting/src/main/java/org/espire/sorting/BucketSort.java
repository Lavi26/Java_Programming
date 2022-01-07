package org.espire.sorting;

import java.util.Arrays;

public class BucketSort {

	/*
	 * Sorting array using bucket sort algo
	 */
	public static void bucketSort(Integer array[]) {

		// max is the maximum element
		Integer max = maxValue(array);

		// create bucket array
		Integer bucket[] = new Integer[max + 1];

		// Make bucket an empty array
		for (Integer i = 0; i <= max; i++) {
			bucket[i] = 0;
		}

		// insert array element into bucket
		for (Integer i = 0; i < array.length; i++) {
			bucket[array[i]]++;
		}

		// sort the bucket
		for (Integer i = 0, j = 0; i <= max; i++) {

			while (bucket[i] > 0) {

				array[j] = i;
				j++;
				bucket[i]--;
			}
		}

	}

	// function to get maximum element
	public static Integer maxValue(Integer array[]) {

		int maxValue = array[0];
		for (Integer i = 1; i < array.length; i++) {

			if (array[i] > maxValue) {

				maxValue = array[i];
			}
		}
		return maxValue;
	}

	// Main Method
	public static void main(String args[]) {

		Integer array[] = { 6, 8, 4, 3, 5, 7 };

		BucketSort.bucketSort(array);
		System.out.println(Arrays.toString(array));

	}

}
