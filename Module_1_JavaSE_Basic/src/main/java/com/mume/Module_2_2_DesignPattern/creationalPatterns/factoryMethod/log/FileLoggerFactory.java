package com.mume.Module_2_2_DesignPattern.creationalPatterns.factoryMethod.log;

/**
 * @projectName: NativeJava
 * @author: Lucas
 * @description:
 * @date: 2024-12-31 00:11
 */
public class FileLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        return new FileLogger();
    }
}
