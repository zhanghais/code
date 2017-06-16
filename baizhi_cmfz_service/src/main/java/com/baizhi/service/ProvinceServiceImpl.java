package com.baizhi.service;

import com.baizhi.dao.ProvinceDao;
import com.baizhi.entity.Province;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/6/16 0016.
 */
@WebService
@Path("/provinceService")
@Transactional
public class ProvinceServiceImpl implements ProvinceService {
   @Autowired
   private ProvinceDao provinceDao;

    @GET
    @Path("/queryAll")
    @Produces("application/json;charset=UTF-8")
    public HashMap<String, Object> queryAll() {
        HashMap<String, Object> map = new HashMap<String, Object>();
        try {
            List<Province> provinces = provinceDao.queryAll();
            map.put("provinces",provinces);
            map.put("message","查询成功");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("message","查询失败");
        }
        return map;
    }
    @GET
    @Path("/queryById/{id}")
    @Produces("application/json;charset=UTF-8")
    public HashMap<String, Object> queryById(@PathParam("id") String id) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        try {
            Province province = provinceDao.queryById(id);
            map.put("province",province);
            map.put("message","查询成功");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("message","查询失败");
        }
        return map;
    }
}
