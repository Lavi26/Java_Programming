package com.espire.insertionsort;

public class InsertionSort {
	public static Integer[] insertionSort(Integer[] array) {
		// Declaring variables
		Integer i, blank, temp = 0;
		Integer len = array.length;

		for (i = 1; i < len; i++) {
			temp = array[i];
			blank = i;

			// Move the elements greater than temp then move element at right
			while (blank > 0 && array[blank - 1] > temp) {
				array[blank] = array[blank - 1];
				blank = blank - 1;
			}
			array[blank] = temp;
		}
		return array;
	}

	// Main method
	public static void main(String args[]) {
		Integer[] array = { 12, 93, 65, 54, 46 };
		Integer i;
		Integer output[] = insertionSort(array);
		for (i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}
}
