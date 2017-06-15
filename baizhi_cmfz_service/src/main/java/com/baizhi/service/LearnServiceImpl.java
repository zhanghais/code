package com.baizhi.service;

import com.baizhi.dao.LearnDao;
import com.baizhi.entity.Learn;
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
@Path("/learnService")
@WebService
@Transactional
public class LearnServiceImpl implements LearnService {
    @Autowired
    private LearnDao learnDao;
    @Path("/queryAll")
    @GET
    @Produces("application/json;charset=UTF-8")
    public HashMap<String, Object> queryAll() {
        HashMap<String, Object> map = new HashMap<String, Object>();
        List<Learn> learns = learnDao.queryAll();
        map.put("learns",learns);
        return map;
    }
}
