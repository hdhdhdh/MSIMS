package cn.edu.whut.msims.service.impl;

import cn.edu.whut.msims.bean.LxmQualInfo;
import cn.edu.whut.msims.dao.ILxmQualDao;
import cn.edu.whut.msims.service.ILxmQualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LxmQualService implements ILxmQualService
{
    @Autowired
    ILxmQualDao lxmQualDao;

    @Override
    public List<LxmQualInfo> findExpiredQual() {
        return lxmQualDao.findExpiredQual();
    }

    @Override
    public List<LxmQualInfo> findExpiringQual() {
        return lxmQualDao.findExpiringQual();
    }

    @Override
    public int addQual(LxmQualInfo lxmQualInfo) {
        return lxmQualDao.addQual(lxmQualInfo);
    }

    @Override
    public int updateQual(LxmQualInfo lxmQualInfo) {
        return lxmQualDao.updateQual(lxmQualInfo);
    }

    @Override
    public List<LxmQualInfo> findAllQual() { return lxmQualDao.findAllQual(); }

    @Override
    public LxmQualInfo QueryByNum(String quel_num) {
        return lxmQualDao.QueryByNum(quel_num);
    }

    @Override
    public void deleteQualByNum(String qual_num) {
         lxmQualDao.deleteQualByNum(qual_num);
    }

}
