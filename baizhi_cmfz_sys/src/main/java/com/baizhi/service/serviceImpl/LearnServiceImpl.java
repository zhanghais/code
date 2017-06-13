package com.baizhi.service.serviceImpl;

import com.baizhi.dao.LearnDao;
import com.baizhi.entity.Learn;
import com.baizhi.service.LearnService;
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
public class LearnServiceImpl implements LearnService {
    @Autowired
    private LearnDao learnDao;

    public void save(Learn learn) {
        learn.setId(UUID.randomUUID().toString());
        learn.setType("必修课");
        learnDao.save(learn);
    }

    public void delete(String id) {
        learnDao.delete(id);
    }

    public void update(Learn learn) {
        learnDao.update(learn);
    }

    public Learn queryById(String id) {
        Learn learn = learnDao.queryById(id);
        return learn;
    }

    public List<Learn> queryAll() {
        List<Learn> learns = learnDao.queryAll();
        return learns;
    }
}
