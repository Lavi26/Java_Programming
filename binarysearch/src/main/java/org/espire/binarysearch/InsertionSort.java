package org.espire.binarysearch;

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

		InsertionSort obj = new InsertionSort();
		obj.insertionSort(array);

		System.out.println("After sorting");
		for (int i = 0; i < size; i++) {
			System.out.println("Element= " + array[i]);
		}
	}

}
