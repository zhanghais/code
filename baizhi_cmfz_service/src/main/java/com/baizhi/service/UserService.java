package com.baizhi.service;

import com.baizhi.entity.User;

import java.util.HashMap;

/**
 * Created by Administrator on 2017/6/14 0014.
 */
public interface UserService {
    HashMap<String,Object> save(User user);
    HashMap<String,Object> update(User user);
    HashMap<String,Object> login(String name,String password);
    HashMap<String,Object> queryFive();
}
