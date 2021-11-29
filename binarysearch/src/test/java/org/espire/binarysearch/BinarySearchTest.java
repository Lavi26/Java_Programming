package org.espire.binarysearch;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class BinarySearchTest {

	@Test
	public void test() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");

		int size = sc.nextInt();

		int array[] = new int[size];
		
		System.out.println("Enter the elements of an array");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		
		QuickSort o = new QuickSort();
		o.quickSort(array, 0, size - 1);

	    
		System.out.println("Enter the Search value:");
		int key = sc.nextInt();
		int last = array.length - 1;
		
		System.out.println("Enter the expected output:");
		int expOutput= sc.nextInt();
		
		BinarySearch obj = new BinarySearch();
		int output = obj.binarySearch(array, 0, last, key);

		assertEquals(expOutput,output);
		
	}

}
