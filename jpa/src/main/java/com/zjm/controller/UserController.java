package com.zjm.controller;

import com.zjm.entity.User;
import com.zjm.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: pareZhang
 * @Date: 2019/12/10 10:18
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;
    @GetMapping("/username/{username}")
    public User getUser(@PathVariable("username") String username){
        return userService.findUserByName(username);
    }
}
