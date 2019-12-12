package com.zjm.component;

import com.zjm.dao.EurekaClientFeign;
import org.springframework.stereotype.Component;

/**
 * @Author: pareZhang
 * @Date: 2019/12/12 11:34
 * 注：该处理类是作为Feign熔断器的逻辑处理类，必须实现被@FeignClient修饰的接口
 * 需要在重写接口方法里写处理熔断的具体逻辑，同时在逻辑处理类上加上@Component注解，注入IOC容器中
 */
@Component
public class HelloHystrix implements EurekaClientFeign {
    @Override
    public String sayHelloFromClientEureka(String name) {
        return "hello,"+name+",sorry,error!";
    }
}
