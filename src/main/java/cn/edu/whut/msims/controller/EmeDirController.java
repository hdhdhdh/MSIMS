package cn.edu.whut.msims.controller;

import cn.edu.whut.msims.bean.EmeDirInfo;
import cn.edu.whut.msims.service.impl.EmeDirService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/dir")
public class EmeDirController {
    @Autowired
    EmeDirService emeDirService;
    @RequestMapping("/EmeDir.do")
    public String hello() {
        return "EmeDir";
    }

    @RequestMapping("/toEmeDiradd.do")
    public String toaddDir(){
        return "EmeDiradd";
    }

    @RequestMapping("/EmeDiradd.do")
    public String addDir(EmeDirInfo emeDirInfo){
        emeDirService.addEmeDir(emeDirInfo);
        return "redirect:Emefindall.do";
    }
    @RequestMapping("/toEmeDirdelete.do")
    public String delete() {
        return "EmeDirdelete";
    }

    @RequestMapping("/Emefindall.do")
    public ModelAndView findAllDir()
    {
        ModelAndView mv=new ModelAndView();
        List<EmeDirInfo> emeDirs=emeDirService.findAllDir();
        mv.addObject("emeDirInfos",emeDirs);
        mv.setViewName("EmeDirfind");
        return mv;
    }
    @RequestMapping("/Emedelete.do")
    public String delDir(String drill_num){
        emeDirService.delDir(drill_num);
        return "redirect:Emefindall.do";
    }

    @RequestMapping("/dirfind.do")
    public String findDirById(String law_num,Model model){
        EmeDirInfo EmeDirInfo=null;
        System.out.println(law_num);
        List<EmeDirInfo> EmeDirInfos=new ArrayList<EmeDirInfo>();
        //EmeDirInfo=emeDirService.findLawById(law_num);
        if(EmeDirInfo!=null){
            EmeDirInfos.add(EmeDirInfo);
        }else{
            EmeDirInfos=emeDirService.findAllDir();
        }
        System.out.println(EmeDirInfos);
        model.addAttribute("EmeDirInfos",EmeDirInfos);
        return "";
    }
    @RequestMapping("/toEmeDirupdate.do")
    public String update() {
        return "EmeDirupdat";
    }

}

