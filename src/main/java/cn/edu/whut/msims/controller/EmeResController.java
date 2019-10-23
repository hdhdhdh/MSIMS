package cn.edu.whut.msims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/res")
public class EmeResController {
    @Autowired
    @RequestMapping("/EmeRes.do")
    public String hello() {
        return "EmeRes";
    }

    @RequestMapping("/EmeResadd.do")
    public String add() {
        return "EmeResadd";
    }

    @RequestMapping("/EmeResdelete.do")
    public String delete() {
        return "EmeResdelete";
    }

    @RequestMapping("/EmeResfind.do")
    public String select() {
        return "EmeResfind";
    }

    @RequestMapping("/EmeResupdate.do")
    public String update() {
        return "EmeResupdat";
    }

}
