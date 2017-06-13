package com.baizhi.service.serviceImpl;

import com.baizhi.dao.SiDao;
import com.baizhi.entity.Si;
import com.baizhi.service.SiService;
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
public class SiServiceImpl implements SiService{
    @Autowired
    private SiDao siDao;
    public void save(Si si) {
        si.setId(UUID.randomUUID().toString());
        siDao.save(si);
    }

    public void delete(String id) {
        siDao.delete(id);
    }

    public void update(Si si) {
        siDao.update(si);
    }

    public List<Si> queryByType(String type) {
        List<Si> sis = siDao.queryByType(type);
        return sis;
    }

    public Si queryById(String id) {
        Si si = siDao.queryById(id);
        return si;
    }

    public List<Si> queryAll() {

        List<Si> sis = siDao.queryAll();
        return sis;
    }
}
