package com.baizhi.test;

import com.baizhi.dao.MenuDao;
import com.baizhi.entity.Menu;
import com.baizhi.service.MenuService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-basic.xml");
        MenuService menuDao = (MenuService) context.getBean("menuService");
        List<Menu> menus = menuDao.queryAll();
        for (Menu menu : menus) {
            System.out.println(menu);

        }
        long a=8;
        String s = String.valueOf(a);
        Integer integer = Integer.valueOf(s);
        int c = 1 ;

    }
}
