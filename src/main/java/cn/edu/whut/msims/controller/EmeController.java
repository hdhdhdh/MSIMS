package cn.edu.whut.msims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
public class EmeController {
    @Autowired
    @RequestMapping("/EmeMain.do")
    public String hello() {
        return "EmeMain";
    }

    @RequestMapping("/EmeDir.do")
    public String dir() {
        return "EmeDir";
    }

    @RequestMapping("/EmeIns.do")
    public String ins() {
        return "EmeIns";
    }

    @RequestMapping("/EmePlan.do")
    public String plan() {
        return "EmePlan";
    }

    @RequestMapping("/EmeResou.do")
    public String resou() {
        return "EmeResou";
    }

    @RequestMapping("/EmeRes.do")
    public String res() {
        return "EmeRes";
    }
}
