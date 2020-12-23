package com.course.business.controller.admin;


import ch.qos.logback.classic.Logger;
import com.course.server.domain.Chapter;
import com.course.server.dto.Chapterdto;
import com.course.server.dto.PageDto;
import com.course.server.service.ChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    //初次使用example
    @RequestMapping("/chapter/list")
    @ResponseBody
    public List<Chapterdto> listqwerExampletwoo(){
        System.out.println("Exampleservicetwo");

        return chapterService.queryExampleservicetwo();
    }

    //初次使用example
    @PostMapping("/chapter/postlist")
    @ResponseBody
    public List<Chapterdto> postExampletwoo(){
        System.out.println("Exampleservicetwo");

        return chapterService.queryExampleservicetwo();
    }

    //自定义分页实体
    @PostMapping("/chapter/postlistPageDto")
    public PageDto postExampletwooPageDto(@RequestBody PageDto pageDto){
        System.out.println("Exampleservicetwo");
        PageDto pageDto1 = chapterService.queryExampleservicetwoPageDto(pageDto);
        return pageDto1;
    }
}














