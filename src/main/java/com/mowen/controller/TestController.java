package com.mowen.controller;

import com.mowen.bean.TestBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * TestController
 *
 * @author Jun Mowen
 * @date 2018/11/4
 */
@Slf4j
@RestController
public class TestController {
    @ResponseBody
    @RequestMapping(value = "/test", method= RequestMethod.POST)
    public TestBean test(@RequestBody TestBean test){
        log.info("TestController start!");
        System.out.println("name: " + test.getName());
        return test;
    }

    @ResponseBody
    @RequestMapping(value = "/test", method= RequestMethod.GET)
    public TestBean test1(@RequestParam String name){
        log.info("Test1Controller start!");
        System.out.println("name: " + name);
        TestBean tb = new TestBean();
        tb.setName(name);
        return tb;
    }
}
