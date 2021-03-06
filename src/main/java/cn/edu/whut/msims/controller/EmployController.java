package cn.edu.whut.msims.controller;

import ch.qos.logback.core.joran.conditional.ElseAction;
import cn.edu.whut.msims.bean.EmePlanInfo;
import cn.edu.whut.msims.bean.EmployInfo;
import cn.edu.whut.msims.service.impl.EmployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class EmployController
{
    @Autowired
    EmployService employService;
    @RequestMapping("tologin.do")
    public String toLogin()
    {
        return "Login";
    }
    @RequestMapping("login.do")
    public String login(String username,String password,Model m)
    {
        EmployInfo employInfo = employService.getEmploy(username);
        if(employInfo != null && employInfo.getEmploy_passw().equals(password))
        {
            return "ShowEmployInfo";

        }else
        {
            m.addAttribute("err","用户名或密码错误");
            return "Login";
        }

    }
    @RequestMapping("toaddemploy.do")
    public String toAddEmploy ()
    {
        return "AddEmploy";
    }
    @RequestMapping("addemploy.do")
    public String addEmploy (EmployInfo employInfo)
    {
        System.out.println(employInfo.toString());
        employService.addEmploy(employInfo);
        return "AddEmploy";
    }
    @RequestMapping("/getemploy.do")
    public String toShowEmployInfo (Model m,String employ_num)
    {
        if(employ_num != null && employ_num.equals("") == false)
        {
            m.addAttribute("em",employService.getEmploy(employ_num));
        }
        return "ShowEmployInfo";
    }

    @RequestMapping("/updateemploy.do")
    public String updateEmploy (EmployInfo employInfo)
    {
        System.out.println(employInfo.toString());
        employInfo.setEmploy_exit(null);
        if(employInfo.getEmploy_passw().equals("") == true)
            employInfo.setEmploy_passw(null);
        employService.updateEmploy(employInfo);
        return "ShowEmployInfo";
    }
}
