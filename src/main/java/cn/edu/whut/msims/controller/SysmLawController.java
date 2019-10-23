package cn.edu.whut.msims.controller;

import cn.edu.whut.msims.bean.SysmLawInfo;
import cn.edu.whut.msims.service.impl.SysmLawService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
//@RequestMapping("/sysm")
public class SysmLawController {
    @Autowired
    private SysmLawService sysmLawService;

    @RequestMapping("/main.do") //功能主界面
    public String sysm_main(){

        return "SysmMain";
    }

    @RequestMapping("/tolawadd.do") //跳转新增记录界面
    public  String sysmlaw_toadd(){
        return "SysmLawadd";
    }

    @RequestMapping("/todlawfind.do") //跳转查询记录界面
    public  String sysmlaw_tofind(){
        return "SysmLawfind";
    }

    @RequestMapping("/tolawupdate.do")   //跳转新增记录界面
    public  String sysmlaw_toupdate(){
        return "SysmLawdate";
    }

    //查询所有安全生产法律法规
    @RequestMapping("/lawadd.do")
    public String findAllLaw(Model model){
        List<SysmLawInfo> sysmLawInfos=null;
        sysmLawInfos=sysmLawService.findAllLaw();
        model.addAttribute("sysmLawInfos",sysmLawInfos);
        return "SysmMain";
    }

    //通过发文字号查询安全生产法律法规
   // @RequestMapping(value = "",method = RequestMethod.GET)
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
    //@RequestMapping(value = "",method = RequestMethod.GET)
    public String addLaw(SysmLawInfo sysmLawInfo){
        sysmLawService.addLaw(sysmLawInfo);
        return "";
    }

    //删除安全生产法律法规
   // @RequestMapping(value = "",method = RequestMethod.GET)
    public String delLaw(String law_num){
        sysmLawService.delLaw(law_num);
        return "";
    }

    //更新安全生产法律法规
    //@RequestMapping(value = "",method = RequestMethod.GET)
    public String updateLaw(SysmLawInfo sysmLawInfo){
        sysmLawService.updateLaw(sysmLawInfo);
        return "";
    }

    //上传文档

    @PostMapping("/upload")
    public String upload(@RequestParam("filebody") MultipartFile file) {

        try {
            String fileUploadPath = "D:\\....";

            File uploadedFile = new File(fileUploadPath, file.getOriginalFilename());
            uploadedFile.createNewFile();

            FileOutputStream fileOutputStream = new FileOutputStream(uploadedFile);
            fileOutputStream.write(file.getBytes());
            fileOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
            return "error:" + e.getMessage();
        }
        return "ok";
    }

    //下载文档
    @GetMapping("/download/{id}") //ResponseEntity<Resource>
    public Object download(@PathVariable("id") Long id) {

        //...

        String fileName = "xxxx.jpg";
        File file = new File("D:\\xxxx.jpg");

        try {
            InputStreamResource resource = new InputStreamResource(new FileInputStream(file));

            return ResponseEntity.ok()
                    .header("Content-disposition","attachment;filename=" + fileName)

                    .contentLength(file.length())
                    .contentType(MediaType.parseMediaType("application/octet-stream"))
                    .body(resource);
        }catch(Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body(e.getMessage());
        }

    }
}
