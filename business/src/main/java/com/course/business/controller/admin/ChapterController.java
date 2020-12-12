package com.course.business.controller.admin;


import com.course.server.domain.Chapter;
import com.course.server.dto.Chapterdto;
import com.course.server.service.ChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/admin")
public class ChapterController {

    @Autowired
    private ChapterService chapterService;

    @RequestMapping("/chaptertest")
    public String test(){
        return "success";
    }


    //初次使用example
    @RequestMapping("/chapterone")
    @ResponseBody
    public List<Chapter> testqwerExampletwo(){
        System.out.println("Exampleservice");

        return chapterService.queryExampleservice();
    }
    //初次使用example
    @RequestMapping("/chapteronetwo")
    @ResponseBody
    public List<Chapterdto> testqwerExampletwoo(){
        System.out.println("Exampleservicetwo");

        return chapterService.queryExampleservicetwo();
    }
}














