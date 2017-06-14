package com.baizhi.dao;

import com.baizhi.entity.Learn;

import java.util.List;

/**
 * Created by Administrator on 2017/6/13 0013.
 */
public interface LearnDao {
    void save(Learn learn);
    void delete(String id);
    void update(Learn learn);
    public List<Learn> queryAll();
    public Learn queryById(String id);
}
