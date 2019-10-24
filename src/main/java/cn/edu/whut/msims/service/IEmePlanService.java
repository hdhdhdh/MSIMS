package cn.edu.whut.msims.service;

import cn.edu.whut.msims.bean.EmePlanInfo;
import cn.edu.whut.msims.dao.EmePlanDao;

import java.util.List;

public interface IEmePlanService {
    public List<EmePlanDao> findEmePlanByNum(String plan_num);
    public void  addEmePlan(EmePlanInfo EmePlanInfo);
    public void  deleteEmePlan(EmePlanInfo EmePlanInfo);
    public void  updateEmePlan(EmePlanInfo EmePlanInfo);
}
