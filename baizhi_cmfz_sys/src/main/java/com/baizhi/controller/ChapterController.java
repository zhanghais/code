package com.baizhi.controller;

import com.baizhi.entity.Chapter;
import com.baizhi.entity.Image;
import com.baizhi.service.ChapterService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2017/6/13 0013.
 */
@Controller
@RequestMapping("/chapter")
@Scope("prototype")
public class ChapterController {
    @Resource
    private ChapterService chapterService;
    @RequestMapping("/queryByWenId")
    @ResponseBody
    public List<Chapter> queryByWenId(String id){
        List<Chapter> chapters = chapterService.queryByWenId(id);
        return chapters;
    }
}
