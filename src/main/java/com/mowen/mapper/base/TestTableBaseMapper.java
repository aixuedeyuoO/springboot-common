package com.mowen.mapper.base;

import java.util.List;
import com.mowen.model.TestTableInfo;
/**
*  @author Jun Mowen
*/
public interface TestTableBaseMapper {

    int insertTestTableInfo(TestTableInfo object);

    int updateTestTableInfo(TestTableInfo object);

    int update(TestTableInfo.UpdateBuilder object);

    List<TestTableInfo> queryTestTableInfo(TestTableInfo object);

    TestTableInfo queryTestTableInfoLimit1(TestTableInfo object);

}