package com.baizhi.controller;

import com.baizhi.entity.Learn;
import com.baizhi.service.LearnService;
import org.springframework.context.annotation.Scope;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/6/13 0013.
 */
@Controller
@RequestMapping("/learn")
@Scope("prototype")
public class LearnController {

    @Resource
    private LearnService learnService;
    @RequestMapping("/queryAll")
    @ResponseBody
    public List<Learn> queryAll(){
        List<Learn> learns = learnService.queryAll();
        return learns;
    }
    @RequestMapping("/delete")
    public void delete(String id){
        learnService.delete(id);
    }
    @RequestMapping("/save")
    @ResponseBody
    public void save(Learn learn){
        learnService.save(learn);
    }
}
