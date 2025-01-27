package com.mume.Module_2_2_DesignPattern.creationalPatterns.simpleFactory.chart;

/**
 * @projectName: NativeJava
 * @author: Lucas
 * @description:
 * @date: 2024-11-27 23:51
 */
public class PieChart implements Chart {
    public PieChart() {
        System.out.println("create pieChart");
    }

    @Override
    public void display() {
        System.out.println("display pie chart");
    }
}
