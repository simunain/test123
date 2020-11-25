package com.course.server.mapper;

import com.course.server.domain.test;
import com.course.server.domain.testExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface testMapper {
    long countByExample(testExample example);

    int deleteByExample(testExample example);

    int deleteByPrimaryKey(String id);

    int insert(test record);

    int insertSelective(test record);

    List<test> selectByExample(testExample example);

    test selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") test record, @Param("example") testExample example);

    int updateByExample(@Param("record") test record, @Param("example") testExample example);

    int updateByPrimaryKeySelective(test record);

    int updateByPrimaryKey(test record);
}