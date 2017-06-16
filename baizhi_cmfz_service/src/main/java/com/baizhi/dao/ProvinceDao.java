package com.baizhi.dao;

import com.baizhi.entity.Province;

import java.util.List;

/**
 * Created by Administrator on 2017/6/15 0015.
 */
public interface ProvinceDao {
    List<Province> queryAll();
    Province queryById(String id);
}
