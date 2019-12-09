package com.zjm.controller;

import com.zjm.bean.ConfigBean;
import com.zjm.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: pareZhang
 * @Date: 2019/12/9 11:03
 */
@RestController
@EnableConfigurationProperties({ConfigBean.class,User.class})
public class UserController {
    @Autowired
    ConfigBean configBean;
    @RequestMapping("/zhang")
    public String miya(){
        return configBean.getGreeting()+"-"+configBean.getName()+"-"+configBean.getUuid()+"-"+configBean.getMax();
    }
    @Autowired
    User user;
    @RequestMapping("/user")
    public String user(){
        return user.getName()+":"+user.getAge();
    }
}
