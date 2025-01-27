package com.mume.sortAlgorithm;

import com.mume.sortAlgorithm.AbstractInterface.AbstractSort;

import java.util.Comparator;

public class QuickSort<T> extends AbstractSort<T> {

    @Override
    public void sort(T[] arr, Comparator<? super T> c) {
        recursionQuickSort(arr, c);
    }

    private void loopSort(T[] arr, Comparator<? super T> c) {

    }

    private void recursionQuickSort(T[] arr, Comparator<? super T> c) {
        recursionQuickSort(arr, 0, arr.length, c);
    }

    private void recursionQuickSort(T[] arr, int left, int right, Comparator<? super T> c) {

    }

}
