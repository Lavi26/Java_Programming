package org.espire.binarysearch;

import java.util.Scanner;

public class QuickSort {

	/*
	 * sorting array using quick sort algorithm using recursion
	 */

	public static void quickSort(int array[], int first, int last) {

		int index = partition(array, first, last);

		// call quickSort with left part of partitioned array
		if (first < index - 1) {
			quickSort(array, first, index - 1);
		}

		// call quickSort with right part of partitioned array
		if (last > index) {
			quickSort(array, index, last);
		}
		return;

	}

	/*
	 * Divide array from pivot, left side is lesser than pivot and right side is
	 * greater than pivot
	 */
	public static int partition(int array[], int left, int right) {
		int pivot = array[left];

		while (left <= right) {

			// searching greater than pivot
			while (array[left] < pivot) {
				left++;
			}

			// searching lesser than pivot
			while (array[right] > pivot) {
				right--;
			}

			// swap
			if (left <= right) {
				int temp = array[left];
				array[left] = array[right];
				array[right] = temp;

				// increment in left side and decrement in right side
				left++;
				right--;
			}

		}
		return left;

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

		quickSort(array, 0, size - 1);

		System.out.println("After sorting");
		for (int i = 0; i < size; i++) {
			System.out.println("Element= " + array[i]);
		}
	}

}
