package com.zjm.dao;

import com.zjm.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

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

    /**
     * 查询所有
     * @return
     */
    @Override
    List<User> findAll();

    /**
     * 增
     * @param user
     * @return
     */
    @Override
    User save(User user);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    User findById(long id);

    /**
     * 改
     * @param user
     * @return
     */
    @Override
    User saveAndFlush(User user);

    /**
     * 删
     * @param id
     */
    void deleteById(long id);
}
