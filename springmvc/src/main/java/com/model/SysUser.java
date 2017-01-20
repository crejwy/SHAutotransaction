package com.model;


import javax.persistence.*;

/**
 * Created by Administrator on 2017/1/16.
 */
@Entity
public class SysUser {
    public  int id;
    @Column(nullable = false,unique = true)
    public  String username;
    @Column(nullable = false)
    public  String password;
    @Column(nullable = false)
    public  String name_zh;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getName_zh() {
        return name_zh;
    }

    public void setName_zh(String name_zh) {
        this.name_zh = name_zh;
    }
}
