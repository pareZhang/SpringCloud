package com.zjm.entity;

import javax.persistence.*;

/**
 * @Author: pareZhang
 * @Date: 2019/12/10 9:58
 * @Entity注解  ：表明该类是一个实体类，和数据库的表名相对应
 */
@Entity
public class User {
    /**
     * 注解配置id字段为自增长
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,unique = true)//Column表明该变量对应于数据库表中的字段，unique=true表明该变量对应于数据库表中的字段为唯一约束 */
    private String username;
    @Column
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
