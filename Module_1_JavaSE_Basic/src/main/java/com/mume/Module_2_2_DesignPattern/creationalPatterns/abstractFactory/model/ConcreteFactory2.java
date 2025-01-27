package com.mume.Module_2_2_DesignPattern.creationalPatterns.abstractFactory.model;

/**
 * @projectName: NativeJava
 * @author: Lucas
 * @description:
 * @date: 2025-01-13 23:33
 */
public class ConcreteFactory2 implements AbstractFactory {

    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return null;
    }
}
