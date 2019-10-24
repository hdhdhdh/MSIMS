package cn.edu.whut.msims.controller;

import cn.edu.whut.msims.bean.EmeInsInfo;
import cn.edu.whut.msims.service.impl.EmeInsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/ins")
public class EmeInsController {
    EmeInsService emeInsService;
    @RequestMapping("/EmeIns.do")
    public String hello() {
        return "EmeIns";
    }

    @RequestMapping("/EmeInsadd.do")
    public String add() {
        return "EmeInsadd";
    }

    @RequestMapping("/EmeInsdelete.do")
    public String delete() {
        return "EmeInsdelete";
    }

    @RequestMapping("/Emefindall.do")
    public ModelAndView findAllIns()
    {
        ModelAndView mv=new ModelAndView();
        List<EmeInsInfo> emeInss=emeInsService.findAllIns();
        mv.addObject("emeDirInfos",emeInss);
        mv.setViewName("EmeInsfind");
        return mv;
    }

    @RequestMapping("/EmeInsupdate.do")
    public String update() {
        return "EmeInsupdate";
    }
}
