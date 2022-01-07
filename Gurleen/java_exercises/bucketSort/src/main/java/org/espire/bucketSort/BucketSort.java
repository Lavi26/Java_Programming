/**
 * 
 */
package org.espire.bucketSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * @author gurleen.kaur
 *
 */
public class BucketSort {

//	   static int[] sort(int[] sequence, int maxValue) 
//	    {
//	        // Bucket Sort
//	        int[] Bucket = new int[maxValue + 1];
//	        int[] sorted_sequence = new int[sequence.length];
//	 
//	        for (int i = 0; i < sequence.length; i++)
//	            Bucket[sequence[i]]++;
//	 
//	        int outPos = 0;
//	        for (int i = 0; i < Bucket.length; i++)
//	            for (int j = 0; j < Bucket[i]; j++)
//	                sorted_sequence[outPos++] = i;
//	 
//	        return sorted_sequence;
//	    }
//	 
//	    static void printSequence(int[] sorted_sequence) 
//	    {
//	        for (int i = 0; i < sorted_sequence.length; i++)
//	            System.out.print(sorted_sequence[i] + " ");
//	    }
//	 
//	    static int maxValue(int[] sequence) 
//	    {
//	        int maxValue = 0;
//	        for (int i = 0; i < sequence.length; i++)
//	            if (sequence[i] > maxValue)
//	                maxValue = sequence[i];
//	        return maxValue;
//	    }
//	 
//	    public static void main(String args[]) 
//	    {
//	        System.out
//	                .println("Sorting of randomly generated numbers using BUCKET SORT");
//	        Random random = new Random();
//	        int N = 20;
//	        int[] sequence = new int[N];
//	 
//	        for (int i = 0; i < N; i++)
//	            sequence[i] = Math.abs(random.nextInt(100));
//	 
//	        int maxValue = maxValue(sequence);
//	 
//	        System.out.println("\nOriginal Sequence: ");
//	        printSequence(sequence);
//	 
//	        System.out.println("\nSorted Sequence: ");
//	        printSequence(sort(sequence, maxValue));
//	    }

	// Bucket sort in Java

	  public static void bucketSort(float[] arr, int n) {
	    if (n <= 0)
	      return;
	    @SuppressWarnings("unchecked")
	    ArrayList<Float>[] bucket = new ArrayList[n];

	    // Create empty buckets
	    for (int i = 0; i < n; i++)
	      bucket[i] = new ArrayList<Float>();

	    // Add elements into the buckets
	    for (int i = 0; i < n; i++) {
	      int bucketIndex = (int) arr[i] * n;
	      bucket[bucketIndex].add(arr[i]);
	    }

	    // Sort the elements of each bucket
	    for (int i = 0; i < n; i++) {
	      Collections.sort((bucket[i]));
	    }

	    // Get the sorted array
	    int index = 0;
	    for (int i = 0; i < n; i++) {
	      for (int j = 0, size = bucket[i].size(); j < size; j++) {
	        arr[index++] = bucket[i].get(j);
	      }
	    }
	  }

	  // Driver code
	  public static void main(String[] args) {
	    BucketSort b = new BucketSort();
	    float[] arr = { (float) 0.42, (float) 0.32, (float) 0.33, (float) 0.52, (float) 0.37, (float) 0.47,
	        (float) 0.51 };
	    b.bucketSort(arr, 7);

	    for (float i : arr)
	      System.out.print(i + "  ");
	  }
}
