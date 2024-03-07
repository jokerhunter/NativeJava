package com.mume.Module_5_2_Java8.FunctionalInterface;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceTest {
    public static void main(String[] args) {
        // 1.匿名内部类的方式
        Person person = new Person("mume", 15);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                person.show();
            }
        };

        // 2.使用lambda表达式的方式实现Person类中的show方法
        Runnable runnable1 = () -> person.show();

        // 3.使用方法引用的方式实现Person类show方法调用
        Runnable runnable2 = person::show;

        // tips: lambda表达式最后调用的方法的返回值最好和接口方法一致,这样使用方法引用更方便1

        // 4.使用匿名内部类/lambda/方法引用的方式通过函数式接口Consumer中的方法实现Person类中的setName方法调用
        Consumer consumer = new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println("Object" + o);
            }
        };
        consumer.accept("mume");
        System.out.println("Person:" + person);

        Consumer<String> consumer1 = s -> person.setName(s);
        consumer1.accept("hello");
        System.out.println("Person:" + person);

        Consumer<String> consumer2 = person::setName;
        consumer2.accept("mumeHello");
        System.out.println("Person:" + person);

        // 5.使用匿名内部类/lambda/方法引用的方式通过函数式接口Supplier中的方法实现Person类中的getName方法调用
        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return person.getName();
            }
        };

        Supplier<String> supplier1 = person::getName;
        String name = supplier1.get();
        System.out.println("Person name:" + name);

        // 6.使用匿名内部类/lambda/方法引用的方式通过调用函数式接口Function中的方法实现String转Integer
        Function<String, Integer> function = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        };
        System.out.println(function.apply("1234"));

        Function<String, Integer> function1 = s -> Integer.parseInt(s);
        System.out.println(function1.apply("12345"));

        Function<String, Integer> function2 = Integer::parseInt;
        System.out.println(function2.apply("123456"));

        // 7. 使用匿名内部类/lambda/方法引用的方式通过调用函数式接口Comparator中的方法实现Integer比较
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println(comparator.compare(1,2));

        Comparator<Integer> comparator1 = Integer::compare;
        System.out.println(comparator1.compare(1,2));

        // 8. 使用匿名内部类/方法引用的方式通过类名来调用非静态方法
        // 一个参数对象作为调用对象来调用方法时，可以使用上述方法
        Comparator<Integer> comparator2 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println(comparator2.compare(1,2));

        Comparator<Integer> comparator3 = Integer::compareTo;
        System.out.println(comparator3.compare(1,2));

        // 9. 使用匿名内部类的方式通过Supplier函数式接口创建Person类型并返回
        Supplier<Person> supplier2 = new Supplier<Person>() {
            @Override
            public Person get() {
                return new Person("mume", 19);
            }
        };
        System.out.println(supplier2.get());

        Supplier<Person> supplier3 = Person::new;
        System.out.println(supplier3.get());

        // 10. 使用匿名内部类/方法引用的方式通过BiFunction函数式接口创建Person类型并返回
        BiFunction<String, Integer, Person> biFunction = new BiFunction<String, Integer, Person>() {
            @Override
            public Person apply(String s, Integer integer) {
                return new Person(s, integer);
            }
        };
        System.out.println("Person:" + biFunction.apply("mume", 23));

        BiFunction<String, Integer, Person> biFunction1 = Person::new;
        System.out.println("Person:" + biFunction1.apply("mume", 23));

        // 11. 使用匿名内部类/方法引用的方式通过Function函数式接口创建Person类型并返回
        Function<Integer, Person[]> function3 = new Function<Integer, Person[]>() {
            @Override
            public Person[] apply(Integer integer) {
                return new Person[integer];
            }
        };
        Person[] pArr = function3.apply(3);
        System.out.println(Arrays.toString(pArr));

        Function<Integer, Person[]> function4 = Person[]::new;
        System.out.println(Arrays.toString(function4.apply(3)));
    }
}
