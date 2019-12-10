package com.zjm.controller;

import com.zjm.entity.User;
import com.zjm.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: pareZhang
 * @Date: 2019/12/10 10:18
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;
    @ApiOperation(value = "用户列表",notes = "用户列表")
    @RequestMapping(value = {""},method = RequestMethod.GET)
    public List<User> getUsers(){
        List<User> users=userService.findAll();
        return users;
    }
    @ApiOperation(value = "创建用户",notes = "创建用户")
    @RequestMapping(value = "",method = RequestMethod.POST)
    public User postUser(@RequestBody User user){
        return userService.saveUser(user);
    }
    @ApiOperation(value = "获取用户信息",notes = "根据url的id来获取详细信息")
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public User getUser(@PathVariable Long id){
        return userService.findUserById(id);
    }
    @ApiOperation(value = "更新信息",notes = "根据url的id来指定更新用户信息")
    @RequestMapping(value = "/{id}",method=RequestMethod.PUT)
    public User putUser(@RequestBody User user, @PathVariable Long id){
        User user1=new User();
        user1.setUsername(user1.getUsername());
        user1.setPassword(user1.getPassword());
        user1.setId(id);
        return userService.updateUser(user1);
    }
    @ApiOperation(value = "删除用户",notes = "根据url的id来指定删除用户")
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
        return "success";
    }
    @ApiIgnore //使用该注解来忽略这个API
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String jsonTest(){
        return "hi you !";
    }


}
