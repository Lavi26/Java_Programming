package org.espire.sorting;

import java.util.Scanner;

/*
 * sorting array using merge sort algo
 * */

public class MergeSort {

	// Divide the array into two sub arrays, sort them, and merge them
	public static void mergeSort(int array[], int start, int end) {

		int mid;

		if (start < end) {

			// mid is the point where the array is divided into two sub array
			mid = (start + end) / 2;

			// recursivly call to each sub array
			mergeSort(array, start, mid);
			mergeSort(array, mid + 1, end);

			// merge sorted sub array
			merge(array, start, mid, end);

		}

	}

	// Merge two sub array into array
	private static void merge(int array[], int start, int mid, int end) {

		int n1 = mid - start + 1;
		int n2 = end - mid;

		// temporary array
		int LeftArray[] = new int[n1];
		int RightArray[] = new int[n2];

		// store data in temporary array
		for (int i = 0; i < n1; i++) {
			LeftArray[i] = array[start + i];
		}
		for (int j = 0; j < n2; j++) {
			RightArray[j] = array[mid + 1 + j];
		}

		// current index of sub array and main array
		int i = 0;
		int j = 0;
		int k = start;

		// until reach to the end of left array or right array, pick larger and place it
		// to the correct position
		while (i < n1 && j < n2) {
			if (LeftArray[i] <= RightArray[j]) {
				array[k] = LeftArray[i];
				i++;
			} else {
				array[k] = RightArray[j];
				j++;
			}
			k++;
		}

		// pick up remaining element and put in main array
		while (i < n1) {
			array[k] = LeftArray[i];
			i++;
			k++;
		}

		while (j < n2) {
			array[k] = RightArray[j];
			j++;
			k++;
		}

	}

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

		mergeSort(array, 0, size - 1);

		System.out.println("After sorting");
		for (int i = 0; i < size; i++) {
			System.out.println("Element= " + array[i]);
		}
	}

}
