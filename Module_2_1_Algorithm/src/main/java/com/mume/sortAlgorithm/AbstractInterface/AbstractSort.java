package com.mume.sortAlgorithm.AbstractInterface;

import java.util.Comparator;

public abstract class AbstractSort <T> implements Sort<T> {

    @Override
    public void sort(T [] arr) {
        sort(arr, new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                return ((Comparable)o1).compareTo(o2);
            }
        });
    }

    @Override
    public abstract void sort(T[] arr, Comparator<? super T> c);

    @Override
    public void reverseSort(T[] arr) {
        sort(arr, new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                return ((Comparable)o1).compareTo(o2) > 0 ? -1 : (((Comparable)o1).compareTo(o2) == 0 ? 0 : 1);
            }
        });
    }

    public void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
