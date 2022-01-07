package com.espire.bubblesort;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	// sorting array using bubble sort
	public static void bubbleSort(Integer[] array) {

		int i, j, temp;

		for (i = 0; i < array.length; i++) {

			for (j = i + 1; j < array.length; j++) {

				// comparing present element to the next element
				if (array[j] < array[i]) {

					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}
//main method
	public static void main(String args[]) {

		Integer array[] = { 12, 14, 3, 6, 9, 2, 6 };

		BubbleSort.bubbleSort(array);

		System.out.println(Arrays.toString(array));

	}

}