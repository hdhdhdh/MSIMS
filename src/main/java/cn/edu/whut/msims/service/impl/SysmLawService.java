package cn.edu.whut.msims.service.impl;

import cn.edu.whut.msims.bean.SysmLawInfo;
import cn.edu.whut.msims.dao.SysmLawDao;
import cn.edu.whut.msims.service.ISysmLawService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysmLawService implements ISysmLawService {
@Autowired
    private SysmLawDao sysmLawDao;
    @Override
    public List<SysmLawInfo> findAllLaw(){
        return sysmLawDao.findAllLaw();
    }
    @Override
    public SysmLawInfo findLawById(String law_num){
        return sysmLawDao.findLawById(law_num);
    }
    @Override
    public  boolean addLaw(SysmLawInfo sysmLawInfo){
        return sysmLawDao.addLaw(sysmLawInfo)>0 ? true:false;
    }
    @Override
    public void delLaw(String law_num){
        sysmLawDao.delLaw(law_num);
    }
    @Override
    public boolean updateLaw(SysmLawInfo sysmLawInfo){
        return sysmLawDao.updateLaw(sysmLawInfo)>0 ? true:false;
    }
}
