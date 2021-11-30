package org.espire.array;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class SortArrayDuplicacyTest {

	@Test
	public void sortTest() {
		
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

		SortArray obj = new SortArray();
		obj.quickSort(array, 0, size-1);

		assertArrayEquals(expArray, array);
	}

	@Test
	public void duplicacyTest() {

		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();

		int array[] = new int[size];
		int length = array.length;

		int expOutput[] = new int[size];

		System.out.println("Enter the elements of expected output array");
		for (int i = 0; i < size; i++) {
			expOutput[i] = scanner.nextInt();
		}

		RemoveDuplicateElement object = new RemoveDuplicateElement();
		int output = object.checkArray(array, length);

		assertEquals(expOutput, output);

	}

}
