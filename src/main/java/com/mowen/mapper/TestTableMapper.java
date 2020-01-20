package com.mowen.mapper;

import com.mowen.mapper.base.TestTableBaseMapper;
import com.mowen.model.TestTableInfo;

/**
*  @author Jun Mowen
*/
public interface TestTableMapper extends TestTableBaseMapper {
    TestTableInfo selectTestTableInfoById(int id);
}