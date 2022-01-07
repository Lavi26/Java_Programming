package org.espire.sorting;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class SortingTest {

    @Test
    public void bubbleSortTest() {

        Integer array[] = {4, 6, 2, 3, 1, 8};
        Integer expArray[] = {1, 2, 3, 4, 6, 8};

        BubbleSort.bubbleSort(array);
        System.out.println(Arrays.toString(array));
        assertArrayEquals(expArray, array);

    }

    @Test
    public void bubbleSortRecursionTest() {

        Integer array[] = {4, 6, 2, 3, 1, 8};
        Integer expArray[] = {1, 2, 3, 4, 6, 8};

        BubbleSortUsingRecursion.bubbleSort(array, array.length);
        assertArrayEquals(expArray, array);

    }

    @Test
    public void bucketSortTest() {

        Integer array[] = {4, 6, 2, 3, 1, 8};
        Integer expArray[] = {1, 2, 3, 4, 6, 8};

        BucketSort.bucketSort(array);
        System.out.println(Arrays.toString(array));
        assertArrayEquals(expArray, array);
    }

    @Test
    public void HeapSortTest() {

        int array[] = {2, 4, 3, 5};

        HeapSort.heapSort(array);

        int expArray[] = {2, 3, 4, 5};
        assertArrayEquals(expArray, array);

    }

    @Test
    public void insertionSortTest() {

        int array[] = {2, 4, 3, 5};
        InsertionSort.insertionSort(array);

        int expArray[] = {2, 3, 4, 5};
        assertArrayEquals(expArray, array);

    }

    @Test
    public void mergeSortTest() {

        Integer array[] = {2, 4, 3, 5};

        MergeSort.mergeSort(array, 0, array.length - 1);

        Integer expArray[] = {2, 3, 4, 5};
        assertArrayEquals(expArray, array);

    }


    @Test
    public void quickSortTest() {

        int size = 4;
        int array[] = {2, 4, 3, 5};

        QuickSort.quickSort(array, 0, size - 1);

        int expArray[] = {2, 3, 4, 5};
        assertArrayEquals(expArray, array);

    }

    @Test
    public void iterativeQuickSortTest() {

        Integer array[] = {2, 4, 3, 5};

        IterativeQuickSort.quickSortIterative(array, 0, array.length - 1);

        Integer expArray[] = {2, 3, 4, 5};
        assertArrayEquals(expArray, array);

    }


}
