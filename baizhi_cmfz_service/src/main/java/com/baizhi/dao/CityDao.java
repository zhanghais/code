package com.baizhi.dao;

import com.baizhi.entity.City;

import java.util.List;

/**
 * Created by Administrator on 2017/6/15 0015.
 */
public interface CityDao {
    List<City> queryByProvinceid(String id);
    City queryById(String id);
}
