package com.baizhi.service;

import java.util.HashMap;

/**
 * Created by Administrator on 2017/6/16 0016.
 */
public interface CityService {
    HashMap<String ,Object> queryByProvinceId(String id);
    HashMap<String,Object> queryById(String id);
}
