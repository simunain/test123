package com.course.server.service;

import com.course.server.domain.Test;
import com.course.server.domain.TestDemoDto;

import java.util.List;

public interface TestDemoService {

    public List<TestDemoDto> queryservice();
    //初次使用example
    List<Test>  queryExampleservice();

    //使用example添加数据,只能是生成的实体类才可以用,因为设置的类型就是生成的实体类
    public List<Test>  queryExampletwoservice();

}
