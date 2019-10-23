package cn.edu.whut.msims.service.impl;

import cn.edu.whut.msims.bean.EmePlanInfo;
import cn.edu.whut.msims.dao.EmePlanDao;
import cn.edu.whut.msims.service.IEmePlanService;

import java.util.List;

public class EmePlanService implements IEmePlanService {
    private EmePlanDao emePlanDao;
    @Override
    public List<EmePlanDao> findEmePlanByNum(String plan_num) {
        return  emePlanDao.findEmePlanByNum(plan_num);
    }

    @Override
    public void  addEmePlan(EmePlanInfo EmePlanInfo){
        emePlanDao.addEmePlan(EmePlanInfo);
    }
    @Override
    public void  deleteEmePlan(EmePlanInfo EmePlanInfo){
        emePlanDao.deleteEmePlan(EmePlanInfo);
    }
    @Override
    public void  updateEmePlan(EmePlanInfo EmePlanInfo){
        emePlanDao.updateEmePlan(EmePlanInfo);
    }

}
