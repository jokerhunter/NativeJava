package com.mume.Module_2_2_DesignPattern.creationalPatterns.builder.model;

/**
 * @projectName: NativeJava
 * @author: Lucas
 * @description:
 * @date: 2025-01-14 23:44
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getProduct();
    }
}
