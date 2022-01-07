package org.espire.sorting;

import java.util.Arrays;

public class IterativeQuickSort {
    public static Integer partition(Integer array[], Integer min, Integer max) {
        Integer pivot = array[max];

        // index of smaller element
        Integer i = (min - 1);
        for (Integer j = min; j <= max - 1; j++) {
            // If current element is smaller than or equal to pivot

            if (array[j] <= pivot) {
                i++;

                // swap arr[i] and arr[j]
                Integer temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // swap array[i+1] and arr[max] (or pivot)
        Integer temp = array[i + 1];
        array[i + 1] = array[max];
        array[max] = temp;

        return i + 1;
    }

    // sorting array
    public static void quickSortIterative(Integer array[], Integer startIndex, Integer endIndex) {
        // Creating stack
        Integer[] stack = new Integer[endIndex - startIndex + 1];

        // initialize top of stack
        Integer top = -1;

        // push initial values of startIndex and endIndex to stack
        stack[++top] = startIndex;
        stack[++top] = endIndex;

        // Keep popping from stack while top is not empty
        while (top >= 0) {
            // Pop endIndex and startIndex
            endIndex = stack[top--];
            startIndex = stack[top--];

            // Set pivot element at its correct position in sorted array
            Integer p = partition(array, startIndex, endIndex);

            // If there are elements on left side of pivot then push left side to stack
            if (p - 1 > startIndex) {
                stack[++top] = startIndex;
                stack[++top] = p - 1;
            }

            // If there are elements on right side of pivot then push right side to stack
            if (p + 1 < endIndex) {
                stack[++top] = p + 1;
                stack[++top] = endIndex;
            }
        }
    }


    public static void main(String args[]) {
        Integer array[] = {10,60,20,40,50,70,30};

        quickSortIterative(array, 0, array.length - 1);

        System.out.println(Arrays.toString(array));
    }
}
