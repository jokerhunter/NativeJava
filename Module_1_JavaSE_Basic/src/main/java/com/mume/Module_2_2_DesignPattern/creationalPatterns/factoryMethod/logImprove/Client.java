package com.mume.Module_2_2_DesignPattern.creationalPatterns.factoryMethod.logImprove;

import com.mume.Module_2_2_DesignPattern.creationalPatterns.factoryMethod.log.LogXmlUtil;
import com.mume.Module_2_2_DesignPattern.creationalPatterns.factoryMethod.log.Logger;
import com.mume.Module_2_2_DesignPattern.creationalPatterns.factoryMethod.log.LoggerFactory;

/**
 * @projectName: NativeJava
 * @author: Lucas
 * @description:
 * @date: 2025-01-08 23:59
 */
public class Client {
    public static void main(String[] args) {
        LoggerFactory loggerFactory;
        Logger logger;
        loggerFactory = (LoggerFactory) LogXmlUtil.getBean("Module_1_JavaSE_Basic/src/main/resources/designPatterns/factoryMethod/log_improve_config.xml");
        logger = loggerFactory.createLogger();
        logger.writeLog();
    }
}
