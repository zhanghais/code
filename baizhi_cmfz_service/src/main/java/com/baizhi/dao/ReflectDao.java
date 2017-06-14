package com.baizhi.dao;

import com.baizhi.entity.Reflect;

import java.util.List;

/**
 * Created by Administrator on 2017/6/13 0013.
 */
public interface ReflectDao {
    void save(Reflect reflect);
    public void delete(String id);
    void deleteByUserId(String id);
}
