package com.mume.Module_2_2_DesignPattern.creationalPatterns.factoryMethod.log;

/**
 * @projectName: NativeJava
 * @author: Lucas
 * @description:
 * @date: 2024-12-31 00:07
 */
public class DatabaseLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        return new DataBaseLogger();
    }
}
