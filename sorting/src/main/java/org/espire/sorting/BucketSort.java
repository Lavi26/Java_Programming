package org.espire.sorting;

import java.util.Scanner;

public class BucketSort {
	 
	/*
	 * Sorting array using bucket sort algo
	 * */
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
    
	//Main Method
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");

		int size = sc.nextInt();

		int array[] = new int[size];

		System.out.println("Enter the elements");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}

		System.out.println("Before sorting");
		for (int i = 0; i < size; i++) {
			System.out.println("Element= " + array[i]);
		}

		BucketSort obj = new BucketSort();
		obj.bucketSort(array);

		System.out.println("After sorting");
		for (int i = 0; i < size; i++) {
			System.out.println("Element= " + array[i]);
		}
	}

}
