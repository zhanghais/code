package com.baizhi.dao;

import com.baizhi.entity.Chapter;

import java.util.List;

/**
 * Created by Administrator on 2017/6/13 0013.
 */
public interface ChapterDao {
    void save(Chapter chapter);
    void delete(String id);
    Chapter queryById(String id);
    List<Chapter> queryAll();
}
