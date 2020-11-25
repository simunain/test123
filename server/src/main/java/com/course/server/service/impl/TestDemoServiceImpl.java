package com.course.server.service.impl;

import com.course.server.domain.Test;
import com.course.server.domain.TestDemoDto;
import com.course.server.domain.TestExample;
import com.course.server.mapper.TestDemoMapper;
import com.course.server.mapper.TestMapper;
import com.course.server.service.TestDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestDemoServiceImpl  implements TestDemoService {

    @Autowired
    private TestDemoMapper testDemoMapper;
    @Autowired
    private TestMapper testMapper;
    @Override
    public List<TestDemoDto>  queryservice() {
        System.out.println("asd");
        List<TestDemoDto> k=testDemoMapper.querymapper();

      return k;
    }
    //初次使用example
    public List<Test>  queryExampleservice() {
        System.out.println("asd");
        List<TestDemoDto> k=testDemoMapper.querymapper();
        TestExample  testExample= new TestExample();
        testExample.createCriteria().andIdEqualTo("1");
        return testMapper.selectByExample(testExample);
    }
}























