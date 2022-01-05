package bubble_sort;


import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

// perform the bubble sort
static void bubbleSort(int array[]) {
 int size = array.length;
 
 // loop to access each array element
 for (int i = 0; i < size - 1; i++)
 
   // loop to compare array elements
   for (int j = 0; j < size - i - 1; j++)

     // compare two adjacent elements and  sort in Ascending order
     if (array[j] > array[j + 1]) {

       // swapping
       int temp = array[j];
       array[j] = array[j + 1];
       array[j + 1] = temp;
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
      //reading  elements from the user   
     data[i]=sc.nextInt();  
    } 

 
 // call method
 BubbleSort.bubbleSort(data);
 
 System.out.println("Sorted Array in Ascending Order:");
 System.out.println(Arrays.toString(data));
}
}