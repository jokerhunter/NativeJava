package com.mume.sortAlgorithm;

import com.mume.sortAlgorithm.AbstractInterface.AbstractSort;

import java.util.Comparator;

public class ShellSort <T> extends AbstractSort<T> {

    @Override
    public void sort(T[] arr, Comparator<? super T> c) {
        shiftShellSort(arr, c);
    }

    /**
     * 希尔排序增量不同对应的复杂度也会变化
     * https://blog.csdn.net/weixin_34141225/article/details/113371669
     * Hibbard
     * @param arr
     * @param c
     */
    private void HibbardShellSort(T[] arr, Comparator<? super T> c) {
        int len = arr.length;
        for (int i = 0; i > 0; i = i << 1) {

        }
    }

    /**
     * 移位希尔排序
     * @param arr
     * @param c
     */
    private void shiftShellSort(T[] arr, Comparator<? super T> c) {
        int len = arr.length, position;
        T insertValue;
        for (int step = len >> 1; step > 0; step >>= 1) {
            /**
             * 调整position位置，此方法位置为所要插入的数据
             */
            for (int i = step; i < len; i++) {
                insertValue = arr[i];
                position = i;
                // 如果符合顺序，不用排序
                if (c.compare(arr[position - step], arr[position]) > 0) {
                    while (position >= step && c.compare(arr[position - step], insertValue) > 0) {
//                    while (position > 0 && c.compare(arr[position - step], insertValue) > 0) {
                        arr[position] = arr[position - step];
                        position -= step;
                    }
                    arr[position] = insertValue;
                }
            }
            /**
             * 调整position位置，此方法位置为所要插入数据的前一个数据
             */
//            for (int i = step; i < len; i++) {
//                insertValue = arr[i];
//                position = i - step;
//                while (position >= 0 && c.compare(arr[position], insertValue) > 0) {
//                    arr[position + step] = arr[position];
//                    position -= step;
//                }
//                arr[position + step] = insertValue;
//            }
        }
    }

    /**
     * 交换式希尔排序（效率没有移位高），一般不用
     * 希尔排序
     * @param arr
     * @param c
     */
    private void swapShellSort(T[] arr, Comparator<? super T> c) {
        int len = arr.length;
        T temp;
        for (int step = len >> 1; step > 0; step >>= 1) {
            for (int i = step; i < len; i++) {
                for (int j = i - step; j >= 0; j -= step) {
                    if (c.compare(arr[j], arr[j + step]) > 0) {
                        temp = arr[j];
                        arr[j] = arr[j + step];
                        arr[j + step] = temp;
                    } else {
                        break;
                    }
                }
            }
        }
    }
}
