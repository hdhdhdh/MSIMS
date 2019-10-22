package cn.edu.whut.msims.service.impl;

import cn.edu.whut.msims.bean.SysmPreveInfo;
import cn.edu.whut.msims.dao.SysmPreveDao;
import cn.edu.whut.msims.service.ISysmPreveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysmPreveService implements ISysmPreveService {
    @Autowired
    private SysmPreveDao sysmPreveDao;
    @Override
    public List<SysmPreveInfo> findAllPreve()//查询所有双重预防机制文件
    {
        return this.sysmPreveDao.findAllPreve();
    }
    @Override
    public SysmPreveInfo findPreveById(String preve_num)//通过发文字号查询双重预防机制文件
    {
        return this.sysmPreveDao.findPreveById(preve_num);
    }
    @Override
    public  boolean addPreve(SysmPreveInfo sysmPreveInfo)//增加双重预防机制文件
    {
        return this.sysmPreveDao.addPreve(sysmPreveInfo)>0 ? true:false;
    }
    @Override
    public void delPreve(String preve_num)//删除双重预防机制文件
    {
        this.sysmPreveDao.delPreve(preve_num);
    }
    @Override
    public boolean updatePreve(SysmPreveInfo sysmPreveInfo)//更新双重预防机制文件
    {
        return this.sysmPreveDao.updatePreve(sysmPreveInfo)>0 ? true:false;
    }
}
