package com.mume.Module_2_1_Algorithm.SortAlgorithm;

import com.mume.Module_2_1_Algorithm.SortAlgorithm.AbstractInterface.AbstractSort;

import java.util.Comparator;

/**
 * @author mume
 */
public class InsertionSort <T> extends AbstractSort<T> {

    @Override
    public void sort(T[] arr, Comparator<? super T> c) {
        shiftInsertionSort(arr, c);
    }

    /**
     * 移位式插入排序
     * @param arr
     * @param c
     */
    private void shiftInsertionSort(T[] arr, Comparator<? super T> c) {
        T insertValue;
        int len = arr.length, position;
        for (int i = 1; i < len; i++) {
            insertValue = arr[i];
            position = i;
            while ( position > 0 && c.compare(arr[position-1], insertValue) > 0) {
                arr[position] = arr[position-1];
                position--;
            }
            arr[position] = insertValue;
        }
    }

    /**
     * 交换式插入排序
     * @param arr
     * @param c
     */
    private void swapInsertionSort(T[] arr, Comparator<? super T> c) {
        T temp;
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (c.compare(arr[j], arr[j + 1]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}
