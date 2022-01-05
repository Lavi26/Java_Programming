package binarysearch;

import java.util.Arrays;
import java.util.Scanner;


public class BinarySearch{  
    public static int binarySearch(int arr[], int first, int last, int key){  
        if (last>=first){  
            int mid = first + (last - first)/2;  
            if (arr[mid] == key){  
            return mid;  
            }  
            if (arr[mid] > key){  
            return binarySearch(arr, first, mid-1, key);//search in left subarray  
            }else{  
            return binarySearch(arr, mid+1, last, key);//search in right subarray  
            }  
        }  
        return -1;  
    }  
    
   static void SortingByInsertionSort(int array[]) {
    	 
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
    
    
    public static void main(String args[]){

    	Scanner sc = new Scanner(System.in);
        System.out.print("Enter size ");  
        int n=sc.nextInt();  
       
        int[] arr = new int[n];  
        System.out.println("Enter the numbers for Array ");  
        for(int i=0; i<n; i++)  
        {  
          //reading array elements from the user   
         arr[i]=sc.nextInt();  
        } 
        
        BinarySearch.SortingByInsertionSort(arr);
        System.out.println("Sorted Array");
        System.out.println(Arrays.toString(arr));
    	
        System.out.println("Enter key number you want to search in array "); 
        int key = sc.nextInt(); 
        int last=arr.length-1;  
        int result = binarySearch(arr,0,last,key);  
        if (result == -1)  
            System.out.println("Element is not found!");  
        else  
            System.out.println("Element is found at index: "+result);  
    }  
}   
