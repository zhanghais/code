package com.baizhi.service;

import com.baizhi.entity.User;

import java.util.List;

/**
 * Created by Administrator on 2017/6/12 0012.
 */

public interface UserService {
    public User queryById(String id);
    public List<User> queryAll();
    public void update(User user);
    public void delete(String id);
}
