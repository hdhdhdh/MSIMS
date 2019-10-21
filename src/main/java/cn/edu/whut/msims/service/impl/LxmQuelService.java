package cn.edu.whut.msims.service.impl;

import cn.edu.whut.msims.bean.LxmQuelInfo;
import cn.edu.whut.msims.dao.ILxmQuelDao;
import cn.edu.whut.msims.service.ILxmQuelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LxmQuelService implements ILxmQuelService
{
    @Autowired
    ILxmQuelDao lxmQuelDao;

    @Override
    public List<LxmQuelInfo> findExpiredQuel() {
        return lxmQuelDao.findExpiredQuel();
    }

    @Override
    public List<LxmQuelInfo> findExpiringQuel() {
        return lxmQuelDao.findExpiringQuel();
    }

    @Override
    public int addQuel(LxmQuelInfo lxmQuelInfo) {
        return lxmQuelDao.addQuel(lxmQuelInfo);
    }

    @Override
    public int updateQuel(LxmQuelInfo lxmQuelInfo) {
        return lxmQuelDao.updateQuel(lxmQuelInfo);
    }

    @Override
    public LxmQuelInfo QueryByNum(String quel_num) {
        return lxmQuelDao.QueryByNum(quel_num);
    }

    @Override
    public int deleteQuelByNum(String quel_num) {
        return lxmQuelDao.deleteQuelByNum(quel_num);
    }

}
