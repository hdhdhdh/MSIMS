package cn.edu.whut.msims.controller;

import cn.edu.whut.msims.bean.DnmDnInfo;
import cn.edu.whut.msims.bean.DnmMineInfo;
import cn.edu.whut.msims.bean.DnmSiteInfo;
import cn.edu.whut.msims.service.IDnmDnService;
import cn.edu.whut.msims.service.IDnmMineService;
import cn.edu.whut.msims.service.IDnmSiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.sql.Date;
import java.util.List;

@Controller
@RequestMapping("/dnm")
public class DnmStaController {
    @Autowired
    private IDnmDnService iDnmDnService;

    @Autowired

    private IDnmMineService iDnmMineService;

    @Autowired
    private IDnmSiteService iDnmSiteService;

    @RequestMapping("/stamain.do")    //跳转至统计主界面
    protected  String staMain(){
        return "DnmStamain";
    }

    @RequestMapping("/tostaDfind.do")  //
    public String  tostaDfind(){
        return "DnmStaDfind";
    }
    @RequestMapping("/tostaCfind.do")   //
    public String  tostaCfind(){
        return "DnmStaCfind";
    }
    @RequestMapping("/tostaTfind.do")  //
    public String  tostaTfind(){
        return "DnmStaTfind";
    }
    @RequestMapping("/staDfind.do")       //通过时间和场所查询所有的记录
    public ModelAndView dnmsta_Dfind(String site_place,Date date){

        String site_id;
        DnmSiteInfo siteInfo=iDnmSiteService.queryplace(site_place);

        site_id=siteInfo.getSite_id();
        ModelAndView mv=new ModelAndView();
        List<DnmDnInfo> dn=iDnmDnService.dnfindbydateid(site_id,date);
        mv.addObject("dndateid",dn);

        List<DnmMineInfo> dm=iDnmMineService.minefindbydateid(site_id,date);
        mv.addObject("dmdateid",dm);
        mv.setViewName("DnmStaDfind");
        return mv;
    }

    @RequestMapping("/staTfind.do")     //根据时间段查询
    public ModelAndView dnmsta_Tfind(Date date1,Date date2){

        ModelAndView mvd=new ModelAndView();
        List<DnmDnInfo> dnds=iDnmDnService.dnfindbydates(date1,date2);
        mvd.addObject("dndates",dnds);

        List<DnmMineInfo> dmds=iDnmMineService.minefindbydates(date1,date2);
        mvd.addObject("dmdates",dmds);
        mvd.setViewName("DnmStaTfind");
        return mvd;

    }

    @RequestMapping("/staCfind.do")
    public ModelAndView dnmsta_Cfind(HttpServletRequest request,String site_kind){
        ModelAndView mv=new ModelAndView();

        return mv;
    }


}
