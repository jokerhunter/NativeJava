package com.mume.Module_2_2_DesignPattern.creationalPatterns.builder.model;

/**
 * @projectName: NativeJava
 * @author: Lucas
 * @description:
 * @date: 2025-01-14 23:48
 */
public class Client {
    public static void main(String[] args) {
        Product product = new Director(new ConcreteBuilder1()).construct();
    }
}
