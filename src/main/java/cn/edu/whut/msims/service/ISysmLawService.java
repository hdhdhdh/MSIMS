package cn.edu.whut.msims.service;

import cn.edu.whut.msims.bean.SysmLawInfo;


import java.util.List;

public interface ISysmLawService {
    public List<SysmLawInfo> findAllLaw();//查询所有安全生产法律法规
    public SysmLawInfo findLawById(String law_num);//通过发文字号查询安全生产法律法规
    public  boolean addLaw(SysmLawInfo sysmLawInfo);//增加安全生产法律法规
    public void delLaw(String law_num);//删除安全生产法律法规
    public boolean updateLaw(SysmLawInfo sysmLawInfo);//更新安全生产法律法规

}
