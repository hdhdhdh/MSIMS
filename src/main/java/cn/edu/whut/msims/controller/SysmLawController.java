package cn.edu.whut.msims.controller;

import cn.edu.whut.msims.bean.SysmLawInfo;
import cn.edu.whut.msims.service.impl.SysmLawService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SysmLawController {
    @Autowired
    private SysmLawService sysmLawService;

    //查询所有安全生产法律法规
    @RequestMapping(value = "",method = RequestMethod.GET)
    public String findAllLaw(Model model){
        List<SysmLawInfo> sysmLawInfos=null;
        sysmLawInfos=sysmLawService.findAllLaw();
        model.addAttribute("sysmLawInfos",sysmLawInfos);
        return " ";
    }

    //通过发文字号查询安全生产法律法规
    @RequestMapping(value = "",method = RequestMethod.GET)
    public String findLawById(String law_num,Model model){
        SysmLawInfo sysmLawInfo=null;
        System.out.println(law_num);
        List<SysmLawInfo> sysmLawInfos=new ArrayList<SysmLawInfo>();
        sysmLawInfo=sysmLawService.findLawById(law_num);
        if(sysmLawInfo!=null){
            sysmLawInfos.add(sysmLawInfo);
        }else{
            sysmLawInfos=sysmLawService.findAllLaw();
        }
        System.out.println(sysmLawInfos);
        model.addAttribute("sysmLawInfos",sysmLawInfos);
        return "";
    }

    //增加安全生产法律法规
    @RequestMapping(value = "",method = RequestMethod.GET)
    public String addLaw(SysmLawInfo sysmLawInfo){
        sysmLawService.addLaw(sysmLawInfo);
        return "";
    }

    //删除安全生产法律法规
    @RequestMapping(value = "",method = RequestMethod.GET)
    public String delLaw(String law_num){
        sysmLawService.delLaw(law_num);
        return "";
    }

    //更新安全生产法律法规
    @RequestMapping(value = "",method = RequestMethod.GET)
    public String updateLaw(SysmLawInfo sysmLawInfo){
        sysmLawService.updateLaw(sysmLawInfo);
        return "";
    }
}
