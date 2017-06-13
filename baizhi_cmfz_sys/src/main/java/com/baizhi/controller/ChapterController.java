package com.baizhi.controller;

import com.baizhi.entity.Chapter;
import com.baizhi.entity.Image;
import com.baizhi.service.ChapterService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 2017/6/13 0013.
 */
@Controller
@RequestMapping("/chapter")
@Scope("prototype")
public class ChapterController {
    @Resource
    private ChapterService chapterService;

    @RequestMapping("/save")
    public void save(MultipartFile music, HttpServletRequest request,Chapter chapter) throws IOException {
        String realPath = request.getSession().getServletContext().getRealPath("/");
        File file = new File(realPath,"music");
        if(!file.exists()){
            file.mkdirs();
        }
        System.out.println(music);
        music.transferTo(new File(file,music.getOriginalFilename()));
        System.out.println(realPath+"/upload"+music.getOriginalFilename());
        chapter.setDownload("/music/"+music.getOriginalFilename());
        long size = music.getSize();
        String s = String.valueOf(size);
        chapter.setSize(s);
        chapterService.save(chapter);
    }
    @RequestMapping("/delete")
    public void delete(String id){
        chapterService.delete(id);
    }
}
