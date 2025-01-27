package com.mume.Module_2_2_DesignPattern.creationalPatterns.factoryMethod.logImprove;

import com.mume.Module_2_2_DesignPattern.creationalPatterns.factoryMethod.log.Logger;

/**
 * @projectName: NativeJava
 * @author: Lucas
 * @description:
 * @date: 2024-12-26 00:03
 */
public class DataBaseImproveLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("数据库日志记录");
    }
}
