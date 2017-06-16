package com.baizhi.service;

import com.baizhi.dao.CityDao;
import com.baizhi.entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/6/16 0016.
 */
@WebService
@Path("/cityService")
@Transactional
public class CityServiceImpl implements CityService {
    @Autowired
    private CityDao cityDao;


    @Path("/queryByProvinceId")
    @Produces("application/json;charset=UTF-8")
    @GET
    public HashMap<String, Object> queryByProvinceId(String id) {
        HashMap<String, Object> map = new HashMap<String, Object>();

        try {
            List<City> cities = cityDao.queryByProvinceid(id);
            map.put("cities",cities);
            map.put("message","查询成功");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("message","查询失败");
        }
        return map;
    }

    @GET
    @Path("/queryById")
    @Produces("application/json;charset=UTF-8")
    public HashMap<String, Object> queryById(String id) {
        HashMap<String, Object> map = new HashMap<String, Object>();

        City city = cityDao.queryById(id);
        map.put("city",city);
        map.put("message","查询成功");

        return map;
    }
}
