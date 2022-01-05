package com.espire.sorting;

import java.util.Arrays;

public class InsertionSort {

	
	public static void insertionSortRecursive(Integer[] array, Integer length) {
		if(length<=1) {
			return;
		}
		
		Integer blank=1;
		Integer temp=array[blank];
		while(blank>0 && array[blank-1]>temp){
			array[blank]=array[blank-1];
			blank--;
		}
		insertionSortRecursive(array, length);
	}


	// Driver Method
	public static void main(String[] args) {
		Integer arr[] = { 12, 11, 13, 5, 6 };

		insertionSortRecursive(arr, arr.length);

		System.out.println(Arrays.toString(arr));
	}

	
}
