package com.mume.Module_5_2_Java8.FunctionalInterface;

import java.util.Optional;

public class Java11_StringTest {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(s.isBlank());

        Optional<String> optional = Optional.ofNullable(s);
        System.out.println(optional.map(String::length));
    }
}
