package com.zjm.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@Author: pareZhang
 *@Date: 2019/12/9 10:27
 */
@RestController
public class MiyaController {
    @Value("${my.name}")
    private String name;
    @Value("${my.age}")
    private Integer age;
    @RequestMapping("/miya")
    public String miya(){
        return name+":"+age;
    }
}
