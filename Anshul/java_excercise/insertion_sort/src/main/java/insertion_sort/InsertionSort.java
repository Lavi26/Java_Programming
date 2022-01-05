package insertion_sort;
//Insertion sort in Java

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

static void insertionSort(int array[]) {
 
	int size = array.length;

 for (int i = 1; i < size; i++) {
   int key = array[i];
   int j = i - 1;

   // Compare key with each element on the left of it until an element smaller than
   // it is found.
   // For Ascending order
   while (j >= 0 && key < array[j]) {
     array[j + 1] = array[j];
     --j;
   }

   // Place key at after the element just smaller than it.
   array[j + 1] = key;
 }
}


public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter how many number you want sort ");  
    int n=sc.nextInt();  
   
    int[] data = new int[n];  
    System.out.println("Enter the numbers for sorting ");  
    for(int i=0; i<n; i++)  
    {  
      //reading array elements from the user   
     data[i]=sc.nextInt();  
    } 


    InsertionSort.insertionSort(data);
 System.out.println("Sorted Array in Ascending Order: ");
 System.out.println(Arrays.toString(data));
}
}