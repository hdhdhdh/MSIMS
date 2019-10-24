package cn.edu.whut.msims.service.impl;

import cn.edu.whut.msims.bean.EmeResInfo;
import cn.edu.whut.msims.dao.EmeResDao;
import cn.edu.whut.msims.service.IEmeResService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmeResService implements IEmeResService {
    @Autowired
    EmeResDao emeResDao;

    @Override
    public List<EmeResInfo> findAllRes(){
        return emeResDao.findAllRes();
    }
    @Override
    public EmeResInfo findResById(String drill_num){
        return emeResDao.findResById(drill_num);
    }
    @Override
    public  void addEmeRes(EmeResInfo emeResInfo){
        emeResDao.addEmeRes(emeResInfo);
    }
    @Override
    public void delRes(String rescue_num){
        emeResDao.deleteEmeRes(rescue_num);
    }
    @Override
    public void  updateEmeRes(EmeResInfo EmeResInfo){emeResDao.updateEmeRes(EmeResInfo);}

}
