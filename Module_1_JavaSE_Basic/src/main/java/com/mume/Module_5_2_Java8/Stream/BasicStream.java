package com.mume.Module_5_2_Java8.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @projectName: NativeJava
 * @author: Lucas
 * @description: Stream Basic, listToStream, parallelStream
 * @date: 2024-03-14 22:03
 * @version: 1.0
 */
public class BasicStream {

    public static void listToStream() {
        List<String> list = Arrays.asList("a", "b", "c");
        // 创建一个顺序流
        Stream<String> stream = list.stream();
        // 创建一个并行流
        Stream<String> parallelStream = list.parallelStream();

    }

    public static void arrayToStream() {
        int[] array = {1,3,5,6,8};
        IntStream stream1 = Arrays.stream(array);

        Stream<Integer> stream3 = Stream.of(1, 2, 3, 4, 5, 6);
    }

    public static void streamCreate() {
        Stream<Integer> stream2 = Stream.iterate(0, (x) -> x + 3).limit(4);
        stream2.forEach(System.out::println);

        Stream<Double> streamRandom = Stream.generate(Math::random).limit(3);
        streamRandom.forEach(System.out::println);
    }

    public static void parallelStream() {
        List<Integer> list = Arrays.asList(54,2,4,5,3,23);
        Optional<Integer> findFirst = list.stream().parallel().filter(x->x>6).findFirst();
        findFirst.ifPresent(System.out::println);
    }
}
