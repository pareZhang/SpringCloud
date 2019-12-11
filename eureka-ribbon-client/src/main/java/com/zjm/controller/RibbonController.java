package com.zjm.controller;

import com.zjm.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: pareZhang
 * @Date: 2019/12/11 10:57
 */
@RestController
public class RibbonController {
    @Autowired
    private RibbonService ribbonService;
    @Autowired
    private LoadBalancerClient loadBalancer;
    @GetMapping("/hello")
    public String hello(@RequestParam(required = false,defaultValue = "pareZhang") String name){
        return ribbonService.hello(name);
    }
    @GetMapping("/testRibbon")
    public String testRibbon(){
        ServiceInstance instance=loadBalancer.choose("eureka-client");
        return instance.getHost()+":"+instance.getPort();
    }

}
