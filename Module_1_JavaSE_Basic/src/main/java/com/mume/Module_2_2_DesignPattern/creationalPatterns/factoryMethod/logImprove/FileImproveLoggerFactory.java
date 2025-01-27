package com.mume.Module_2_2_DesignPattern.creationalPatterns.factoryMethod.logImprove;

import com.mume.Module_2_2_DesignPattern.creationalPatterns.factoryMethod.log.Logger;

/**
 * @projectName: NativeJava
 * @author: Lucas
 * @description:
 * @date: 2024-12-31 00:11
 */
public class FileImproveLoggerFactory extends AbstractLoggerFactory {
    @Override
    public Logger createLogger() {
        return new FileImproveLogger();
    }
}
