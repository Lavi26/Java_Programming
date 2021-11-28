package org.espire.binarysearch;

public class SortingArray {
	/*
	 * sorting array using quick sort algorithm
	 * */
	
	public static void quickSort(int array[]) {
		
		sortArray(array,0,array.length-1);
		 
		return ;
	}
	
	
	public static void sortArray(int array[],int first, int last) {
		
		int index = partition(array,first,last);
		
		//call quickSort with left part of partitioned array
		if(first<index-1) {
			sortArray(array,first, index-1);
		}
		
		//call quickSort with right part of partitioned array
		if(last>index) {
			sortArray(array,index,last);
		}
		return;
		
	}
			
    /*
     * Divide array from pivot
     * left side is lesser than pivot
     * right side is greater than pivot
     * */
	public static int partition(int array[], int left, int right) {
		int pivot = array[left];
		
		while(left<=right) {
			
			//searching greater than pivot
			while(array[left] < pivot) {
				left++;
			}
			
			//searching lesser than pivot
			while(array[right] > pivot) {
				right--;
		}
			
			//swap
			if(left<=right) {
				int temp = array[left];
				array[left]= array[right];
				array[right]= temp;
				
				//increment in left side and decrement in right side
				left++;
				right--;
			}
		
	}
		return left;
		
	}


}
