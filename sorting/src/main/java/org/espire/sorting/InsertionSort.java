package org.espire.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

	/*
	 * insertion sort function
	 */
	public static void insertionSort(int array[]) {

		int len = array.length;
		int i, j, temp;

		for (i = 1; i < len; i++) {

			temp = array[i];
			j = i - 1;

			// compare with each element on the left until the smaller element found
			while (j >= 0 && temp <= array[j]) {

				array[j + 1] = array[j];
				j = j - 1;
			}

			// place temp just after the smaller element
			array[j + 1] = temp;
		}
	}

	public static void main(String args[]) {

		int array[] = { 6, 8, 4, 3, 5, 7 };

		InsertionSort.insertionSort(array);
		System.out.println(Arrays.toString(array));
		
	}

}
