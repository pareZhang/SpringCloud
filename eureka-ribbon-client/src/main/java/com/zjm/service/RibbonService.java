package com.zjm.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
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
    /**
     * 使用RestTemplate和Ribbon消费服务
     * public String hello(String name){
        return restTemplate.getForObject("http://eureka-client/hello?name="+name,String.class);
    }*/
    /**
     * 在RestTemplate和Ribbon上使用熔断器
     * @param name
     * @return
     */
    @HystrixCommand(fallbackMethod = "helloError")
    public String hello(String name){
        return restTemplate.getForObject("http://eureka-client/hello?name="+name,String.class);
    }
    public String helloError(String name){
        return "hello,"+name+",sorry,error!";
    }
}
