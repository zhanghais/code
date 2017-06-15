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
import java.util.List;
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
        try {
            user.setId(UUID.randomUUID().toString());
            String salt = Saltutils.getSalt(6);
            user.setSalt(salt);
            String digest = MD5Utils.getDigest(user.getPassowrd() + salt);
            user.setPassowrd(digest);
            userDao.save(user);
            map.put("user",user);
            map.put("message","注册成功");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("message","注册失败");
        }
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
        User user = userDao.queryByName(name);
        if(user!=null){
            String pwdDB = user.getPassowrd();
            String salt = user.getSalt();
            if(MD5Utils.getDigest(password+salt).equals(pwdDB)){
                map.put("message", "登陆成功");
            }else {
                map.put("message","密码错误");
            }
        }else {
            map.put("message", "用户名不存在");
        }
        return map;
    }
    @GET
    @Path("/queryFive")
    @Produces("application/json;charset=UTF-8")
    public HashMap<String,Object> queryFive(){
        HashMap<String, Object> map = new HashMap<String, Object>();
        List<User> users = userDao.queryAll();
        int size = users.size();
        if(size>5){
            double v = Math.random() * (size-6);
            int round = (int) Math.round(v);
            List<User> users1 = users.subList(round, 5);
            map.put("users",users1);
        }else{
            map.put("users",users);
        }
        return map;
    }
}
