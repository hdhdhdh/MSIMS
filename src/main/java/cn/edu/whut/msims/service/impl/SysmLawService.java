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
        return this.sysmLawDao.findAllLaw();
    }
    @Override
    public SysmLawInfo findLawById(String law_num){
        return this.sysmLawDao.findLawById(law_num);
    }
    @Override
    public  boolean addLaw(SysmLawInfo sysmLawInfo){
        return this.sysmLawDao.addLaw(sysmLawInfo)>0 ? true:false;
    }
    @Override
    public void delLaw(String law_num){
        this.sysmLawDao.delLaw(law_num);
    }
    @Override
    public boolean updateLaw(SysmLawInfo sysmLawInfo){
        return this.sysmLawDao.updateLaw(sysmLawInfo)>0 ? true:false;
    }
}
