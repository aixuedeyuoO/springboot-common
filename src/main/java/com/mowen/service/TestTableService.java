package com.mowen.service;

import com.mowen.mapper.TestTableMapper;
import com.mowen.model.TestTableInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
*
*  @author Jun Mowen
*/
@Service
public class TestTableService {
    @Resource
    TestTableMapper testTableMapper;

    public TestTableInfo selectTestTableInfoById(int id){
        return testTableMapper.selectTestTableInfoById(id);
    }
}
