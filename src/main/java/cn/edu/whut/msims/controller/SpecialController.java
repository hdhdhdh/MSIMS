package cn.edu.whut.msims.controller;

import cn.edu.whut.msims.bean.EmployInfo;
import cn.edu.whut.msims.bean.SpecialInfo;
import cn.edu.whut.msims.service.impl.EmployService;
import cn.edu.whut.msims.service.impl.SpecialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.awt.*;
import java.io.FileOutputStream;
import java.sql.Date;
import java.util.List;

@Controller
public class SpecialController
{
    @Autowired
    SpecialService specialService;
    @RequestMapping("toaddspecial.do")
    public String toAddSpecial ()
    {
        return "AdddSpecialInfo";
    }
    @RequestMapping("addspecial.do")
    public String addSpecial (SpecialInfo specialInfo,@RequestParam("filebody") MultipartFile file)
    {
        System.out.println(specialInfo.toString());
        specialService.addSpecial(specialInfo);
        try {
            String fileUploadPath = "D:\\upload\\special\\";

            File uploadedFile = new File(fileUploadPath,specialInfo.getSpecial_id());
            uploadedFile.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(uploadedFile);
            fileOutputStream.write(file.getBytes());
            fileOutputStream.close();

        }catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("文件保存失败");
        }
        return "AdddSpecialInfo";
    }
    @RequestMapping("/getspecial.do")
    public String showSpecialInfo (Model m, String employ_num)
    {
        if(employ_num != null && employ_num.equals("") == false)
        {
            List<SpecialInfo> specialInfoList = specialService.getSpeciaByEmp(employ_num);
            System.out.println(specialInfoList.toString());
            m.addAttribute("all",specialInfoList);
        }
        return "GetSpecialInfo";
    }

    @RequestMapping("/getexpiryspecial.do")
    public String getExpirySpecial (Model m)
    {
        List<SpecialInfo> specialInfoList = specialService.getExpirySpecial(new Date(new java.util.Date().getTime()));
        System.out.println(specialInfoList.toString());
        m.addAttribute("all",specialInfoList);
        return "GetExpirySpecialInfo";
    }
    @RequestMapping("tospecialpic.do")
    public String toSpecialPic(String special_id,Model m)
    {
        m.addAttribute("picname",special_id+".jpg");
        return "SpecialPic";
    }
}
