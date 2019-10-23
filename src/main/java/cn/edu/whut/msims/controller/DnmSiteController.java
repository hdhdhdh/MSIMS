package cn.edu.whut.msims.controller;

import cn.edu.whut.msims.bean.DnmSiteInfo;
import cn.edu.whut.msims.service.IDnmSiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/dnm")
public class DnmSiteController {

    @Autowired
    private IDnmSiteService iDnmSiteService;

    @RequestMapping("/sitemain.do")//跳转采样点主界面
    public ModelAndView dnmsite_main(){
        ModelAndView mv=new ModelAndView();
        List<DnmSiteInfo> all= iDnmSiteService.finddnmsiteall();
        mv.addObject("dns",all);
        mv.setViewName("DnmSitemain");
        return mv;

    }

    @RequestMapping("/tositeadd.do") //跳转新增记录界面
    public  String dnmsite_toadd(){
        return "DnmSiteadd";
    }

    @RequestMapping("/siteadd.do") //新增
    public String dnsite_add(DnmSiteInfo dnmSiteInfo){
        iDnmSiteService.addDnmSite(dnmSiteInfo);
        return "redirect:sitemain.do";
//        return "DnmSitemain";
    }
    @RequestMapping("/sitedelete.do") //删除
    public String dnsite_delete(String site_id){
        iDnmSiteService.deleteDnmSite(site_id);
        return "redirect:sitemain.do";
//        return "DnmSitemain";
    }
    @RequestMapping("/tositeupdate.do")  //跳转至更新
    public ModelAndView dnsite_toupdate(String site_id){
        ModelAndView mv4=new ModelAndView();
        DnmSiteInfo dm4;
        dm4=iDnmSiteService.querysite(site_id);
        mv4.addObject("dms",dm4);
        mv4.setViewName("DnmSiteupdate");
        return  mv4;

    }
    @RequestMapping("/siteupdate.do")  //更新
    public String dnsite_update(DnmSiteInfo dnmSiteInfo){
        iDnmSiteService.updateDnmSite(dnmSiteInfo);
        return "redirect:sitemain.do";
    }


}
