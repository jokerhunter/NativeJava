package com.mume.Module_5_2_Java8.Stream;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * @projectName: NativeJava
 * @author: Lucas
 * @description: TODO
 * @date: 2024-03-17 12:27
 * @version: 1.0
 */
public class ListStreamOperator {

    public static String getMaxLengthString(List<String> list) {
        Optional<String> max = list.stream().max(Comparator.comparing(String::length));
        return max.orElse("");
    }

}
