package com.mume.Module_5_2_Java8.FunctionalInterface;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        // java8以前的处理方式
        String str = null;
        if (null != str) {
            System.out.println("字符串长度" + str.length());
        } else {
            System.out.println("字符串长度为0");
        }

        // Java8中使用Optional类
        // 1. 将数据str装到Optional对象代表的容器中
        Optional<String> optional = Optional.ofNullable(str);
        // 2. 建立映射关系 使用字符串的长度与字符串建立映射关系

        /*Optional<Integer> integer = optional.map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        });*/

        Optional<Integer> integer = optional.map(String::length);
        // 3. 若字符串为空则打印0，否则打印字符串的数值
        System.out.println("integer = " + integer);
        System.out.println(integer.orElse(0));

    }
}
