package cn.edu.whut.msims.controller;

import cn.edu.whut.msims.bean.DnmDnInfo;
import cn.edu.whut.msims.service.IDnmDnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dnm")
public class DnmDnController {

    @Autowired
    private IDnmDnService iDnmDnService;

    @RequestMapping("/main.do") //功能主界面
    public String dnm_main(){

        return "DnmMain";
    }

    @RequestMapping("/dnmain.do")//跳转粉尘主界面
    public  String dnmdn_main(){
        return "DnmDnmain";
    }

    @RequestMapping("/todnadd.do") //跳转新增记录界面
    public  String dnmdn_toadd(){
        return "DnmDnadd";
    }

    @RequestMapping("/todnfind.do") //跳转查询记录界面
    public  String dnmdn_tofind(){
        return "DnmDnfind";
    }

    @RequestMapping("/todnupdate.do")   //跳转新增记录界面
    public  String dnmdn_toupdate(){
        return "DnmDnupdate";
    }

    @RequestMapping("/dnadd.do")   //新增采样记录
    public String dnmdn_add(DnmDnInfo dnmDnInfo){
        double dusta,noisea;
        dusta=(dnmDnInfo.getDuno_dust1()+dnmDnInfo.getDuno_dust2()+dnmDnInfo.getDuno_dust3())/3;
        dnmDnInfo.setDuno_dusta(dusta);
        noisea=(dnmDnInfo.getDuno_noise1()+dnmDnInfo.getDuno_noise2()+dnmDnInfo.getDuno_noise3())/3;
        dnmDnInfo.setDuno_noisea(noisea);
        iDnmDnService.addDnmDn(dnmDnInfo);
        return ("DnmDnmain");
    }



}
