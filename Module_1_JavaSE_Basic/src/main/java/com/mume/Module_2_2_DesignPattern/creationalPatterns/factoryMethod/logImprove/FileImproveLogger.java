package com.mume.Module_2_2_DesignPattern.creationalPatterns.factoryMethod.logImprove;

import com.mume.Module_2_2_DesignPattern.creationalPatterns.factoryMethod.log.Logger;

/**
 * @projectName: NativeJava
 * @author: Lucas
 * @description:
 * @date: 2024-12-26 00:07
 */
public class FileImproveLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("文件日志记录");
    }
}
