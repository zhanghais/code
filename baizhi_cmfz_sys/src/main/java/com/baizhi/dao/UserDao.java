package com.baizhi.dao;

import com.baizhi.entity.User;

import java.util.List;

/**
 * Created by Administrator on 2017/6/12 0012.
 */
public interface UserDao {
    public User queryById(String id);
    public List<User> queryAll();
    public void update(User user);
    public void delete(String id);
}
