package cn.edu.whut.msims.service.impl;

import cn.edu.whut.msims.bean.LxmQuelInfo;
import cn.edu.whut.msims.dao.ILxmQuelDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ILxmQuelService {

    private ILxmQuelDao lxmQuelDao;


    public List<LxmQuelInfo> findExpiredQuel(){
        return lxmQuelDao.findExpiredQuel();
    }
}
