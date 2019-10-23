package cn.edu.whut.msims.service;

import cn.edu.whut.msims.bean.EmeInsInfo;
import cn.edu.whut.msims.dao.EmeInsDao;

import java.util.List;

public interface IEmeInsService {
    public List<EmeInsDao> findEmeInsByNum(String instit_num);
    public void  addEmeIns(EmeInsInfo EmeInsInfo);
    public void  deleteEmeIns(EmeInsInfo EmeInsInfo);
    public void  updateEmeIns(EmeInsInfo EmeInsInfo);
   // public List<EmeInsInfo> findAllIns();
}
