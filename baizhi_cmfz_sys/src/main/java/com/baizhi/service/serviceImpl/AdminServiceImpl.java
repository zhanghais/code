package com.baizhi.service.serviceImpl;

import com.baizhi.dao.AdminDao;
import com.baizhi.entity.Admin;
import com.baizhi.service.AdminService;
import com.baizhi.test.MD5Utils;
import com.baizhi.test.Saltutils;
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
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminDao adminDao;

    public void regist(Admin admin) {
        admin.setId(UUID.randomUUID().toString());
        String password = admin.getPassword();
        String salt = Saltutils.getSalt(6);
        admin.setSalt(salt);
        String digest = MD5Utils.getDigest(password + salt);
        admin.setPassword(digest);
        adminDao.save(admin);
    }

    public List<Admin> queryAll() {
        List<Admin> admins = adminDao.queryAll();
        return admins;
    }

    public Admin login(String name, String password) {
        Admin admin = adminDao.queryByName(name);
        if(admin!=null){
            String passwordDb = admin.getPassword();
            String salt = admin.getSalt();
            String newpwd = MD5Utils.getDigest(password + salt);
            if(newpwd.equals(passwordDb)){
                return admin;
            }else{
                throw new RuntimeException("密码错误");
            }
        }else{
            throw new RuntimeException("用户名不存在");
        }
    }
}
