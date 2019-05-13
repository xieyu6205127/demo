package com.xieyu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping("/sayHello")
    public String sayHello(){
        return "hello world !!!!";
    }
}
