package com.baizhi.controller;

import com.baizhi.entity.Chapter;
import com.baizhi.entity.Wen;
import com.baizhi.service.ChapterService;
import com.baizhi.service.WenService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import sun.awt.windows.WEmbeddedFrame;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by Administrator on 2017/6/13 0013.
 */
@Controller
@Scope("prototype")
@RequestMapping("/wen")
public class WenController {
    @Resource
    private WenService wenService;
    @Resource
    private ChapterService chapterService;
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
    public void save(Wen wen, MultipartFile aaa, HttpServletRequest request,List<MultipartFile> bbb) throws IOException {
        try {
            String realPath = request.getSession().getServletContext().getRealPath("/");
            File file = new File(realPath,"wen");
            if(!file.exists()){
                file.mkdirs();//xiugai
            }
            aaa.transferTo(new File(file,aaa.getOriginalFilename()));
            wen.setId(UUID.randomUUID().toString());
            wen.setThumbnail("/wen/"+ aaa.getOriginalFilename());
            wen.setCount(bbb.size());
            wen.setCreateDate(new Date());
            File file1 = new File(realPath,"chapter");
            if(!file1.exists()){
                file1.mkdirs();//xiugai
            }
            for (MultipartFile fl : bbb) {
                fl.transferTo(new File(file1,fl.getOriginalFilename()));
                Chapter chapter = new Chapter();
                chapter.setSize(String.valueOf(fl.getSize()));
                chapter.setDownload("/chapter/"+fl.getOriginalFilename());
                chapter.setWen(wen);
                chapter.setTitle(fl.getOriginalFilename());
                chapterService.save(chapter);
            }
            wenService.save(wen);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }
    @ResponseBody
    @RequestMapping("/delete")
    public void delete(String id ){
        wenService.delete(id);
    }
}
