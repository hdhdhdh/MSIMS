package cn.edu.whut.msims.service;

import cn.edu.whut.msims.bean.EmeResouInfo;
import cn.edu.whut.msims.dao.EmeResouDao;

import java.util.List;

public interface IEmeResouService {
    public List<EmeResouDao> findEmeResouByNum(String resou_num);
    public void  addEmeResou(EmeResouInfo EmeResouInfo);
    public void  deleteEmeResou(EmeResouInfo EmeResouInfo);
    public void  updateEmeResou(EmeResouInfo EmeResouInfo);
}
