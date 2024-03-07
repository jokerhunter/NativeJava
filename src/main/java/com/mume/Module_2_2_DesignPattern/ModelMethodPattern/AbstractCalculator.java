package com.mume.Module_2_2_DesignPattern.ModelMethodPattern;

/**
 * @author mume
 */
public abstract class AbstractCalculator {

    public int splitException(String exp, String op) {
        String[] sArr = exp.split(op);
        return calculate(Integer.parseInt(sArr[0]), Integer.parseInt(sArr[1]));
    }

    public abstract int calculate(int ia, int ib);
}
