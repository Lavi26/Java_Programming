package bucketsort;

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
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many number you want sort ");
		int n = sc.nextInt();

		int[] data = new int[n];
		System.out.println("Enter the numbers for sorting ");
		
		// reading elements from the user
		for (int i = 0; i < n; i++) {
			data[i] = sc.nextInt();
		}

		// call method

		BucketSort.bucketSort(data);
		System.out.println(Arrays.toString(data));

	}

}