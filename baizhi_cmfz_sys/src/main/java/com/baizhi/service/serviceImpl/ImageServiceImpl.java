package com.baizhi.service.serviceImpl;

import com.baizhi.dao.ImageDao;
import com.baizhi.entity.Image;
import com.baizhi.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

/**
 * Created by Administrator on 2017/6/12 0012.
 */
@Service
@Transactional
public class ImageServiceImpl implements ImageService {
   @Autowired
   private ImageDao imageDao;
    public void save(Image image) {
        image.setId(UUID.randomUUID().toString());
        imageDao.save(image);
    }

    public void delete(String id) {
        imageDao.delete(id);
    }

    public void update(Image image) {
        imageDao.update(image);
    }

    public Image queryById(String id) {
        Image image = imageDao.queryById(id);
        return image;
    }

    public List<Image> queryAll() {
        List<Image> images = imageDao.queryAll();
        return images;
    }
}
