package cn.edu.whut.msims.service.impl;

import cn.edu.whut.msims.bean.EmeResouInfo;
import cn.edu.whut.msims.dao.EmeResouDao;
import cn.edu.whut.msims.service.IEmeResouService;

import java.util.List;

public class EmeResouService implements IEmeResouService {
    private EmeResouDao emeResouDao;
    @Override
    public List<EmeResouDao> findEmeResouByNum(String Resoucue_num) {
        return  emeResouDao.findEmeResouByNum(Resoucue_num);
    }

    @Override
    public void  addEmeResou(EmeResouInfo EmeResouInfo){
        emeResouDao.addEmeResou(EmeResouInfo);
    }
    @Override
    public void  deleteEmeResou(EmeResouInfo EmeResouInfo){
        emeResouDao.deleteEmeResou(EmeResouInfo);
    }
    @Override
    public void  updateEmeResou(EmeResouInfo EmeResouInfo){
        emeResouDao.updateEmeResou(EmeResouInfo);
    }

}
