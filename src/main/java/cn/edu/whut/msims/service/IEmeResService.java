package cn.edu.whut.msims.service;

import cn.edu.whut.msims.bean.EmeResInfo;
import cn.edu.whut.msims.dao.EmeResDao;

import java.util.List;

public interface IEmeResService {
    public List<EmeResDao> findEmeResByNum(String rescue_num);
    public void  addEmeRes(EmeResInfo EmeResInfo);
    public void  deleteEmeRes(EmeResInfo EmeResInfo);
    public void  updateEmeRes(EmeResInfo EmeResInfo);
}
