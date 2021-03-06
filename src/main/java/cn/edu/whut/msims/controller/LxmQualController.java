package cn.edu.whut.msims.controller;

import cn.edu.whut.msims.bean.LxmQualInfo;
import cn.edu.whut.msims.bean.SpecialInfo;
import cn.edu.whut.msims.service.IDnmDnService;
import cn.edu.whut.msims.service.ILxmQualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.xml.ws.RequestWrapper;
import java.sql.Date;
import java.util.List;

@Controller
@RequestMapping("/Lxm")
public class LxmQualController {
    @Autowired
    private ILxmQualService iLxmQualService;
    @RequestMapping("/qual.do")
    public String qual_main(){
        return "LxmQual";
    }
    @RequestMapping("/expirequal.do")//跳转到过期页面
    public String findExpiredQual(Model m){

        List<LxmQualInfo> specialInfoList = iLxmQualService.findExpiredQual(new Date(new java.util.Date().getTime()));
        System.out.println(specialInfoList.toString());
        m.addAttribute("all",specialInfoList);
        return "LxmExpireQual";
    }
    @RequestMapping("/findAll.do")//跳转到显示所有证书页面
    public ModelAndView qual_findAll(){
        ModelAndView mv =new ModelAndView();
        List<LxmQualInfo> all=iLxmQualService.findAllQual();
        mv.addObject("lxmQualInfos",all);
        mv.setViewName("LxmQual-list");
        return mv;
    }
    @RequestMapping("/toaddqual.do")//跳转到增加证书界面
    public String qual_toadd(){
        return "LxmQual-add";
    }
    @RequestMapping("/addqual.do")//跳转到显示所有证书界面
    public String qual_add(LxmQualInfo lxmQualInfo){
        iLxmQualService.addQual(lxmQualInfo);
        return "redirect:/Lxm/findAll.do";
    }
    @RequestMapping("/toupdatequal.do")//跳转到更改证书信息界面
    public ModelAndView qual_toupdate(String qual_num){
        ModelAndView mv =new ModelAndView();
        LxmQualInfo lxm=iLxmQualService.QueryByNum(qual_num);
        mv.addObject("qualup",lxm);
        mv.setViewName("LxmQual-update");
        return mv;
    }
    @RequestMapping("/updatequal.do")//跳转到显示所有证书界面
    public String qual_update(LxmQualInfo lxmQualInfo){
        iLxmQualService.updateQual(lxmQualInfo);
        return "redirect:/Lxm/findAll.do";
    }

    @RequestMapping("/deletequal.do")//跳转到显示所有证书界面
    public String qual_delete(String qual_num) {
        System.out.println(qual_num);
        iLxmQualService.deleteQualByNum(qual_num);
        return "redirect:/Lxm/findAll.do";
    }
    @RequestMapping("/findnum.do")//跳转到查询的证书页面
    public ModelAndView qual_findnum(String qual_num){
        ModelAndView mv=new ModelAndView();
        System.out.println(qual_num);
        LxmQualInfo select= iLxmQualService.QueryByNum(qual_num);
        mv.addObject("qualfind",select);
        mv.setViewName("LxmQual-finded");
        return mv;
    }
}
