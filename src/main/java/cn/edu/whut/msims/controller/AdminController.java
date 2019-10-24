package cn.edu.whut.msims.controller;

import cn.edu.whut.msims.bean.AdminInfo;
import cn.edu.whut.msims.service.impl.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController
{
    @Autowired
    AdminService adminService;
    @RequestMapping("tomain.do")
    public  String  toMian()
    {
        return "main";
    }
    @RequestMapping("toadminlogin.do")
    public  String  toAdminLogin()
    {
        return "AdminLogin";
    }
    @RequestMapping("adminlogin.do")
    public  String  adminLogin(AdminInfo adminInfo, Model m)
    {
        AdminInfo adminInfo1 = adminService.getAdminByID(adminInfo.getAdmin_id());
        if(adminInfo1 != null && adminInfo.getAdmin_password().equals(adminInfo1.getAdmin_password()))
        {
            return "main";
        }else
        {
            m.addAttribute("err","用户名或密码错误");
            return "AdminLogin";
        }

    }
}
