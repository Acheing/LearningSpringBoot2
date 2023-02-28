package com.example.day2.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogDemo {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Bean
    public String logMethod(){
        logger.trace("LogDemo trace 日志...");
        logger.debug("LogDemo debug 日志...");
        logger.info("LogDemo info 日志...");
        logger.warn("LogDemo warn 日志...");
        logger.error("LogDemo error 日志...");
        return "hello log";
    }
}
