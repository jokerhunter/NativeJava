package com.mume.DesignPattern.ModelMethodPattern;

public class AbstractCalculatorTest {
    public static void main(String[] args) {
        AbstractCalculator calculator = new Plus();
        System.out.println(calculator.splitException("1+1", "\\+"));
    }
}
