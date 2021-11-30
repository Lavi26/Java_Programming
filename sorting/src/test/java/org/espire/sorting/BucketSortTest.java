package org.espire.sorting;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class BucketSortTest {

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
		
		BucketSort obj = new BucketSort();
		obj.bucketSort(array);
		
		assertArrayEquals(expArray,array);
	}

}
