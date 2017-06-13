package com.baizhi.dao;

import com.baizhi.entity.Admin;

import java.util.List;

/**
 * Created by Administrator on 2017/6/12 0012.
 */
public interface AdminDao {
    public void save(Admin admin);
    public Admin queryByName(String name);
    public List<Admin> queryAll();
}
