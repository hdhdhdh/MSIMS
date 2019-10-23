package cn.edu.whut.msims.controller;


import cn.edu.whut.msims.bean.DnmMineInfo;
import cn.edu.whut.msims.service.IDnmMineService;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.CellStyle;
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
public class DnmMineController {
    @Autowired
    private IDnmMineService iDnmMineService;

    @RequestMapping("/minemain.do")//跳转粉尘主界面
    public  String dnmmine_main(){
        return "DnmMinemain";
    }

    @RequestMapping("/tomineadd.do") //跳转新增记录界面
    public  String dnmmine_toadd(){
        return "DnmMineadd";
    }

    @RequestMapping("/tominefind.do") //跳转查询记录界面
    public  String dnmmine_tofind(){
        return "DnmMinefind";
    }

    @RequestMapping("/mineadd.do")   //新增采样记录
    public String dnmmine_add(DnmMineInfo dnmMineInfo){
        iDnmMineService.addDnmMine(dnmMineInfo);
        return ("DnmMinemain");
    }

    @RequestMapping("/mineidfind.do")       //通过采样点id查询所有的记录
    public ModelAndView dnmmine_idfind(String site_id){
        ModelAndView mv1=new ModelAndView();
        List<DnmMineInfo> mine1= iDnmMineService.findidDnmMine(site_id);
        mv1.addObject("dnmmineinfos",mine1);
        mv1.setViewName("DnmMinefind");
        return mv1;
    }

    @RequestMapping("/minedatefind.do")       //通过采样点时间查询所有的记录
    public ModelAndView dnmmine_datefind(Date mine_date){
        ModelAndView mv2=new ModelAndView();
        List<DnmMineInfo> mine2= iDnmMineService.finddateDnmMine(mine_date);
        mv2.addObject("dnmmineinfos",mine2);
        mv2.setViewName("DnmMinefind");
        return mv2;
    }

    @RequestMapping("/minedelete.do")     //删除记录
    public String dnmmine_delete(Integer mine_num){
        iDnmMineService.deleteDnmMine(mine_num);
        return "DnmMinefind";
    }

    @RequestMapping("/tomineupdate.do")     //跳转更新界面
    public ModelAndView dnmmine_toupdate(int mine_num){
        ModelAndView mv3=new ModelAndView();
        DnmMineInfo dm3;
        dm3=iDnmMineService.querymine(mine_num);
        mv3.addObject("dum",dm3);
        mv3.setViewName("DnmMineupdate");
        return mv3;
    }

    @RequestMapping("/mineupdate.do") //更新
    public String dnmmine_update(DnmMineInfo dnmMineInfo){

        iDnmMineService.updateDnmMine(dnmMineInfo);
//        dnmDnInfo=iDnmDnService.querydn(dnmDnInfo.getDuno_num());
        return "DnmMinemain";
    }

