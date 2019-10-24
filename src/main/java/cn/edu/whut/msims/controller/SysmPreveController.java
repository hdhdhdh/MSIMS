package cn.edu.whut.msims.controller;

import cn.edu.whut.msims.bean.SysmPreveInfo;
import cn.edu.whut.msims.service.impl.SysmPreveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/sysm")
public class SysmPreveController {
    @Autowired
    private SysmPreveService sysmPreveService;

    @RequestMapping("/topreveadd.do") //跳转新增记录界面
    public  String sysmpreve_toadd(){ return "SysmPreveadd"; }

    @RequestMapping("/todprevefind.do") //跳转查询记录界面
    public  String sysmpreve_tofind(){
        return "SysmPrevefind";
    }

    @RequestMapping("/topreveupdate.do")   //跳转新增记录界面
    public  ModelAndView sysmpreve_toupdate(String preve_num){
        ModelAndView mv=new ModelAndView();
        SysmPreveInfo sp= sysmPreveService.findPreveById(preve_num);
        mv.addObject("preveup",sp);
        mv.setViewName("SysmPreveupdate");
        return mv;
    }
    //查询所有双重预防机制文件
    @RequestMapping("/prevefindall.do")
    public ModelAndView findAllPreve(){
        ModelAndView mv=new ModelAndView();
        List<SysmPreveInfo> sysmPreveInfos=sysmPreveService.findAllPreve();
        mv.addObject("sysmPreveInfos",sysmPreveInfos);
        mv.setViewName("SysmPrevefind");
        return mv;
    }

    //通过发文字号查询双重预防机制文件
    @RequestMapping("/prevefind")
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
    @RequestMapping("/preveadd.do")
    public String addPreve(SysmPreveInfo sysmPreveInfo){
        sysmPreveService.addPreve(sysmPreveInfo);
        return "redirect:prevefindall.do";
    }

    //删除双重预防机制文件
    @RequestMapping("/prevedelete.do")
    public String delPreve(String preve_num){
        sysmPreveService.delPreve(preve_num);
        return "redirect:prevefindall.do";
    }

    //更新双重预防机制文件
    @RequestMapping("/preveupdate.do")
    public String updateLaw(SysmPreveInfo sysmpreveInfo){
        sysmPreveService.updatePreve(sysmpreveInfo);
        return "redirect:prevefindall.do";
    }

//    @PostMapping("/upload")
//    public String upload(@RequestParam("filebody") MultipartFile file) {
//
//        try {
//            String fileUploadPath = "D:\\....";
//
//            File uploadedFile = new File(fileUploadPath, file.getOriginalFilename());
//            uploadedFile.createNewFile();
//
//            FileOutputStream fileOutputStream = new FileOutputStream(uploadedFile);
//            fileOutputStream.write(file.getBytes());
//            fileOutputStream.close();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//            return "error:" + e.getMessage();
//        }
//        return "ok";
//    }
//
//    //下载文档
//    @GetMapping("/download/{id}") //ResponseEntity<Resource>
//    public Object download(@PathVariable("id") Long id) {
//
//        //...
//
//        String fileName = "xxxx.jpg";
//        File file = new File("D:\\xxxx.jpg");
//
//        try {
//            InputStreamResource resource = new InputStreamResource(new FileInputStream(file));
//
//            return ResponseEntity.ok()
//                    .header("Content-disposition","attachment;filename=" + fileName)
//
//                    .contentLength(file.length())
//                    .contentType(MediaType.parseMediaType("application/octet-stream"))
//                    .body(resource);
//        }catch(Exception e) {
//            e.printStackTrace();
//            return ResponseEntity.status(500).body(e.getMessage());
//        }
//
//    }
}
