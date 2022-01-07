package org.espire.array;

public class RemoveDuplicateElementFromArray {
	public static int removeDuplicateElementsFromArray(int array[], int arrayLength){
        //Checking the length of the passed array
        if (arrayLength==0 || arrayLength==1){
            return arrayLength;
        }
        //Creating a temporary array of the passed array length
        int[] temp = new int[arrayLength];
        int j = 0;
        //For Loop iteration
        for (int i=0; i<arrayLength-1; i++){
            if (array[i] != array[i+1]){
                temp[j++] = array[i];
            }
         }
        //Setting the last element of array to the temp
        temp[j++] = array[arrayLength-1];
        // Changing original array
        for (int i=0; i<j; i++){
            array[i] = temp[i];
        }
        return j;
    }

    public static void main (String[] args) {
        //Declaring and Initializing of array
        int arr[] = {10,10,20,20,20,30,30,40,40,40,50,50,50};
        //Get the length of the array
        int n = arr.length;
        //Calling the custom function to remove duplicate elements
        n = removeDuplicateElementsFromArray(arr, n);
        //printing array elements
        for (int i=0; i<n; i++)
           System.out.print(arr[i]+" ");
    }
	}
