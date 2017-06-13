package com.baizhi.service;

import com.baizhi.entity.Wen;

import java.util.List;

/**
 * Created by Administrator on 2017/6/13 0013.
 */
public interface WenService {
    public void save(Wen wen);
    public void delete(String id);
    public void update(Wen wen);
    public Wen queryById(String id);
    public List<Wen> queryAll();
}
