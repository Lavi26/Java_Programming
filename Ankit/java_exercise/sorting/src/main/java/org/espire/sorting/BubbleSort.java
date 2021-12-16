/**
 * 
 */
package org.espire.sorting;

/**
 * @author ankit.jaisawal
 *
 */
public class BubbleSort {

	 //function to implement bubble sort and print the sorted array
	public static void bubbleSort(int array[]) {
		int i,j,temp,len=array.length;
		for(i=0;i<len;i++) {
			for(j=i+1;j<len;j++) {
				//Comparing
				if(array[j]<array[i]) {
					//Swapping
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		
		//printing the output
//		for(i=0;i<len;i++) {
//			if(i==len-1) {
//				System.out.print(array[i]);
//			}
//			else {
//				System.out.print(array[i]+",");
//			}
//			
//		}
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		int array[]= {10,80,20,3,7,8};
		
		//calling bubbleSort() method
		bubbleSort(array);

	}

}
