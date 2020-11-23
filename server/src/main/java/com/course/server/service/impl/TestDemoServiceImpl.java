package com.course.server.service.impl;

import com.course.server.domain.TestDemoDto;
import com.course.server.mapper.TestDemoMapper;
import com.course.server.service.TestDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestDemoServiceImpl  implements TestDemoService {

    @Autowired
    private TestDemoMapper testDemoMapper;
    @Override
    public List<TestDemoDto>  queryservice() {
        System.out.println("asd");
        List<TestDemoDto> k=testDemoMapper.querymapper();
        return k;
    }
}
