package com.zjm.service;

import com.zjm.dao.UserDao;
import com.zjm.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: pareZhang
 * @Date: 2019/12/10 10:15
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    public User findUserByName(String username){
        return userDao.findByUsername(username);
    }
    public List<User> findAll(){
        return userDao.findAll();
    }
    public User saveUser(User user){
        return userDao.save(user);
    }
    public User findUserById(long id){
        return userDao.findById(id);
    }
    public User updateUser(User user){return userDao.saveAndFlush(user);}
    public void deleteUser(long id){userDao.deleteById(id);}
}
