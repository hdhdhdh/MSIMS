package cn.edu.whut.msims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/plan")
public class EmePlanController {
    @Autowired
    @RequestMapping("/EmePlan.do")
    public String hello() {
        return "EmePlan";
    }

    @RequestMapping("/EmePlanadd.do")
    public String add() {
        return "EmePlanadd";
    }

    @RequestMapping("/EmePlandelete.do")
    public String delete() {
        return "EmePlandelete";
    }

    @RequestMapping("/EmePlanfind.do")
    public String select() {
        return "EmePlanfind";
    }

    @RequestMapping("/EmePlanupdate.do")
    public String update() {
        return "EmePlanupdat";
    }
}
