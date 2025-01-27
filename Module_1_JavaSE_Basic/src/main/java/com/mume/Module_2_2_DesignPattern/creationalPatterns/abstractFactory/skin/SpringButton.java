package com.mume.Module_2_2_DesignPattern.creationalPatterns.abstractFactory.skin;

/**
 * @projectName: NativeJava
 * @author: Lucas
 * @description:
 * @date: 2025-01-13 23:55
 */
public class SpringButton implements Button {
    @Override
    public void display() {
        System.out.println("spring button");
    }
}
