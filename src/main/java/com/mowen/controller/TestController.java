package com.mowen.controller;

import com.mowen.bean.TestBean;
import com.mowen.bean.TestTable;
import com.mowen.model.TestTableInfo;
import com.mowen.service.TestTableService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private TestTableService testTableService;

    @ResponseBody
    @RequestMapping(value = "/test", method= RequestMethod.POST)
    public TestTable test(@RequestBody TestBean test){
        log.info("TestController start!");
        System.out.println("id: " + test.getId());
        TestTableInfo testTableinfo = testTableService.selectTestTableInfoById(test.getId());
        TestTable testTable = new TestTable();
        testTable.setId(testTableinfo.getId());
        testTable.setName(testTableinfo.getName());
        testTable.setCreatedTime(testTableinfo.getCreatedTime());
        testTable.setUpdatedTime(testTableinfo.getUpdatedTime());
        testTable.setTestMessage(testTableinfo.getTestMessage());
        log.info("TestController end!");
        return testTable;
    }

    @ResponseBody
    @RequestMapping(value = "/test1", method= RequestMethod.GET)
    public TestTable test1(@RequestParam int id){
        log.info("Test1Controller start!");
        System.out.println("id: " + id);
        TestTableInfo testTableinfo = testTableService.selectTestTableInfoById(id);
        TestTable testTable = new TestTable();
        testTable.setId(testTableinfo.getId());
        testTable.setName(testTableinfo.getName());
        testTable.setCreatedTime(testTableinfo.getCreatedTime());
        testTable.setUpdatedTime(testTableinfo.getUpdatedTime());
        testTable.setTestMessage(testTableinfo.getTestMessage());
        log.info("Test1Controller end!");
        return testTable;
    }
}
