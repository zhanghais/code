package com.baizhi.controller;

import com.baizhi.entity.Reflect;
import com.baizhi.service.ReflectService;
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
@RequestMapping("/reflect")
public class ReflectController {
    @Resource
    private ReflectService reflectService;

    @RequestMapping("/delete")
    @ResponseBody
    public void delete(String id){
        try {
            reflectService.delete(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @RequestMapping("/queryAll")
    @ResponseBody
    public List<Reflect> queryAll(){
        List<Reflect> reflects = reflectService.queryAll();
        return reflects;
    }
}
