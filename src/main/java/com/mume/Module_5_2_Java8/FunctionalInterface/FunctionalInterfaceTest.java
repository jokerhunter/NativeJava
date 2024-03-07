package com.mume.Module_5_2_Java8.FunctionalInterface;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceTest {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable run");
            }
        };
        Runnable run = () -> System.out.println("Runnable run");

        // 自然排序
        Comparable comparable = new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };

        // 定制排序
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };

        // java.util.Function
//        Consumer comsumer = new Consumer<>(){
//            @Override
//            public void accept(Object o) {
//                System.out.println("有参数无返回值的方法");
//            }
//        };

        Consumer con = (o) -> {
            System.out.println(o + "有参数无返回值的构造方法");
        };

        con.accept("tips:");

        Supplier supplier = new Supplier() {
            @Override
            public Object get() {
                return "无参有返回值的构造方法";
            }
        };
        System.out.println(supplier.get());

        Function function = new Function() {
            @Override
            public Object apply(Object o) {
                return o + "有参数有返回值的构造方法";
            }
        };
        System.out.println(function.apply("tips:"));

        Predicate predicate = new Predicate() {
            @Override
            public boolean test(Object o) {
                return true;
            }
        };
        System.out.println(predicate.test("tips"));

        Predicate predicate1 = o -> false;
        System.out.println(predicate1.test("tips"));
    }
}
