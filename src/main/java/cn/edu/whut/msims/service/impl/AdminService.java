package cn.edu.whut.msims.service.impl;

import cn.edu.whut.msims.bean.AdminInfo;
import cn.edu.whut.msims.dao.AdminDao;
import cn.edu.whut.msims.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService implements IAdminService {
    @Autowired
    AdminDao adminDao;
    @Override
    public AdminInfo getAdminByID(String Id) {
        return adminDao.getAdminInfo(Id);
    }
}
