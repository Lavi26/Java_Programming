package org.espire.bucketsort;

public class BucketSort {

	// Declare unsorted array
	private static int[] arr = { 12, 3, 8, 9, 1, 14, 6, 7, 5, 89 };

	// This method Sort Array using Bucket Sort in java

	static void bucketSort(int maxValue) {

		int[] bucketArray = new int[maxValue + 1];

		for (int i = 0; i < arr.length; i++)
			bucketArray[arr[i]]++;

		// Create sortedArray - to store sorted arr
		int[] sortedArray = new int[arr.length];

		int x = 0;
		for (int i = 0; i < bucketArray.length; i++)
			for (int j = 0; j < bucketArray[i]; j++)
				sortedArray[x++] = i;

		// Copy elements of sortedArray array to arr
		// arr will be the sorted array now.
		arr = sortedArray;
	}

	// Method to find the maximum value in the array

	static int maxValue() {
		int maxValue = 0;
		for (int i = 0; i < arr.length; i++)
			if (arr[i] > maxValue) {
				maxValue = arr[i];
			}
		return maxValue;
	}

	// method to Display Array

	public static void display() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	// main method
	public static void main(String[] args) {

		System.out.print("Elements before Bucket sorting : ");
		BucketSort.display(); // display unsorted array

		BucketSort.bucketSort(maxValue()); // bucket sort the array

		System.out.print("\nElements after Bucket sorting  : ");
		BucketSort.display(); // display sorted array

	}

}

