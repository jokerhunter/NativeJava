package com.mume.Module_5_2_Java8.FunctionalInterface;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) throws Throwable {
        Person nulPerson = null;
        Person emptyPerson = new Person();
        Person person = new Person("aa", 13);

        System.out.println(getLength(null));
        System.out.println(getLength("null"));

        printPersonIfPresent(nulPerson);
        printPersonIfPresent(person);

        System.out.println(initPersonIfNull(nulPerson));
        System.out.println(initPersonIfNull(person));

        testOptional(nulPerson, emptyPerson, person);

    }

    private static void testOptional(Person nulPerson, Person emptyPerson, Person person) throws Throwable {
        // of: if null throws NullPointerException
        Optional nulOption = Optional.ofNullable(nulPerson);
        Optional optional = Optional.ofNullable(emptyPerson);
        boolean flag = optional.isEmpty();
        flag = optional.isPresent();
        // ifPresent: Consumer
        optional.ifPresent(System.out::println);
        // ifPresentOrElse: Consumer and orElse Thread
        nulOption.ifPresentOrElse(System.out::println, () -> System.out.println("ifPresentOrElse:Null"));
//        orElse: return T
//        or: Supplier, return Optional
//        orElseGet: Supplier, return T
//        System.out.println(nulOption.orElse("orElse:Empty"));
//        System.out.println(nulOption.or(Person::new));
//        nulOption.orElseGet(() -> "orElseGet:Empty");
//        nulOption.orElseThrow(() -> new NullPointerException("aa"));
        System.out.println(optional.map(p -> {
            p = new Person("Empty", 220);
            return p;
        }).orElse("Map orElse:Empty"));
    }

    private static int getLength(String str) {
        int len;

        // Java8中使用Optional类
        // 1. 将数据str装到Optional对象代表的容器中
        Optional<String> optional = Optional.ofNullable(str);
        // 2. 建立映射关系 使用字符串的长度与字符串建立映射关系
//        len = optional.map(new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
//                return s.length();
//            }
//        }).orElse(-1);

        // 简写
        len = optional.map(String::length).orElse(-1);
        return len;
    }

    /**
     * ifPresentOrElse 和 ifPresent 使用Consumer只执行方法不返回值
     * @param person Person对象
     */
    private static void printPersonIfPresent(Person person) {
        Optional.ofNullable(person).ifPresentOrElse(System.out::println, () -> System.out.println("Empty"));
    }

    private static Person initPersonIfNull(Person person) {
        Person res;
//        res = Optional.ofNullable(person).orElse(new Person());
        res = Optional.ofNullable(person).orElseGet(Person::new);
        return res;
    }

}
