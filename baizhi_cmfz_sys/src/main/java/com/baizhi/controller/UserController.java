package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/6/13 0013.
 */
@Controller
@Scope("prototype")
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;
    @RequestMapping("/queryAll")
    @ResponseBody
    public List<User> queryAll(){
        List<User> users = userService.queryAll();
        return users;
    }
    @ResponseBody
    @RequestMapping("/delete")
    public void delete(String id){
        try {
            userService.delete(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
