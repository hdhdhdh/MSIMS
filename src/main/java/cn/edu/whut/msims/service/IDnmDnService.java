package cn.edu.whut.msims.service;

import cn.edu.whut.msims.bean.DnmDnInfo;
import cn.edu.whut.msims.dao.DnmDnDao;

import java.util.List;


public interface IDnmDnService {

    public void addDnmDn(DnmDnInfo dnmDnInfo);
    public void deleteDnmDn(int duno_num);
    public void updateDnmDn(DnmDnInfo dnmDnInfo,int duno_num);
    public List<DnmDnDao> findidDnmDn(String site_id);
}
