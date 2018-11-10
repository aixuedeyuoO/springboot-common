package com.mowen.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TestController
 *
 * @author Jun Mowen
 * @date 2018/11/4
 */
@Slf4j
@RestController
public class TestController {
    @RequestMapping("/hello")
    public String hello(){
        log.info("test hello world!");
        return "Hello World";
    }
}
