package com.mume.Module_2_2_DesignPattern.creationalPatterns.simpleFactory.xmlChart;

import com.mume.Module_2_2_DesignPattern.creationalPatterns.simpleFactory.chart.Chart;
import com.mume.Module_2_2_DesignPattern.creationalPatterns.simpleFactory.chart.ChartFactory;

/**
 * @projectName: NativeJava
 * @author: Lucas
 * @description:
 * @date: 2024-12-10 00:07
 */
public class Client {
    public static void main(String[] args) {
        Chart chart;
        String type = XMLUtilChart.getChartType();
        assert type != null;
        chart = ChartFactory.getChart(type);
        chart.display();
    }
}
