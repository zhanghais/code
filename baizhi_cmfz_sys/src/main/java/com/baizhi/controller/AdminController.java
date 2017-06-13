package com.baizhi.controller;

import com.baizhi.entity.Admin;
import com.baizhi.service.AdminService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Administrator on 2017/6/12 0012.
 */
@Controller
@Scope("prototype")
@RequestMapping("/admin")
public class AdminController {
    @Resource
    private AdminService adminService;
    @RequestMapping("/regist")
    public String regist(Admin admin){
        try {
            adminService.regist(admin);
            return "redirect:/back/main/admin/login.jsp";
        }catch (Exception e){
            e.printStackTrace();
            return "redirect:/back/main/admin/regist.jsp";
        }
    }
    @RequestMapping("/login")
    public String login(String name,String password){
        Admin admin= adminService.login(name, password);
        if(admin!=null){
            return "redirect:/back/main/main.jsp";
        }else{
            return "redirect:/back/main/admin/login.jsp";
        }
    }
    @RequestMapping("/queryAll")
    public String queryAll(HttpServletRequest request){
        List<Admin> admins = adminService.queryAll();
        request.setAttribute("admins",admins);
        return null;
    }
}
