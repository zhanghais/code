package com.baizhi.service;

import com.baizhi.dao.SiDao;
import com.baizhi.entity.Si;
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
@Path("/siService")
public class SiServiceImpl implements SiService{
    @Autowired
    private SiDao siDao;

    @GET
    @Produces("application/json;charset=UTF-8")
    @Path("/queryAll")
    public HashMap<String, Object> queryAll() {
        HashMap<String, Object> map = new HashMap<String, Object>();

        List<Si> sis = siDao.queryAll();
        map.put("sis",sis);

        return map;
    }
}
