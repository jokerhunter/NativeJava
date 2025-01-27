package com.mume.sortAlgorithm.AbstractInterface;

import java.util.Comparator;

/**
 * @author mume
 */
public interface Sort <T> {
    void sort(T[] arr);
    void sort(T[] arr, Comparator<? super T> c);
    void reverseSort(T[] arr);
}
