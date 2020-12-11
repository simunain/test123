package com.course.business.controller;


import com.course.server.domain.Test;
import com.course.server.domain.TestDemoDto;
import com.course.server.service.TestDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class TsetController {

    @Autowired
    private   TestDemoService testDemoService;

    @RequestMapping("/test")
    public String test(){
        return "success";
    }

    @RequestMapping("/ooxx")
    @ResponseBody
    public List<TestDemoDto> testqwer(){
        System.out.println("阿薩德");
        return testDemoService.queryservice();
    }

    //初次使用example
    @RequestMapping("/ooxxexample")
    @ResponseBody
    public List<Test> testqwerExample(){
        System.out.println("Exampleservice");
        return testDemoService.queryExampleservice();
    }

    //初次使用example
    @RequestMapping("/ooxxexampletwo")
    @ResponseBody
    public List<Test> testqwerExampletwo(){
        System.out.println("Exampleservice");
        return testDemoService.queryExampletwoservice();
    }
}














