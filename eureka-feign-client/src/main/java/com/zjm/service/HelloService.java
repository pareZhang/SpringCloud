package com.zjm.service;

import com.zjm.dao.EurekaClientFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @Author: pareZhang
 * @Date: 2019/12/12 10:47
 */
@Service
public class HelloService {
    @Autowired
    private EurekaClientFeign eurekaClientFeign;
    public String sayHello(String name){
        return eurekaClientFeign.sayHelloFromClientEureka(name);
    }
}
