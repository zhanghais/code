package com.baizhi.service;

import com.baizhi.dao.WenDao;
import com.baizhi.entity.Wen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/6/14 0014.
 */
@WebService
@Transactional
@Path("/wenService")
public class WenServiceImpl implements WenService {
    @Autowired
    private WenDao wenDao;
    @GET
    @Path("/queryAll")
    @Produces("application/json;charset=UTF-8")
    public HashMap<String, Object> queryAll() {
        HashMap<String, Object> map = new HashMap<String, Object>();
        try {
            List<Wen> wens = wenDao.queryAll();
            map.put("wens",wens);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("errorno","-200");
            map.put("err_msg",e.getMessage());
        }
        return map;
    }
}
