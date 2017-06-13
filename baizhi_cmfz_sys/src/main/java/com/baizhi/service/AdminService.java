package com.baizhi.service;

import com.baizhi.entity.Admin;

import java.util.List;

/**
 * Created by Administrator on 2017/6/12 0012.
 */
public interface AdminService {
    public void regist(Admin admin);
    public List<Admin> queryAll();
    public Admin login(String name,String password);
}
