package com.mowen.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TestController
 *
 * @author Jun Mowen
 * @date 2018/11/4
 */
@RestController
public class TestController {
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }
}
