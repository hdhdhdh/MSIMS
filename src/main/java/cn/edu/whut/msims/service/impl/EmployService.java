package cn.edu.whut.msims.service.impl;

import cn.edu.whut.msims.bean.EmployInfo;
import cn.edu.whut.msims.dao.EmployDao;
import cn.edu.whut.msims.service.IEmployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployService implements IEmployService {
    @Autowired
    EmployDao employDao;
    @Override
    public EmployInfo getEmploy(String num)
    {
        return employDao.getEmployByNum(num);
    }

    @Override
    public boolean addEmploy(EmployInfo employInfo)
    {
        try {
            employDao.addEmploy(employInfo);
            return true;
        }catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }

    }

    @Override
    public boolean updateEmploy(EmployInfo employInfo) {
        try {
            employDao.updateEmploy(employInfo);
            return true;

        }catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }
}
