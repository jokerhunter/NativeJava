package com.mume.Module_2_2_DesignPattern.creationalPatterns.simpleFactory.chart;

/**
 * @projectName: NativeJava
 * @author: Lucas
 * @description:
 * @date: 2024-11-27 23:47
 */
public class HistogramChart implements Chart {
    public HistogramChart() {
        System.out.println("create histogram");
    }

    @Override
    public void display() {
        System.out.println("display histogram");
    }
}
