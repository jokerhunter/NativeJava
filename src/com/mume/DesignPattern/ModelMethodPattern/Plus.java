package com.mume.DesignPattern.ModelMethodPattern;

public class Plus extends AbstractCalculator {

    @Override
    public int calculate(int ia, int ib) {
        return ia + ib;
    }
}
