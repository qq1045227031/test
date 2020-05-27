package com.wu.sell.service;

import lombok.extern.slf4j.Slf4j;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class LoggerTest {
    private final Logger logger = LoggerFactory.getLogger(LoggerTest.class);//会打印出这个类名
    @Test
    public void test1(){
        String name = "123";
        String password = "123";
        logger.debug("debug");
        logger.info("info");
        logger.info("name:{},password:{}",name,password);
        logger.error("error");

    }
}
