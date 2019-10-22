package cn.edu.whut.msims.controller;

import cn.edu.whut.msims.bean.SysmPreveInfo;
import cn.edu.whut.msims.service.impl.SysmPreveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SysmPreveController {
    @Autowired
    private SysmPreveService sysmPreveService;

    //查询所有双重预防机制文件
    @RequestMapping(value = "",method = RequestMethod.GET)
    public String findAllPreve(Model model){
        List<SysmPreveInfo> sysmPreveInfos=null;
        sysmPreveInfos=sysmPreveService.findAllPreve();
        model.addAttribute("sysmPreveInfos",sysmPreveInfos);
        return " ";
    }

    //通过发文字号查询双重预防机制文件
    @RequestMapping(value = "",method = RequestMethod.GET)
    public String findPreveById(String preve_num,Model model){
        SysmPreveInfo sysmPreveInfo=null;
        System.out.println(preve_num);
        List<SysmPreveInfo> sysmPreveInfos=new ArrayList<SysmPreveInfo>();
        sysmPreveInfo=sysmPreveService.findPreveById(preve_num);
        if(sysmPreveInfo!=null){
            sysmPreveInfos.add(sysmPreveInfo);
        }else{
            sysmPreveInfos=sysmPreveService.findAllPreve();
        }
        System.out.println(sysmPreveInfos);
        model.addAttribute("sysmPreveInfos",sysmPreveInfos);
        return "";
    }

    //增加双重预防机制文件
    @RequestMapping(value = "",method = RequestMethod.GET)
    public String addPreve(SysmPreveInfo sysmPreveInfo){
        sysmPreveService.addPreve(sysmPreveInfo);
        return "";
    }

    //删除双重预防机制文件
    @RequestMapping(value = "",method = RequestMethod.GET)
    public String delPreve(String law_num){
        sysmPreveService.delPreve(law_num);
        return "";
    }

    //更新双重预防机制文件
    @RequestMapping(value = "",method = RequestMethod.GET)
    public String updateLaw(SysmPreveInfo sysmpreveInfo){
        sysmPreveService.updatePreve(sysmpreveInfo);
        return "";
    }
}