    @RequestMapping("/mineidfindexcel.do")          //按照id
    public void mineid_exceldownload(HttpServletResponse response, String site_id){

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
            cell2.setCellValue("实测风速");
            HSSFCell cell3 = row.createCell(3);
            cell3.setCellValue("面积");
            HSSFCell cell4=row.createCell(4);
            cell4.setCellValue("风量");
            HSSFCell cell5=row.createCell(5);
            cell5.setCellValue("风向");
            HSSFCell cell6=row.createCell(6);
            cell6.setCellValue("粉尘");
            HSSFCell cell7=row.createCell(7);
            cell7.setCellValue("一氧化碳");
            HSSFCell cell8=row.createCell(8);
            cell8.setCellValue("温度");
            HSSFCell cell9=row.createCell(9);
            cell9.setCellValue("检测人");
            HSSFCell cell10=row.createCell(10);
            cell10.setCellValue("检测日期");

            List<DnmMineInfo> list= iDnmMineService.findidDnmMine(site_id);


            for (int i = 0; i < list.size(); i++) {
                DnmMineInfo dm=list.get(i);

                //创建表头
                HSSFRow lrow = sheet.createRow(i + 1);
                //创建单元格
                HSSFCell lcell = lrow.createCell(0);
                lcell.setCellValue(dm.getMine_num());
                HSSFCell lcell1 = lrow.createCell(1);
                lcell1.setCellValue(dm.getSite_id());
                HSSFCell lcell2 = lrow.createCell(2);
                lcell2.setCellValue(dm.getMine_speed());
                HSSFCell lcell3 = lrow.createCell(3);
                lcell3.setCellValue(dm.getMine_area());
                HSSFCell lcell4 = lrow.createCell(4);
                lcell4.setCellValue(dm.getMine_amount());
                HSSFCell lcell5 = lrow.createCell(5);
                lcell5.setCellValue(dm.getMine_direct());
                HSSFCell lcell6 = lrow.createCell(6);
                lcell6.setCellValue(dm.getMine_dust());
                HSSFCell lcell7 = lrow.createCell(7);
                lcell7.setCellValue(dm.getMine_co());
                HSSFCell lcell8 = lrow.createCell(8);
                lcell8.setCellValue(dm.getMine_temp());
                HSSFCell lcell9 = lrow.createCell(9);
                lcell9.setCellValue(dm.getMine_name());
                HSSFCell lcell10 = lrow.createCell(10);
                lcell10.setCellValue(dm.getMine_date());
            }
            //根据response获取输出流
            response.setContentType("application/force-download"); // 设置下载类型
            response.setHeader("Content-Disposition", "attachment;filename=mineById.xls"); // 设置文件的名称
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

    @RequestMapping("/minedatefindexcel.do")          //按照日期
    public void minedate_exceldownload(HttpServletResponse response, Date mine_date){

        OutputStream oStream = null;


        try {
//			创建工作簿
            HSSFWorkbook wb = new HSSFWorkbook();
//			创建sheet
            HSSFSheet sheet = wb.createSheet("列表");
//			创建表头
            HSSFRow row = sheet.createRow(0);

            CellStyle style = wb.createCellStyle();
            style.setAlignment(HSSFCellStyle.ALIGN_CENTER);

            //创建单元格
            HSSFCell cell = row.createCell(0);
            cell.setCellValue("记录编号");
            HSSFCell cell1 = row.createCell(1);
            cell1.setCellValue("采样点ID");
            HSSFCell cell2 = row.createCell(2);
            cell2.setCellValue("实测风速");
            HSSFCell cell3 = row.createCell(3);
            cell3.setCellValue("面积");
            HSSFCell cell4=row.createCell(4);
            cell4.setCellValue("风量");
            HSSFCell cell5=row.createCell(5);
            cell5.setCellValue("风向");
            HSSFCell cell6=row.createCell(6);
            cell6.setCellValue("粉尘");
            HSSFCell cell7=row.createCell(7);
            cell7.setCellValue("一氧化碳");
            HSSFCell cell8=row.createCell(8);
            cell8.setCellValue("温度");
            HSSFCell cell9=row.createCell(9);
            cell9.setCellValue("检测人");
            HSSFCell cell10=row.createCell(10);
            cell10.setCellValue("检测日期");

            List<DnmMineInfo> list= iDnmMineService.finddateDnmMine(mine_date);


            for (int i = 0; i < list.size(); i++) {
                DnmMineInfo dm=list.get(i);

                //创建表头
                HSSFRow lrow = sheet.createRow(i + 1);
                //创建单元格
                HSSFCell lcell = lrow.createCell(0);
                lcell.setCellValue(dm.getMine_num());
                HSSFCell lcell1 = lrow.createCell(1);
                lcell1.setCellValue(dm.getSite_id());
                HSSFCell lcell2 = lrow.createCell(2);
                lcell2.setCellValue(dm.getMine_speed());
                HSSFCell lcell3 = lrow.createCell(3);
                lcell3.setCellValue(dm.getMine_area());
                HSSFCell lcell4 = lrow.createCell(4);
                lcell4.setCellValue(dm.getMine_amount());
                HSSFCell lcell5 = lrow.createCell(5);
                lcell5.setCellValue(dm.getMine_direct());
                HSSFCell lcell6 = lrow.createCell(6);
                lcell6.setCellValue(dm.getMine_dust());
                HSSFCell lcell7 = lrow.createCell(7);
                lcell7.setCellValue(dm.getMine_co());
                HSSFCell lcell8 = lrow.createCell(8);
                lcell8.setCellValue(dm.getMine_temp());
                HSSFCell lcell9 = lrow.createCell(9);
                lcell9.setCellValue(dm.getMine_name());
                HSSFCell lcell10 = lrow.createCell(10);
                lcell10.setCellValue(dm.getMine_date());
            }
            //根据response获取输出流
            response.setContentType("application/force-download"); // 设置下载类型
            response.setHeader("Content-Disposition", "attachment;filename=mineByDate.xls"); // 设置文件的名称
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


}
