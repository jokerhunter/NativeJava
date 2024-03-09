package com.mume.Module_5_2_Java8.FunctionalInterface;

import java.util.LinkedList;

public class Java10_VarTest {
    public static void main(String[] args) {
        var i = 10;

        var list = new LinkedList<Integer>();
        list.add(i);

        for (var ele : list) {
            System.out.println(ele);
        }
    }
}
