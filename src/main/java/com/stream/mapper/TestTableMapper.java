package com.stream.mapper;

import com.stream.mapper.base.TestTableBaseMapper;
import com.stream.model.TestTableInfo;

/**
*  @author Jun Mowen
*/
public interface TestTableMapper extends TestTableBaseMapper {
    TestTableInfo selectTestTableInfoById(int id);
}