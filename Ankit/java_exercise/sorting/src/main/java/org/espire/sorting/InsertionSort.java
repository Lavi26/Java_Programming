/**
 * 
 */
package org.espire.sorting;

/**
 * @author ankit.jaisawal
 *
 */
public class InsertionSort {

	/* 
	 * function to sort an array with insertion sort 
	 */ 
	public static int[] insertionSort(int []array) {
		//Declaring variable
		int i,blank,temp=0;
		int len=array.length;
		
		
		for(i=1;i<len;i++) {
			temp=array[i];
			blank=i;
			
			// Move the elements greater than temp then move element at right 
			while(blank>0 && array[blank-1]>temp) {
				array[blank]=array[blank-1];
				blank=blank-1;
			}
			array[blank]=temp;
		}
		
		// function to print the sorted array
//		for(i=0;i<len;i++) {
//			if(i==len-1) {
//				System.out.print(array[i]);
//			}
//			else {
//				System.out.print(array[i]+",");
//			}
//		}
		return array;
	}
	
	//Main method
	public static void main(String args[]) {
		int [] array= {10,80,33,22};
		
		//calling the method
		insertionSort(array);
	}
}
