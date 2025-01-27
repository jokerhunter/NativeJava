package com.mume.zuoAlgorithm.simple;

import java.util.Formatter;

/**
 * @projectName: NativeJava
 * @author: Lucas
 * @description:
 * @date: 2024-06-08 22:26
 */
public class SimpleSolution {
    void display() {
        System.out.println(data);
    }
    int data;
    public static void main(String[] args) {
        String a = "A";
        String b = "B";
        StringBuilder bu = new StringBuilder("C");
        Formatter fmt = new Formatter(bu);
        fmt.format("%s%s", a, b);
        System.out.println(fmt);
        fmt.format("%-2s",b);
        System.out.println(fmt);
        fmt.format("%b", null);
        System.out.println(fmt);
        System.out.println("B".toCharArray()[0] == 66);
    }
        static public String d = "aa";
}
