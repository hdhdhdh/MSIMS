package cn.edu.whut.msims.service;

import cn.edu.whut.msims.bean.DnmDnInfo;

import java.sql.Date;
import java.util.List;


public interface IDnmDnService {

    public void addDnmDn(DnmDnInfo dnmDnInfo);
    public void deleteDnmDn(Integer duno_num);
    public List<DnmDnInfo> findidDnmDn(String site_id);
    public List<DnmDnInfo> finddateDnmDn(Date duno_date);

    public DnmDnInfo querydn(int duno_num);
    public void updateDnmDn(DnmDnInfo dnmDnInfo);
    public  List<DnmDnInfo> dnfindbydateid(String site_id,Date duno_date);
    public  List<DnmDnInfo> dnfindbydates(Date date1,Date date2);
    public List<DnmDnInfo> finall();
}
