package org.espire.array;

import java.util.Scanner;

import org.espire.array.RemoveDuplicateElement;

public class TestDuplicacy {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");

		int size = sc.nextInt();
		
		RemoveDuplicateElement obj = new RemoveDuplicateElement();
		

		int array[] = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Enter the elements");
			array[i] = sc.nextInt();
		}

		System.out.println("Before sorting");
		for (int i = 0; i < size; i++) {
			System.out.println("Element= " + array[i]);
		}

		for (int i = 0; i < size; i++) {
			for (int j = 1; j < size; j++) {
				if (array[j - 1] > array[j]) {
					int temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;

				}

			}
		}
		
		System.out.println("After sorting");
		for (int i = 0; i < size; i++) {
			System.out.println("Element= " + array[i]);
		}
		
		int length=array.length;

	    length =obj.checkArray(array, length);
		for (int i = 0; i <length; i++) {
			System.out.println("Final array element:" + array[i]);
		}

	
	}
}
