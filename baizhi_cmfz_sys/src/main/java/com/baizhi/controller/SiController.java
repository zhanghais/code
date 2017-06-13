package com.baizhi.controller;
import com.baizhi.entity.Si;
import com.baizhi.service.SiService;
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
@RequestMapping("/si")
@Scope("prototype")
public class SiController {
    @Resource
    private SiService siService;
    @RequestMapping("/save")
    @ResponseBody
    public void save(Si si){
        siService.save(si);
    }
    @RequestMapping("/delete")
    @ResponseBody
    public void delete(String id){
        siService.delete(id);
    }
    @RequestMapping("/queryAll")
    @ResponseBody
    public List<Si> queryAll(){
        List<Si> sis = siService.queryAll();
        return sis;
    }
    @RequestMapping("/queryById")
    @ResponseBody
    public Si queryById(String id){
        Si si = siService.queryById(id);
        return si;
    }
}