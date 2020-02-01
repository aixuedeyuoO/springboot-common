package com.stream.controller;

import com.stream.bean.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * ViewController
 *
 * @author aixuedeyuoO
 * @date 2020/1/25
 */
@Slf4j
@RestController
public class ViewController {
    @ResponseBody
    @RequestMapping(value = "/search", method= RequestMethod.GET)
    public Person search(String personName){

        return new Person(personName, 32, "hefei");

    }
}
