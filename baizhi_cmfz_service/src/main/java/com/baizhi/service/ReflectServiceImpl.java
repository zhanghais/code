package com.baizhi.service;

import com.baizhi.dao.ReflectDao;
import com.baizhi.entity.Reflect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.jws.WebService;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.HashMap;

/**
 * Created by Administrator on 2017/6/15 0015.
 */
@WebService
@Path("/reflectService")
@Transactional
public class ReflectServiceImpl implements ReflectService {
    @Autowired
    private ReflectDao reflectDao;
    @Path("/save")
    @POST
    @Produces("application/json;charset=UTF-8")
    public HashMap<String, Object> save(Reflect reflect) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        try {
            reflectDao.save(reflect);
            map.put("message","保存成功");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("message","保存失败");
        }
        return map;
    }
}