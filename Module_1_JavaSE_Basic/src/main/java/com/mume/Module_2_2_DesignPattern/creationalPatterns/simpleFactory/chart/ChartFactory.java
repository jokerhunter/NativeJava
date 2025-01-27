package com.mume.Module_2_2_DesignPattern.creationalPatterns.simpleFactory.chart;

/**
 * @projectName: NativeJava
 * @author: Lucas
 * @description:
 * @date: 2024-11-27 23:43
 */
public class ChartFactory {
    public static Chart getChart(String type) {
        Chart chart = null;
        if (type.equalsIgnoreCase("histogram")) {
            chart = new HistogramChart();
            System.out.println("initialize histogram chart");
        } else if (type.equalsIgnoreCase("pie")) {
            chart = new PieChart();
            System.out.println("initialize pie chart");
        }
        return chart;
    }
}
