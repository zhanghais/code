package com.baizhi.service;

import com.baizhi.dao.ImageDao;
import com.baizhi.entity.Image;
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
@Path("/imageService")
public class ImageServiceImpl implements ImageService{
    @Autowired
    private ImageDao imageDao;
    @GET
    @Produces("application/json;charset=UTF-8")
    @Path("/queryAll")
    public HashMap<String, Object> queryAll() {
        HashMap<String, Object> map = new HashMap<String, Object>();
        List<Image> images = imageDao.queryAll();
        map.put("images",images);
        return map;
    }
}