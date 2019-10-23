package cn.edu.whut.msims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/resou")
public class EmeResouController {
    @Autowired
    @RequestMapping("/EmeResou.do")
    public String hello() {
        return "EmeResou";
    }

    @RequestMapping("/EmeResouadd.do")
    public String add() {
        return "EmeResouadd";
    }

    @RequestMapping("/EmeResoudelete.do")
    public String delete() {
        return "EmeResoudelete";
    }

    @RequestMapping("/EmeResoufind.do")
    public String select() {
        return "EmeResoufind";
    }

    @RequestMapping("/EmeResouupdate.do")
    public String update() {
        return "EmeResouupdat";
    }
}
