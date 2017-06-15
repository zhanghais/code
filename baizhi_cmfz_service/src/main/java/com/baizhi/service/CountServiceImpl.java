package com.baizhi.service;

import com.baizhi.dao.CountDao;
import com.baizhi.entity.Count;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.jws.WebService;
import javax.ws.rs.*;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/**
 * Created by Administrator on 2017/6/15 0015.
 */
@WebService
@Path("/countService")
@Transactional
public class CountServiceImpl implements CountService {
    @Autowired
    private CountDao countDao;
    @POST
    @Path("/save")
    @Produces("application/json;charset=UTF-8")
    public HashMap<String, Object> save(Count count) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        try {
            count.setId(UUID.randomUUID().toString());
            countDao.save(count);
            map.put("message","保存成功");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("message","保存失败");
        }
        return map;
    }
    @DELETE
    @Produces("application/json;charset=UTF-8")
    @Path("/delete/{id}")
    public HashMap<String, Object> delete(@PathParam("id") String id) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        try {
            countDao.delete(id);
            map.put("message","删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("message",e.getMessage());
        }
    return map;
    }

    public HashMap<String, Object> update(Count count) {
                HashMap<String, Object> map = new HashMap<String, Object>();
                try {
                    countDao.update(count);
                    map.put("message","修改成功");
                } catch (Exception e) {
                    e.printStackTrace();
                    map.put("message","修改失败");
        }
        return map;
    }
    @Path("/queryBy/{userid}/{learnid}")
    @GET
    @Produces("application/json;charset=UTF-8")
    public HashMap<String, Object> queryBy(String userid, String learnid) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        try {
            List<Count> counts = countDao.queryBy(userid, learnid);
            map.put("counts",counts);
            map.put("message","查询成功");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("message","查询失败");
        }
        return map;
    }
}
