package com.baizhi.service.serviceImpl;

import com.baizhi.dao.ReflectDao;
import com.baizhi.entity.Reflect;
import com.baizhi.service.ReflectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2017/6/13 0013.
 */
@Service
@Transactional
public class ReflectServiceImpl implements ReflectService{
    @Autowired
    private ReflectDao reflectDao;

    public void delete(String id) {
        reflectDao.delete(id);
    }

    public List<Reflect> queryAll() {
        List<Reflect> reflects = reflectDao.queryAll();
        return reflects;
    }
}
