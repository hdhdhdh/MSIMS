package cn.edu.whut.msims.controller;

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
    @RequestMapping("addemploy")
    public String addEmploy ()
    {
        return null;
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

    @RequestMapping("updateemploy")
    public String updateEmploy ()
    {
        return null;

    }
}
