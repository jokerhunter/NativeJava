package com.mume.DesignPattern.ModelMethodPattern;

public class Minus extends AbstractCalculator{

    @Override
    public int calculate(int ia, int ib) {
        return ia - ib;
    }
}
