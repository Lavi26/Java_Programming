/**
 * 
 */
package org.espire.quickSort;

import java.util.Scanner;

/**
 * @author gurleen.kaur
 *
 */
public class IterativeQuickSort {

    static int partition(int arr[], int low, int high) 
    { 
        int pivot = arr[high];
        int i = (low - 1); 
        for (int j = low; j <= high - 1; j++) { 
            if (arr[j] <= pivot) { 
                i++; 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
        int temp = arr[i + 1]; 
        arr[i + 1] = arr[high]; 
        arr[high] = temp; 
  
        return i + 1; 
    } 
    static void quick_sort(int arr[], int l, int h) 
    { 
        int[] stack = new int[h - l + 1]; 
        int top = -1; 
        stack[++top] = l; 
        stack[++top] = h; 
        while (top >= 0) { 
            h = stack[top--]; 
            l = stack[top--]; 
            int p = partition(arr, l, h); 
            if (p - 1 > l) { 
                stack[++top] = l; 
                stack[++top] = p - 1; 
            } 
            if (p + 1 < h) { 
                stack[++top] = p + 1; 
                stack[++top] = h; 
            } 
        } 
    }
    public static void main(String[] args)  
    { 
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sr.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sr.nextInt();
        }
        quick_sort(a,0,n-1);
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
