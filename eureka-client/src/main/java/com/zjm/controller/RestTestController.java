package com.zjm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: pareZhang
 * @Date: 2019/12/11 10:33
 */
@RestController
public class RestTestController {

    @GetMapping("/testRest")
    public String testRest(){
        RestTemplate restTemplate=new RestTemplate();
        return restTemplate.getForObject("http://www.baidu.com/",String.class);
    }
}
