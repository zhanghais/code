package com.baizhi.service;

import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import com.baizhi.test.MD5Utils;
import com.baizhi.test.Saltutils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.jws.WebService;
import javax.ws.rs.*;
import java.util.HashMap;
import java.util.UUID;

/**
 * Created by Administrator on 2017/6/14 0014.
 */
@WebService
@Transactional
@Path("/userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @POST
    @Path("/save")
    @Produces("application/json;charset=UTF-8")
    public HashMap<String,Object> save(User user) {
        HashMap<String,Object> map=new HashMap<String, Object>();
        user.setId(UUID.randomUUID().toString());
        userDao.save(user);

        return map;
    }
    @POST
    @Path("/update")
    @Produces("application/json;charset=UTF-8")
    public HashMap<String,Object> update(User user) {
        HashMap<String,Object> map=new HashMap<String, Object>();

        try {
            String clientpwd = user.getPassowrd();
            String id = user.getId();
            User user1 = userDao.queryById(id);
            if(!user1.getPassowrd().equals(clientpwd)){//密码没有修改
                String salt = Saltutils.getSalt(6);
                user.setSalt(salt);
                String digest = MD5Utils.getDigest(user.getPassowrd() + salt);
                user.setPassowrd(digest);
            }
            userDao.update(user);
            map.put("user",user);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("errno","-200");
            map.put("err_message",e.getMessage());
        }
        return map;
    }
    @GET
    @Path("/login/{name}/{password}")
    @Produces("application/json;charset=UTF-8")
    public HashMap<String,Object> login(@PathParam("name") String name,@PathParam("password") String password) {
        HashMap<String,Object> map=new HashMap<String, Object>();


        return map;
    }
}
