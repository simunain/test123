package com.course.server.service.impl;

import com.course.server.domain.Test;
import com.course.server.domain.TestDemoDto;
import com.course.server.domain.TestExample;
import com.course.server.mapper.TestDemoMapper;
import com.course.server.mapper.TestMapper;
import com.course.server.service.TestDemoService;
import org.apache.ibatis.javassist.runtime.Desc;
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
        //相当于select id, `name`FROM test WHERE ( id = '1' );
        return testMapper.selectByExample(testExample);
    }

    //使用example添加数据,只能是生成的实体类才可以用,因为设置的类型就是生成的实体类
    public List<Test>  queryExampletwoservice() {
        System.out.println("asd");
        Test test=new Test();
        test.setId("123"); test.setName("test实体内容");
        testMapper.insert(test);
        Test testt=new Test();
        testt.setId("123456"); testt.setName("test实体内容");
        testMapper.insert(testt);
        //更新
        Test testtt=new Test();
        testtt.setId("123456"); testtt.setName("ttttt");
        testMapper.updateByPrimaryKey(testtt);

        List<TestDemoDto> k=testDemoMapper.querymapper();
        TestExample  testExample= new TestExample();
        testExample.setOrderByClause("DESC");
       // criteria.andXxxEqualTo(value)    添加xxx字段等于value条件
        testExample.createCriteria().andIdEqualTo("1");
        return testMapper.selectByExample(testExample);
    }

}























