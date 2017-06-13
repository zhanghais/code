package com.baizhi.controller;

import com.baizhi.entity.Wen;
import com.baizhi.service.WenService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.awt.windows.WEmbeddedFrame;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/6/13 0013.
 */
@Controller
@Scope("prototype")
@RequestMapping("/wen")
public class WenController {
    @Resource
    private WenService wenService;
    @RequestMapping("/queryAll")
    @ResponseBody
    public List<Wen> queryAll(){
        List<Wen> wens = wenService.queryAll();
        return wens;
    }
    @RequestMapping("/queryById")
    @ResponseBody
    public Wen queryById(String id){
        Wen wen = wenService.queryById(id);
        return wen;
    }
    @RequestMapping("/save")
    @ResponseBody
    public void save(Wen wen){
        wenService.save(wen);
    }
    @ResponseBody
    @RequestMapping("/delete")
    public void delete(String id ){
        wenService.delete(id);
    }
}
