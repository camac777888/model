package com.spring.bnspringbootenv.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(value = "/health")
    public String Health(){
    return " working!";
    }
}
