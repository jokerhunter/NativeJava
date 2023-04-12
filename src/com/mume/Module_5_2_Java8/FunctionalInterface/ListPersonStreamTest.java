package com.mume.Module_5_2_Java8.FunctionalInterface;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Stream;

public class ListPersonStreamTest {
    public static void main(String[] args) {
        // 1.准备一个List集合并放入Person类型对象
        List<Person> list = new LinkedList<Person>();
        list.add(new Person("mume", 23));
        list.add(new Person("mume1", 13));
        list.add(new Person("mume2", 24));
        list.add(new Person("mume3", 11));
        Person[] persons = {
            new Person("mume", 23),
            new Person("mume1", 13),
            new Person("mume2", 24),
            new Person("mume3", 11)
        };
        // 2.将list集合中所有成年人过滤出来并放入另一个集合打印
        // 使用Stream流实现
        list.stream().filter( person -> person.getAge() >= 18).forEach(person -> System.out.println(person));
        // 方法引用优化
        // 1-通过集合方法获取流
//        list.stream().filter( person -> person.getAge() >= 18).forEach(System.out::println);
        // 2-通过数组工具类的静态方式获取流
//        Arrays.stream(persons).filter( person -> person.getAge() >= 18 ).forEach(System.out::println);
        // 3-Stream接口的静态方法获取流 of
//        Stream.of(persons).filter( person -> person.getAge() >= 18).forEach(System.out::println);
        // 4-Stream接口的静态方法获取流 generate
//        Stream.generate(() -> new Person("mume" + new Random().nextInt(10), new Random().nextInt(50)))
//                .limit(3).filter(person -> person.getAge() >= 18).forEach(System.out::println);

        // distinct(),limit(long maxSize),skip(long n)

        // 3.跳过前两个，获取后三个
//        Stream.generate(() -> new Person("mume" + new Random().nextInt(10), new Random().nextInt(50)))
//                .skip(2).limit(3).filter(person -> person.getAge() >= 18).forEach(System.out::println);
        // 4.使用map获取所有类的年龄
        list.stream().map(Person::getAge).forEach(System.out::println);
        // 5.
    }
}
