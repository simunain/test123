package com.course.server.service.impl;

import com.course.server.domain.*;
import com.course.server.mapper.ChapterMapper;
import com.course.server.mapper.TestDemoMapper;
import com.course.server.mapper.TestMapper;
import com.course.server.service.ChapterService;
import com.course.server.service.TestDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChapterServiceImpl implements ChapterService {


    @Autowired
    private ChapterMapper chapterMapper;

    //初次使用example
    public List<Chapter>  queryExampleservice() {

        ChapterExample chapterExample= new ChapterExample();
        chapterExample.createCriteria().andIdEqualTo("00000001");
        //相当于select id, `name`FROM test WHERE ( id = '1' );
        return chapterMapper.selectByExample(chapterExample);
    }


}























