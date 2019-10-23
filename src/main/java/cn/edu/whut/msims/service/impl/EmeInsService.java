package cn.edu.whut.msims.service.impl;

import cn.edu.whut.msims.bean.EmeInsInfo;
import cn.edu.whut.msims.dao.EmeInsDao;
import cn.edu.whut.msims.service.IEmeInsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmeInsService implements IEmeInsService {

    private EmeInsDao emeInsDao;
    @Override
    public List<EmeInsDao> findEmeInsByNum(String instit_num) {
        return  emeInsDao.findEmeInsByNum(instit_num);
    }

    @Override
    public void  addEmeIns(EmeInsInfo EmeInsInfo){
        emeInsDao.addEmeIns(EmeInsInfo);
    }
    @Override
    public void  deleteEmeIns(EmeInsInfo EmeInsInfo){
        emeInsDao.deleteEmeIns(EmeInsInfo);
    }
    @Override
    public void  updateEmeIns(EmeInsInfo EmeInsInfo){
        emeInsDao.updateEmeIns(EmeInsInfo);
    }

    public List<EmeInsInfo> findAllIns(){
        return emeInsDao.findAllIns();
    }
}
