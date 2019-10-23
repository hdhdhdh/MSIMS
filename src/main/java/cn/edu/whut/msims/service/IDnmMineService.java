package cn.edu.whut.msims.service;

import cn.edu.whut.msims.bean.DnmMineInfo;

import java.sql.Date;
import java.util.List;

public interface IDnmMineService {

    public void addDnmMine(DnmMineInfo dnmMineInfo);
    public void deleteDnmMine(Integer mine_num);

    public DnmMineInfo querymine(int mine_num);
    public void updateDnmMine(DnmMineInfo dnmMineInfo);

    public List<DnmMineInfo> finddateDnmMine(Date mine_date);
    public List<DnmMineInfo> findidDnmMine(String site_id);

    public  List<DnmMineInfo> minefindbydateid(String site_id, Date mine_date);
    public  List<DnmMineInfo> minefindbydates(Date date1, Date date2);
}
