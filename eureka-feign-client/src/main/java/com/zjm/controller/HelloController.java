package com.zjm.controller;

import com.zjm.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: pareZhang
 * @Date: 2019/12/12 10:54
 */
@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;
    @GetMapping("hello")
    public String sayHello(@RequestParam(defaultValue = "pareZhang",required = false) String name){
        return helloService.sayHello(name);
    }
}
