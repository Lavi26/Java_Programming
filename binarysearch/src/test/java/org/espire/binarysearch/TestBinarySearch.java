package org.espire.binarysearch;

import java.util.Scanner;

public class TestBinarySearch {
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


        SortingArray o= new SortingArray();
        o.quickSort(array);
		System.out.println("After sorting");
		for (int i = 0; i < size; i++) {
			System.out.println("Element= " + array[i]);
		}

		System.out.println("Enter the Search value:");
		int key = sc.nextInt();
		int last = array.length - 1;
		
        BinarySearch obj= new BinarySearch();
		int output = obj.binarySearch(array, 0, last, key);

		if (output == -1) {
			System.out.println("Element is not found");
		} else {
			System.out.println("Element is found at " + output);
		}

	}

}
