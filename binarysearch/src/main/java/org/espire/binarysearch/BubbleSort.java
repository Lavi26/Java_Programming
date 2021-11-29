package org.espire.binarysearch;

import java.util.Scanner;

public class BubbleSort {
	
	//sorting array using bubble sort
	public static int[] bubbleSort(int a[], int size) {

		int i, j, temp;
        
		for (i = 0; i < size; i++) {

			for (j = i + 1; j < size; j++) {
                
				//comparing current element to the next
				if (a[j] < a[i]) {

					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}
		return a;
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


	    BubbleSort obj = new BubbleSort();
	    obj.bubbleSort(array, size);
	    
		System.out.println("After sorting");
		for (int i = 0; i < size; i++) {
			System.out.println("Element= " + array[i]);
		}
		}
	
}
