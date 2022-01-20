package org.espire.bucketSort;

import java.util.Arrays;

public class BucketSort {

	public static void bucketSorting(int array[]) {

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

		int array[] = { 42, 32, 33, 52, 37, 47, 51 };

		BucketSort.bucketSorting(array);
		System.out.println(Arrays.toString(array));

	}
}
