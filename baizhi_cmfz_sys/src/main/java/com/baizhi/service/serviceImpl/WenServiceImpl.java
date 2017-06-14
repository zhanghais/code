package com.baizhi.service.serviceImpl;

import com.baizhi.dao.ChapterDao;
import com.baizhi.dao.WenDao;
import com.baizhi.entity.Wen;
import com.baizhi.service.WenService;
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
public class WenServiceImpl implements WenService {
    @Autowired
    private WenDao wenDao;
    @Autowired
    private ChapterDao chapterDao;
    public void save(Wen wen) {
        wenDao.save(wen);
    }

    public void delete(String id) {
        chapterDao.deleteByWenId(id);
        wenDao.delete(id);
    }

    public void update(Wen wen) {
        wenDao.update(wen);
    }

    public Wen queryById(String id) {
        Wen wen = wenDao.queryById(id);
        return wen;
    }

    public List<Wen> queryAll() {
        List<Wen> wens = wenDao.queryAll();
        return wens;
    }
}
