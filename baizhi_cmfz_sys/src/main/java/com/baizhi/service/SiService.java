package com.baizhi.service;

import com.baizhi.dao.SiDao;
import com.baizhi.entity.Si;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2017/6/13 0013.
 */
public interface SiService {
    public void save(Si si);
    public void delete(String id);
    public void update(Si si);
    public List<Si> queryByType(String type);
    Si queryById(String id);
    List<Si> queryAll();
}
