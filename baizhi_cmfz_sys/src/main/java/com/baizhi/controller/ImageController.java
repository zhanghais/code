package com.baizhi.controller;

import com.baizhi.entity.Image;
import com.baizhi.service.ImageService;
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
 * Created by Administrator on 2017/6/12 0012.
 */
@Controller
@Scope("prototype")
@RequestMapping("/image")
public class ImageController {
    @Resource
    private ImageService imageService;
    @RequestMapping("/add")
    @ResponseBody
    public void save(MultipartFile aaa, HttpServletRequest request,String description) throws IOException {
        try {
            String realPath = request.getSession().getServletContext().getRealPath("/");
            File file = new File(realPath,"image");
            if(!file.exists()){
                file.mkdirs();
            }
            System.out.println(aaa);
            System.out.println(description);
            aaa.transferTo(new File(file,aaa.getOriginalFilename()));
            System.out.println(realPath+"/image"+aaa.getOriginalFilename());
            Image image = new Image();
            image.setDescription(description);
            image.setThumbnail("/image/"+aaa.getOriginalFilename());
            imageService.save(image);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }
    @RequestMapping("/delete")
    @ResponseBody
    public void delete(String id){
        try {
            imageService.delete(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @RequestMapping("/queryAll")
    @ResponseBody
    public List<Image> queryAll(){
        List<Image> images = imageService.queryAll();
        return images;
    }
    @RequestMapping("/queryById")
    @ResponseBody
    public Image queryById(String id){
        Image image = imageService.queryById(id);
        return image;
    }
    @RequestMapping("/update")
    @ResponseBody
    public void update(Image image){

    }
}
