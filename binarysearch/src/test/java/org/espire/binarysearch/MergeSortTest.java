package org.espire.binarysearch;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class MergeSortTest {

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
		
	    int expArray[]= new int[size];
	    System.out.println("Enter the elements of expected array");
		for (int i = 0; i < size; i++) {
			expArray[i] = sc.nextInt();
		}
		
		MergeSort obj = new MergeSort();
		obj.mergeSort(array, 0, size-1);
		
		assertArrayEquals(expArray,array);
	}

}
