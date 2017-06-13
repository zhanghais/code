package com.baizhi.dao;

import com.baizhi.entity.Image;

import java.util.List;

/**
 * Created by Administrator on 2017/6/12 0012.
 */
public interface ImageDao {
    public void save(Image image);
    public void update(Image image);
    public void delete(String id);
    public List<Image> queryAll();
    public Image queryById(String id);
}
