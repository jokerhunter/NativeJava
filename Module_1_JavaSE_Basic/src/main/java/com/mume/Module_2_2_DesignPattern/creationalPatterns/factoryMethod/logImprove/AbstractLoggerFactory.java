package com.mume.Module_2_2_DesignPattern.creationalPatterns.factoryMethod.logImprove;

import com.mume.Module_2_2_DesignPattern.creationalPatterns.factoryMethod.log.Logger;
import com.mume.Module_2_2_DesignPattern.creationalPatterns.factoryMethod.log.LoggerFactory;

/**
 * @projectName: NativeJava
 * @author: Lucas
 * @description:
 * @date: 2025-01-08 23:53
 */
public abstract class AbstractLoggerFactory implements LoggerFactory {
    public void writeLog() {
        Logger logger = this.createLogger();
        logger.writeLog();
    }
}
