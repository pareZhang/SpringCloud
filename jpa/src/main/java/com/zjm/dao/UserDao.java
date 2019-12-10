package com.zjm.dao;

import com.zjm.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: pareZhang
 * @Date: 2019/12/10 10:10
 */
public interface UserDao extends JpaRepository<User,Long> {
    /**
     * 通过名称查询
     * @param username
     * @return
     */
    User findByUsername(String username);
}
