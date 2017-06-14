package com.baizhi.service;

import com.baizhi.entity.Chapter;

import java.util.List;

/**
 * Created by Administrator on 2017/6/13 0013.
 */
public interface ChapterService {
    void save(Chapter chapter);
    void delete(String id);
    Chapter queryById(String id);
    List<Chapter> queryAll();
    List<Chapter> queryByWenId(String id);
}
