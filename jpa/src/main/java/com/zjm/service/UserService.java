package com.zjm.service;

import com.zjm.dao.UserDao;
import com.zjm.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: pareZhang
 * @Date: 2019/12/10 10:15
 */
@Service
public class UserService {
    @Resource
    private UserDao userDao;
    public User findUserByName(String username){
        return userDao.findByUsername(username);
    }
}
