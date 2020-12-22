package com.course.server.service.impl;

import com.course.server.domain.*;
import com.course.server.dto.Chapterdto;
import com.course.server.mapper.ChapterMapper;
import com.course.server.mapper.TestDemoMapper;
import com.course.server.mapper.TestMapper;
import com.course.server.service.ChapterService;
import com.course.server.service.TestDemoService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    //使用吧正常实体类转为dto实体类,进行数据交互,便于管理和维护,开发友善
    public List<Chapterdto>  queryExampleservicetwo() {
        //分页,设置从第一页开始,一页显示1条数据
        PageHelper.startPage(1, 1);
        //分页,设置从第一页开始,一页显示10条数据
       // PageHelper.startPage(1, 10);
        ChapterExample chapterExample= new ChapterExample();
        chapterExample.createCriteria().andIdEqualTo("00000001");
        //相当于select id, `name`FROM test WHERE ( id = '1' );
        List<Chapter> chapterList = chapterMapper.selectByExample(chapterExample);


        List<Chapterdto> chapterdtoList = new ArrayList<Chapterdto>();

        for (Chapter chapter : chapterList) {
            Chapterdto chapterdto = new Chapterdto();
            //对象之间赋值  ,, 这里的也是,把chapter对象里的属性和chapterdto对象里相同的属性进行赋值给相同的属性值
            /*
            列如chapter对象里有一个private String courseId;属性,属性值为qwe,
            那么他就可以给chapterdto对象里相同的属性private String courseId;赋值为qwe
                    **/
            BeanUtils.copyProperties(chapter,chapterdto);
            chapterdtoList.add(chapterdto);
        }

/*
        for (int i = 0; i <chapterList.size() ; i++) {
            Chapter chapter = chapterList.get(i);
            Chapterdto chapterdto = new Chapterdto();
            BeanUtils.copyProperties(chapter,chapterdto);
            chapterdtoList.add(chapterdto);

        }
        **/
        return chapterdtoList;
}

}























