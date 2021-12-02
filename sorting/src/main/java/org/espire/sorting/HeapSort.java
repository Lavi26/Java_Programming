package org.espire.sorting;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Sorting an array using heap sort algorithm
 * 
 * */
public class HeapSort {

	// function to heapify a subtree
	// i is the index of root node in array a[], n is the size

	public static void heapify(int a[], int n, int i) {

		// initialize largest as root
		int largest = i;

		// left child at level 2
		int left = 2 * i + 1;

		// right child at level 2
		int right = 2 * i + 2;

		// if left child is larger than root
		if (left < n && a[left] > a[largest]) {
			largest = left;
		}

		// if right child is larger than root
		if (right < n && a[right] > a[largest]) {
			largest = right;
		}

		// if root is not largest
		if (largest != i) {

			// swap and continue to build max heap
			int temp = a[i];
			a[i] = a[largest];
			a[largest] = temp;

			heapify(a, n, largest);
		}
	}

	// to implement the heap sort
	public static void heapSort(int a[]) {

		// build heap...rearrange array
		// In complete binary tree ,first index of leaf node is given n/2-1
		int n=a.length;
		for (int i = n / 2 - 1; i >= 0; i--) {

			heapify(a, n, i);
		}

		for (int i = n - 1; i >= 0; i--) {

			// put root element to the end by swaping

			int temp = a[0];
			a[0] = a[i];
			a[i] = temp;

			heapify(a, i, 0);
		}
	}

	public static void main(String args[]) {

		int array[] = { 6, 8, 4, 3, 5, 7 };
		
		HeapSort.heapSort(array);
		System.out.println(Arrays.toString(array));
		}

}
