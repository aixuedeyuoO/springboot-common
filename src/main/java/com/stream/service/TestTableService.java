package com.stream.service;

import com.stream.mapper.TestTableMapper;
import com.stream.model.TestTableInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
*
*  @author aixuedeyuoO
*/
@Service
public class TestTableService {
    @Resource
    TestTableMapper testTableMapper;

    public TestTableInfo selectTestTableInfoById(int id){
        return testTableMapper.selectTestTableInfoById(id);
    }
}
