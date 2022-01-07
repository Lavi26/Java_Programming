package org.espire.sorting;

import java.util.Arrays;

public class BubbleSortUsingRecursion {

    //    Bubble sort using recursion method
    public static void bubbleSort(Integer[] a, Integer n) {

        if (n == 1) {
            return ;
        }

        for (int i = 0; i < n - 1; i++) {

            if (a[i] > a[i + 1]) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
            }
        }
        //fix the largest element and recursion for remaining
        bubbleSort(a, n - 1);
    }


    public static void main(String args[]) {

        Integer array[]= {5,6,3,2,8,7,4,1};

        bubbleSort(array, array.length );
        System.out.println(Arrays.toString(array));
    }
}
