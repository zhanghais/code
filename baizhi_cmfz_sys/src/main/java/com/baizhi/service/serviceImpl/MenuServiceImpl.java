package com.baizhi.service.serviceImpl;

import com.baizhi.dao.MenuDao;
import com.baizhi.entity.Menu;
import com.baizhi.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/6/11 0011.
 */
@Service("menuService")
public class MenuServiceImpl  implements MenuService {
    @Autowired
    private MenuDao menuDao;

    public List<Menu> queryAll() {
        List<Menu> menus = menuDao.queryAll();
        return menus;
    }
}
