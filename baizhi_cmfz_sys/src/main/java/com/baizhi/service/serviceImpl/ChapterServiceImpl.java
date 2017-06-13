package com.baizhi.service.serviceImpl;

import com.baizhi.dao.ChapterDao;
import com.baizhi.entity.Chapter;
import com.baizhi.service.ChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

/**
 * Created by Administrator on 2017/6/13 0013.
 */
@Service
@Transactional
public class ChapterServiceImpl implements ChapterService {
    @Autowired
    private ChapterDao chapterDao;

    public void save(Chapter chapter) {
        chapter.setId(UUID.randomUUID().toString());
        chapterDao.save(chapter);
    }

    public void delete(String id) {
        chapterDao.delete(id);
    }

    public Chapter queryById(String id) {
        Chapter chapter = chapterDao.queryById(id);
        return chapter;
    }

    public List<Chapter> queryAll() {
        List<Chapter> chapters = chapterDao.queryAll();
        return chapters;
    }
}