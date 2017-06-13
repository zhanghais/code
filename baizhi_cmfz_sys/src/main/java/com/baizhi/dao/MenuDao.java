package com.baizhi.dao;

import com.baizhi.entity.Menu;

import java.util.List;

/**
 * Created by Administrator on 2017/6/11 0011.
 */
public interface MenuDao {
    public List<Menu> queryAll();
    public Menu queryByParent(String pid);
}
