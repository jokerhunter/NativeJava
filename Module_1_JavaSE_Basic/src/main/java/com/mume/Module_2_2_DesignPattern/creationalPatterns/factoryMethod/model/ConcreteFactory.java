package com.mume.Module_2_2_DesignPattern.creationalPatterns.factoryMethod.model;

/**
 * @projectName: NativeJava
 * @author: Lucas
 * @description:
 * @date: 2024-12-10 00:25
 */
public class ConcreteFactory implements Factory {
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct();
    }
}
