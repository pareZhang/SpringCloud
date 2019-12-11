package com.zjm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: pareZhang
 * @Date: 2019/12/11 10:54
 */
@Service
public class RibbonService {
    @Autowired
    private RestTemplate restTemplate;
    public String hello(String name){
        return restTemplate.getForObject("http://eureka-client/hello?name="+name,String.class);
    }
}
