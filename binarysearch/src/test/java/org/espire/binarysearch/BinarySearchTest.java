package org.espire.binarysearch;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class BinarySearchTest {

	@Test
	public void quickSortTest() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");

		int size = sc.nextInt();

		int array[] = new int[size];

		System.out.println("Enter the elements of an array");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}

		int expArray[] = new int[size];
		System.out.println("Enter the elements of expected array");
		for (int i = 0; i < size; i++) {
			expArray[i] = sc.nextInt();
		}

		QuickSort obj = new QuickSort();
		obj.quickSort(array, 0, size-1);

		assertArrayEquals(expArray, array);

	}

	@Test
	public void binarySearchTest() {

		Scanner scanner = new Scanner(System.in);

		int size = scanner.nextInt();

		int array[] = new int[size];

		System.out.println("Enter the Search value:");
		int key = scanner.nextInt();
		int last = size-1;

		System.out.println("Enter the expected output:");
		int expOutput = scanner.nextInt();

		BinarySearch obj = new BinarySearch();
		int output = obj.binarySearch(array, 0, last, key);

		assertEquals(expOutput, output);

	}

}
