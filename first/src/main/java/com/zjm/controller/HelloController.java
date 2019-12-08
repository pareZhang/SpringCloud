package com.zjm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: pareZhang
 * @Date: 2019/12/8 19:47
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String index(){
        return "Greetings from Spring Boot!";
    }
}
