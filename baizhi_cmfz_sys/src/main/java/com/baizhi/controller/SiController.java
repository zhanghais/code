package com.baizhi.controller;
import com.baizhi.entity.Image;
import com.baizhi.entity.Si;
import com.baizhi.service.SiService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Date;
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
    public void save(MultipartFile aaa, HttpServletRequest request, Si si) throws IOException {
        try {
            String realPath = request.getSession().getServletContext().getRealPath("/");
            File file = new File(realPath,"image");
            if(!file.exists()){
                file.mkdirs();
            }
            System.out.println(aaa.getOriginalFilename());
            aaa.transferTo(new File(file,aaa.getOriginalFilename()));
            si.setPath("/image/"+aaa.getOriginalFilename());
            si.setDate(new Date());
            siService.save(si);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
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