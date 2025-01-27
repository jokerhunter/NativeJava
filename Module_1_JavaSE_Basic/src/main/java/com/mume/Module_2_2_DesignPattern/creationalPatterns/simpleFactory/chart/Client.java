package com.mume.Module_2_2_DesignPattern.creationalPatterns.simpleFactory.chart;

/**
 * @projectName: NativeJava
 * @author: Lucas
 * @description:
 * @date: 2024-11-30 18:28
 */
public class Client {
    public static void main(String[] args) {
        Chart chart;
        chart = ChartFactory.getChart("histogram");
        chart.display();
    }
}
