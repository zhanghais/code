package com.baizhi.dao;

import com.baizhi.entity.Reflect;

import java.util.List;

/**
 * Created by Administrator on 2017/6/13 0013.
 */
public interface ReflectDao {
    public void delete(String id);
    public List<Reflect> queryAll();
    void deleteByUserId(String id);
}
