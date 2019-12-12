package com.zjm.dao;

import com.zjm.component.HelloHystrix;
import com.zjm.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: pareZhang
 * @Date: 2019/12/12 10:48
 */
@FeignClient(value = "eureka-client",configuration = FeignConfig.class,fallback = HelloHystrix.class)
public interface EurekaClientFeign {
    /**
     * 该方法通过Feign来调用eureka-client服务的"/hello"的API接口
     * @param name
     * @return
     */
   @GetMapping(value = "/hello")
    String sayHelloFromClientEureka(@RequestParam(value = "name")String name);
}
