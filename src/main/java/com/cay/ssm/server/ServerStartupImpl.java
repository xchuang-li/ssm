package com.cay.ssm.server;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class ServerStartupImpl implements IServerStartup{
    Logger logger= LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

    @PostConstruct
    public void bulid() {
        logger.info("初始化服务端！！！");
    }
}
