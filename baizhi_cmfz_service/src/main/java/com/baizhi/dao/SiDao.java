package com.baizhi.dao;

import com.baizhi.entity.Si;

import java.util.List;

/**
 * Created by Administrator on 2017/6/13 0013.
 */
public interface SiDao {
    public List<Si> queryByType(String type);
    Si queryById(String id);
    List<Si> queryAll();
 }
