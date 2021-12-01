package org.espire.sorting;

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
	public static void heapSort(int a[], int n) {

		// build heap...rearrange array
		// In complete binary tree ,first index of leaf node is given n/2-1
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

		
		heapSort(array, size);

		System.out.println("After sorting");
		for (int i = 0; i < size; i++) {
			System.out.println("Element= " + array[i]);
		}
	}

}
