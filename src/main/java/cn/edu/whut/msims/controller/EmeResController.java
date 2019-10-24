package cn.edu.whut.msims.controller;

import cn.edu.whut.msims.bean.EmeResInfo;
import cn.edu.whut.msims.service.impl.EmeResService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/res")
public class EmeResController {
    @Autowired
    EmeResService emeResService;
    @RequestMapping("/EmeRes.do")
    public String hello() {
        return "EmeRes";
    }

    @RequestMapping("/toEmeResadd.do")
    public String toaddRes(){
        return "EmeResadd";
    }

    @RequestMapping("/EmeResadd.do")
    public String addRes(EmeResInfo emeResInfo){
        emeResService.addEmeRes(emeResInfo);
        return "redirect:Emefindall.do";
    }
    @RequestMapping("/toEmeResdelete.do")
    public String delete() {
        return "EmeResdelete";
    }

    @RequestMapping("/Emefindall.do")
    public ModelAndView findAllRes()
    {
        ModelAndView mv=new ModelAndView();
        List<EmeResInfo> emeRess=emeResService.findAllRes();
        mv.addObject("emeResInfos",emeRess);
        mv.setViewName("EmeResfind");
        return mv;
    }
    @RequestMapping("/Emedelete.do")
    public String delRes(String rescue_num){
        emeResService.delRes(rescue_num);
        return "redirect:Emefindall.do";
    }

    @RequestMapping("/Resfind.do")
    public String findResById(String law_num, Model model){
        EmeResInfo EmeResInfo=null;
        System.out.println(law_num);
        List<EmeResInfo> EmeResInfos=new ArrayList<EmeResInfo>();
        //EmeResInfo=emeResService.findLawById(law_num);
        if(EmeResInfo!=null){
            EmeResInfos.add(EmeResInfo);
        }else{
            EmeResInfos=emeResService.findAllRes();
        }
        System.out.println(EmeResInfos);
        model.addAttribute("EmeResInfos",EmeResInfos);
        return "";
    }
    @RequestMapping("/toEmeResupdate.do")
    public String update() {
        return "EmeResupdat";
    }

}
