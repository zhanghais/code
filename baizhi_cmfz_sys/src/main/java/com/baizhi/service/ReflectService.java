package com.baizhi.service;

import com.baizhi.entity.Reflect;

import java.util.List;

/**
 * Created by Administrator on 2017/6/13 0013.
 */
public interface ReflectService {
    public void delete(String id);
    public List<Reflect> queryAll();
}
