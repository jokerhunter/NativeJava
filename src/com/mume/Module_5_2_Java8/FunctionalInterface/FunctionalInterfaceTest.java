package com.mume.Module_5_2_Java8.FunctionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceTest {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {

            }
        };

        Comparable comparable = new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };

        // java.util.Function
        Consumer comsumer = new Consumer<>(){
            @Override
            public void accept(Object o) {

            }
        };

        Supplier supplier = new Supplier() {
            @Override
            public Object get() {
                return null;
            }
        };

        Function function = new Function() {
            @Override
            public Object apply(Object o) {
                return null;
            }
        };

        Predicate predicate = new Predicate() {
            @Override
            public boolean test(Object o) {
                return false;
            }
        };
    }
}
