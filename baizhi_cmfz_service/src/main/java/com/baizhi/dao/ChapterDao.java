package com.baizhi.dao;

import com.baizhi.entity.Chapter;

import java.util.List;

/**
 * Created by Administrator on 2017/6/13 0013.
 */
public interface ChapterDao {
    Chapter queryById(String id);
    List<Chapter> queryByWenId(String id);
    void deleteByWenId(String id);
}
