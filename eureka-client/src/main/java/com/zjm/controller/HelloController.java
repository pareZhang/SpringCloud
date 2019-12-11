package com.zjm.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: pareZhang
 * @Date: 2019/12/10 17:58
 */
@RestController
public class HelloController {
    @Value("${server.port}")
    private String port;
    @RequestMapping("/hello")
    public String home(@RequestParam String name){
        return "hello "+name+",i am from port:"+port;
    }
}
