package com.course.server.service;

import com.course.server.domain.Chapter;
import com.course.server.domain.Test;
import com.course.server.domain.TestDemoDto;
import com.course.server.dto.Chapterdto;

import java.util.List;

public interface ChapterService {

    //初次使用example
    List<Chapter>  queryExampleservice();

    //使用吧正常实体类转为dto实体类,进行数据交互,便于管理和维护,开发友善
    List<Chapterdto> queryExampleservicetwo();



}
