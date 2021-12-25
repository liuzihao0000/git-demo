package com.yida.gitdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//返回字符串
public class IndexController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello world";//返回字符串
    }

    @RequestMapping("world")
    public String world(){
        return "world";//字符串
    }
}
