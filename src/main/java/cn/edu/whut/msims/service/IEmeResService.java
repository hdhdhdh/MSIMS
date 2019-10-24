package cn.edu.whut.msims.service;

import cn.edu.whut.msims.bean.EmeResInfo;

import java.util.List;

public interface IEmeResService {
    public void  updateEmeRes(EmeResInfo EmeResInfo);
    public List<EmeResInfo> findAllRes();
    public EmeResInfo findResById(String drill_num);
    public  void addEmeRes(EmeResInfo emeResInfo);
    public void delRes(String rescue_num);
}
