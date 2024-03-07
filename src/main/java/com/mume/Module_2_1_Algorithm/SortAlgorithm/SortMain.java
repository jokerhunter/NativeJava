package com.mume.Module_2_1_Algorithm.SortAlgorithm;

import java.util.Arrays;

public class SortMain {
    public static void main(String[] args) {
        Integer [] arr = { 32,-1,5,23,54,234,7,25 };

        // 1. bubble sort
        BubbleSort bubbleSort = new BubbleSort();
//        bubbleSort.sort(arr);
//        System.out.println(Arrays.toString(arr) + "\nreserve sort\n");
//        bubbleSort.reverseSort(arr);
//        System.out.println(Arrays.toString(arr));

        // 2. selection sort
        SelectionSort selectionSort = new SelectionSort();
//        selectionSort.sort(arr);
//        System.out.println(Arrays.toString(arr) + "\nreserve sort\n");
//        selectionSort.reverseSort(arr);
//        System.out.println(Arrays.toString(arr));

        // 3. insertion sort
//        InsertionSort insertionSort = new <Integer>InsertionSort();
//        insertionSort.sort(arr);
//        System.out.println(Arrays.toString(arr) + "\nreserve sort\n");
//        insertionSort.reverseSort(arr);
//        System.out.println(Arrays.toString(arr));

        // 4. Shell sort
        ShellSort shellSort = new ShellSort();
        shellSort.sort(arr);
        System.out.println(Arrays.toString(arr) + "\nreserve sort\n");
        shellSort.reverseSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
