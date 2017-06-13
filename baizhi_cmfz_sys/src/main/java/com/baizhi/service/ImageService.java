package com.baizhi.service;

import com.baizhi.entity.Image;

import java.util.List;

/**
 * Created by Administrator on 2017/6/12 0012.
 */
public interface ImageService {
    public void save(Image image);
    public void delete(String id);
    public void update(Image image);
    public Image queryById(String id);
    public List<Image> queryAll();
}
