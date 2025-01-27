package com.mume.Module_2_2_DesignPattern.creationalPatterns.factoryMethod.logImprove;

import com.mume.Module_2_2_DesignPattern.creationalPatterns.factoryMethod.log.DataBaseLogger;
import com.mume.Module_2_2_DesignPattern.creationalPatterns.factoryMethod.log.Logger;

/**
 * @projectName: NativeJava
 * @author: Lucas
 * @description:
 * @date: 2024-12-31 00:07
 */
public class DatabaseImproveLoggerFactory extends AbstractLoggerFactory {
    @Override
    public Logger createLogger() {
        return new DataBaseLogger();
    }
}
