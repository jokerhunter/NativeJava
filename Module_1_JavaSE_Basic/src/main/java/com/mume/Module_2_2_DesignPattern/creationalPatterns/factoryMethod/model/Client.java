package com.mume.Module_2_2_DesignPattern.creationalPatterns.factoryMethod.model;

/**
 * @projectName: NativeJava
 * @author: Lucas
 * @description:
 * @date: 2024-12-24 23:45
 */
public class Client {
    public static void main(String[] args) {
        Factory factory = new ConcreteFactory();
        Product product = factory.factoryMethod();
    }
}
