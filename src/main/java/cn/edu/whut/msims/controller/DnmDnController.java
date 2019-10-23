package cn.edu.whut.msims.controller;

import cn.edu.whut.msims.bean.DnmDnInfo;
import cn.edu.whut.msims.service.IDnmDnService;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Date;
import java.util.List;

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

    @RequestMapping("/dnidfind.do")       //通过采样点id查询所有的记录
    public ModelAndView dnmdn_idfind(String site_id){
        ModelAndView mv1=new ModelAndView();
        List<DnmDnInfo> dn1= iDnmDnService.findidDnmDn(site_id);
        mv1.addObject("dnmdninfos",dn1);
        mv1.setViewName("DnmDnfind");
        return mv1;
    }

    @RequestMapping("/dndatefind.do")       //通过采样点时间查询所有的记录
    public ModelAndView dnmdn_datefind(Date duno_date){
        ModelAndView mv2=new ModelAndView();
        List<DnmDnInfo> dn2= iDnmDnService.finddateDnmDn(duno_date);
        mv2.addObject("dnmdninfos",dn2);
        mv2.setViewName("DnmDnfind");
        return mv2;
    }

    @RequestMapping("/dndelete.do")     //删除记录
    public String dnmdn_delete(Integer duno_num){
        iDnmDnService.deleteDnmDn(duno_num);
        return "DnmDnfind";
    }

    @RequestMapping("/todnupdate.do")
    public ModelAndView dnmdn_toupdate(int duno_num){
        ModelAndView mv3=new ModelAndView();
        DnmDnInfo dn3;
        dn3=iDnmDnService.querydn(duno_num);
        mv3.addObject("dnu",dn3);
        mv3.setViewName("DnmDnupdate");
        return mv3;
    }

    @RequestMapping("/dnupdate.do")
    public String dnmdn_update(DnmDnInfo dnmDnInfo){

        double dusta,noisea;
        dusta=(dnmDnInfo.getDuno_dust1()+dnmDnInfo.getDuno_dust2()+dnmDnInfo.getDuno_dust3())/3;
        dnmDnInfo.setDuno_dusta(dusta);
        noisea=(dnmDnInfo.getDuno_noise1()+dnmDnInfo.getDuno_noise2()+dnmDnInfo.getDuno_noise3())/3;
        dnmDnInfo.setDuno_noisea(noisea);

        iDnmDnService.updateDnmDn(dnmDnInfo);
//        dnmDnInfo=iDnmDnService.querydn(dnmDnInfo.getDuno_num());
        return "DnmDnmain";
    }

    @RequestMapping("/dnidfindexcel.do")  //按照id
    public void dnid_exceldownload(HttpServletResponse response,String site_id){

        OutputStream oStream = null;


        try {
//			创建工作簿
            HSSFWorkbook wb = new HSSFWorkbook();
//			创建sheet
            HSSFSheet sheet = wb.createSheet("列表");
//			创建表头
            HSSFRow row = sheet.createRow(0);
            //创建单元格
            HSSFCell cell = row.createCell(0);
            cell.setCellValue("记录编号");
            HSSFCell cell1 = row.createCell(1);
            cell1.setCellValue("采样点ID");
            HSSFCell cell2 = row.createCell(2);
            cell2.setCellValue("粉尘一号检测项");
            HSSFCell cell3 = row.createCell(3);
            cell3.setCellValue("粉尘二号检测项");
            HSSFCell cell4=row.createCell(4);
            cell4.setCellValue("粉尘三号检测项");
            HSSFCell cell5=row.createCell(5);
            cell5.setCellValue("粉尘平均值");
            HSSFCell cell6=row.createCell(6);
            cell6.setCellValue("噪声一号检测项");
            HSSFCell cell7=row.createCell(7);
            cell7.setCellValue("噪声二号检测项");
            HSSFCell cell8=row.createCell(8);
            cell8.setCellValue("噪声三号检测项");
            HSSFCell cell9=row.createCell(9);
            cell9.setCellValue("噪声平均值");
            HSSFCell cell10=row.createCell(10);
            cell10.setCellValue("隔音室");
            HSSFCell cell11=row.createCell(11);
            cell11.setCellValue("检测人");
            HSSFCell cell12=row.createCell(12);
            cell12.setCellValue("检测日期");

            List<DnmDnInfo> list= iDnmDnService.findidDnmDn(site_id);


            for (int i = 0; i < list.size(); i++) {
                DnmDnInfo dn=list.get(i);

                //创建表头
                HSSFRow lrow = sheet.createRow(i + 1);
                //创建单元格
                HSSFCell lcell = lrow.createCell(0);
                lcell.setCellValue(dn.getDuno_num());
                HSSFCell lcell1 = lrow.createCell(1);
                lcell1.setCellValue(dn.getSite_id());
                HSSFCell lcell2 = lrow.createCell(2);
                lcell2.setCellValue(dn.getDuno_dust1());
                HSSFCell lcell3 = lrow.createCell(3);
                lcell3.setCellValue(dn.getDuno_dust2());
                HSSFCell lcell4 = lrow.createCell(4);
                lcell4.setCellValue(dn.getDuno_dust3());
                HSSFCell lcell5 = lrow.createCell(5);
                lcell5.setCellValue(dn.getDuno_dusta());
                HSSFCell lcell6 = lrow.createCell(6);
                lcell6.setCellValue(dn.getDuno_noise1());
                HSSFCell lcell7 = lrow.createCell(7);
                lcell7.setCellValue(dn.getDuno_noise2());
                HSSFCell lcell8 = lrow.createCell(8);
                lcell8.setCellValue(dn.getDuno_noise3());
                HSSFCell lcell9 = lrow.createCell(9);
                lcell9.setCellValue(dn.getDuno_noisea());
                HSSFCell lcell10 = lrow.createCell(10);
                lcell10.setCellValue(dn.getDuno_room());
                HSSFCell lcell11 = lrow.createCell(11);
                lcell11.setCellValue(dn.getDuno_name());
                HSSFCell lcell12 = lrow.createCell(12);
                lcell12.setCellValue(dn.getDuno_date());
            }
            //根据response获取输出流
            response.setContentType("application/force-download"); // 设置下载类型
            response.setHeader("Content-Disposition", "attachment;filename=dnById.xls"); // 设置文件的名称
            oStream = response.getOutputStream(); // 输出流
            //把工作薄写入到输出流
            wb.write(oStream);

        } catch (Exception e) {
            // TODO: handle exception
            try {
                oStream.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }

    }


    @RequestMapping("/dndatefindexcel.do")  //按照时间
    public void dndate_exceldownload(HttpServletResponse responses,Date duno_date){

        OutputStream oStreams = null;


        try {
//			创建工作簿
            HSSFWorkbook wb = new HSSFWorkbook();
//			创建sheet
            HSSFSheet sheet = wb.createSheet("列表");
//			创建表头
            HSSFRow row = sheet.createRow(0);
            //创建单元格
            HSSFCell cell = row.createCell(0);
            cell.setCellValue("记录编号");
            HSSFCell cell1 = row.createCell(1);
            cell1.setCellValue("采样点ID");
            HSSFCell cell2 = row.createCell(2);
            cell2.setCellValue("粉尘一号检测项");
            HSSFCell cell3 = row.createCell(3);
            cell3.setCellValue("粉尘二号检测项");
            HSSFCell cell4=row.createCell(4);
            cell4.setCellValue("粉尘三号检测项");
            HSSFCell cell5=row.createCell(5);
            cell5.setCellValue("粉尘平均值");
            HSSFCell cell6=row.createCell(6);
            cell6.setCellValue("噪声一号检测项");
            HSSFCell cell7=row.createCell(7);
            cell7.setCellValue("噪声二号检测项");
            HSSFCell cell8=row.createCell(8);
            cell8.setCellValue("噪声三号检测项");
            HSSFCell cell9=row.createCell(9);
            cell9.setCellValue("噪声平均值");
            HSSFCell cell10=row.createCell(10);
            cell10.setCellValue("隔音室");
            HSSFCell cell11=row.createCell(11);
            cell11.setCellValue("检测人");
            HSSFCell cell12=row.createCell(12);
            cell12.setCellValue("检测日期");

            List<DnmDnInfo> list2= iDnmDnService.finddateDnmDn(duno_date);


            for (int i = 0; i < list2.size(); i++) {
                DnmDnInfo dn2=list2.get(i);

                //创建表头
                HSSFRow lrow = sheet.createRow(i + 1);
                //创建单元格
                HSSFCell lcell = lrow.createCell(0);
                lcell.setCellValue(dn2.getDuno_num());
                HSSFCell lcell1 = lrow.createCell(1);
                lcell1.setCellValue(dn2.getSite_id());
                HSSFCell lcell2 = lrow.createCell(2);
                lcell2.setCellValue(dn2.getDuno_dust1());
                HSSFCell lcell3 = lrow.createCell(3);
                lcell3.setCellValue(dn2.getDuno_dust2());
                HSSFCell lcell4 = lrow.createCell(4);
                lcell4.setCellValue(dn2.getDuno_dust3());
                HSSFCell lcell5 = lrow.createCell(5);
                lcell5.setCellValue(dn2.getDuno_dusta());
                HSSFCell lcell6 = lrow.createCell(6);
                lcell6.setCellValue(dn2.getDuno_noise1());
                HSSFCell lcell7 = lrow.createCell(7);
                lcell7.setCellValue(dn2.getDuno_noise2());
                HSSFCell lcell8 = lrow.createCell(8);
                lcell8.setCellValue(dn2.getDuno_noise3());
                HSSFCell lcell9 = lrow.createCell(9);
                lcell9.setCellValue(dn2.getDuno_noisea());
                HSSFCell lcell10 = lrow.createCell(10);
                lcell10.setCellValue(dn2.getDuno_room());
                HSSFCell lcell11 = lrow.createCell(11);
                lcell11.setCellValue(dn2.getDuno_name());
                HSSFCell lcell12 = lrow.createCell(12);
                lcell12.setCellValue(dn2.getDuno_date());
            }
            //根据response获取输出流
            responses.setContentType("application/force-download"); // 设置下载类型
            responses.setHeader("Content-Disposition", "attachment;filename=dnByDate.xls"); // 设置文件的名称
            oStreams = responses.getOutputStream(); // 输出流
            //把工作薄写入到输出流
            wb.write(oStreams);

        } catch (Exception e) {
            // TODO: handle exception
            try {
                oStreams.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }
    }




}
