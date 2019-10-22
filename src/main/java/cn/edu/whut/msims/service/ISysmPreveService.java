package cn.edu.whut.msims.service;

import cn.edu.whut.msims.bean.SysmPreveInfo;

import java.util.List;

public interface ISysmPreveService {
    public List<SysmPreveInfo> findAllPreve();//查询所有双重预防机制文件
    public SysmPreveInfo findPreveById(String preve_num);//通过发文字号查询双重预防机制文件
    public  boolean addPreve(SysmPreveInfo sysmPreveInfo);//增加双重预防机制文件
    public void delPreve(String preve_num);//删除双重预防机制文件
    public boolean updatePreve(SysmPreveInfo sysmPreveInfo);//更新双重预防机制文件
}
