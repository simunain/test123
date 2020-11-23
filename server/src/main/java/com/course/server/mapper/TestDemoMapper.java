package com.course.server.mapper;

import com.course.server.domain.TestDemoDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component //把该mapper注入到spring的bean中
public interface TestDemoMapper {

    List<TestDemoDto>  querymapper();

}
