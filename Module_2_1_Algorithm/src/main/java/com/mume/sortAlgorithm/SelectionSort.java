package com.mume.sortAlgorithm;

import com.mume.sortAlgorithm.AbstractInterface.AbstractSort;

import java.util.Comparator;

/**
 * @author mume
 */
public class SelectionSort<T> extends AbstractSort<T> {
    @Override
    public void sort(T[] arr, Comparator<? super T> c) {
        int len = arr.length;
        int minIndex = 0;
        T temp;
        for (int i = 0; i < len; i++) {
            minIndex = i;
            for (int j = i + 1; j < len; j++) {
                if (c.compare(arr[j], arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

}
