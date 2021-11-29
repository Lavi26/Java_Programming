package org.espire.binarysearch;

import java.util.Scanner;

public class BinarySearch {

	/*
	 * Searching position of a value
	 */

	public static int binarySearch(int a[], int first, int last, int key) {

		// checking if first element of array is lessor than last element
		if (first <= last) {

			// initialize a variable and store the value of mid index
			int mid = first + (last - first) / 2;

			// Here three conditions are occur
			// whether mid index value equal to key value....get the position
			if (a[mid] == key) {
				return mid;
			}

			// if mid index value greater than key value....checking previous values from
			// mid index
			if (a[mid] > key) {
				return binarySearch(a, mid - 1, last, key);
			} else {

				// checking next values from mid index value
				return binarySearch(a, mid + 1, last, key);

			}
		}
		return -1;
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");

		int size = sc.nextInt();
        
		//initialize array
		int array[] = new int[size];

		System.out.println("Enter the elements");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}

		System.out.println("Before sorting");
		for (int i = 0; i < size; i++) {
			System.out.println("Element= " + array[i]);
		}
        
		//declare the object of QuickSort class
		QuickSort o = new QuickSort();
		o.quickSort(array, 0, size - 1);

		System.out.println("After sorting");
		for (int i = 0; i < size; i++) {
			System.out.println("Element= " + array[i]);
		}
        
		System.out.println("Enter the Search value:");
		int key = sc.nextInt();
		int last = array.length - 1;
        
		//declare the object 
		BinarySearch obj = new BinarySearch();
		int output = obj.binarySearch(array, 0, last, key);

		if (output == -1) {
			System.out.println("Element is not found");
		} else {
			System.out.println("Element is found at " + output);
		}

	}

}
