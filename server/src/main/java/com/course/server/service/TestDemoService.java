package com.course.server.service;

import com.course.server.domain.Test;
import com.course.server.domain.TestDemoDto;

import java.util.List;

public interface TestDemoService {

    public List<TestDemoDto> queryservice();
    //初次使用example
    List<Test>  queryExampleservice();

}
