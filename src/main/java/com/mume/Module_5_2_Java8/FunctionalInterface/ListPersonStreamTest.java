package com.mume.Module_5_2_Java8.FunctionalInterface;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
        // 5. 实现集合中的所有元素的自然排序并打印
        list.stream().sorted().forEach(System.out::println);

        // 6. 判断集合中是否没有元素的年龄是大于45岁的
        // noneMatch(), allMatch()
        boolean b1 = list.stream().noneMatch(person -> {
            return person.getAge() > 45;
        });
        System.out.println("none > 45:" + b1);

        // 7. 按照指定比较器规则获取集合最大值
        // max(), min()
        Optional<Person> max = list.stream().max((o1, o2) -> o1.getAge() - o2.getAge());
        System.out.println("按照年龄排序后的最大值" + max);

        // 8. 实现将集合中所有元素的年龄映射出来并进行累加打印
//        Optional<Integer> totalAge = list.stream().map(Person::getAge).reduce((a1, a2) -> a1 + a2);
        Optional<Integer> totalAge = list.stream().map(Person::getAge).reduce(Integer::sum);
        System.out.println("所有年龄累加：" + totalAge);

        // 9.实现将集合中所有元素的姓名映射出来并收集到集合中打印
        list.stream().map(Person::getName).collect(Collectors.toList()).forEach(System.out::println);

    }
}
