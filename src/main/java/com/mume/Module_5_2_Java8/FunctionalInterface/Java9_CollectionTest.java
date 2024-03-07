package com.mume.Module_5_2_Java8.FunctionalInterface;

import java.util.List;
import java.util.Set;

public class Java9_CollectionTest {
    public static void main(String[] args) {
        // 创建list类型的不可变实例
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);
        // list.add(6); // 编译ok，运行发生UnsuppportedOperationException不支持此操作的异常
        System.out.println("list = " + list);

        Set<Integer> set = Set.of(6, 7, 8);
        // set.add(null); // UnsuppportedOperationException
    }
}
