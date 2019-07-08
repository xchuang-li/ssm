package com.cay.ssm.common;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

public class GreetingImpl implements Greeting{
    Logger logger= LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

    @Override
    public void sayHello() {
        logger.info("hello world!");
    }
}
