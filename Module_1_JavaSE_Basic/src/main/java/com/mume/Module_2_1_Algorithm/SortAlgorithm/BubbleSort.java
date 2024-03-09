package com.mume.Module_2_1_Algorithm.SortAlgorithm;

import com.mume.Module_2_1_Algorithm.SortAlgorithm.AbstractInterface.AbstractSort;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author mume
 */

public class BubbleSort <T> extends AbstractSort<T> {
    @Override
    public void sort(T[] arr, Comparator<? super T> c) {
        int len = arr.length;
        T temp;
        for (int i = 0; i < len; i++) {
            boolean stableFlag = true;
            for (int j = 0; j < len - i - 1; j++) {
                if (c.compare(arr[j], arr [j + 1]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    stableFlag = false;
                }
            }
            System.out.println(Arrays.toString(arr));
            if (stableFlag) {
                System.out.println("stable" + i);
                break;
            }
        }
    }

}
