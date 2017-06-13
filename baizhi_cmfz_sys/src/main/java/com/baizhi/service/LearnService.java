package com.baizhi.service;

import com.baizhi.entity.Learn;

import java.util.List;

/**
 * Created by Administrator on 2017/6/13 0013.
 */
public interface LearnService {
    void save(Learn learn);
    void delete(String id);
    void update(Learn learn);
    Learn queryById(String id);
    List<Learn> queryAll();
}
