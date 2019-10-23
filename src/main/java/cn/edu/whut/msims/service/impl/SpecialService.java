package cn.edu.whut.msims.service.impl;

import cn.edu.whut.msims.bean.SpecialInfo;
import cn.edu.whut.msims.dao.SpecialDao;
import cn.edu.whut.msims.service.ISpecialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.sql.Date;
import java.util.List;
@Service
public class SpecialService implements ISpecialService
{
    @Autowired
    SpecialDao specialDao;
    @Override
    public List<SpecialInfo> getSpeciaByEmp(String num)
    {
        System.out.println("ccccccccccc"+num);
        return specialDao.getSpeciaByEmp(num);
    }

    @Override
    public List<SpecialInfo> getExpirySpecial(Date date) {
        return specialDao.getExpirySpecial(date);
    }

    @Override
    public boolean addSpecial(SpecialInfo sp) {
        try {
            specialDao.addSpecial(sp);
            return true;
        }catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }

    }
}
