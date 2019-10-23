package cn.edu.whut.msims.service.impl;

import cn.edu.whut.msims.bean.DnmMineInfo;
import cn.edu.whut.msims.dao.DnmMineDao;
import cn.edu.whut.msims.service.IDnmMineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class DnmMineService implements IDnmMineService {

@Autowired
    private DnmMineDao dnmMineDao;

    @Override
    public void addDnmMine(DnmMineInfo dnmMineInfo) {
      dnmMineDao.addDnmMine(dnmMineInfo);

    }

    @Override
    public void deleteDnmMine(Integer mine_num) {
        dnmMineDao.deleteDnmMine(mine_num);

    }

    @Override
    public DnmMineInfo querymine(int mine_num) {
        return dnmMineDao.querymine(mine_num);
    }


    @Override
    public List<DnmMineInfo> finddateDnmMine(Date mine_date) {
        return dnmMineDao.finddateDnmMine(mine_date);
    }

    @Override
    public List<DnmMineInfo> findidDnmMine(String site_id) {
        return dnmMineDao.findidDnmMine(site_id);
    }

    @Override
    public List<DnmMineInfo> minefindbydateid(String site_id, Date mine_date) {
        return dnmMineDao.minefindbydateid(site_id,mine_date);
    }

    @Override
    public List<DnmMineInfo> minefindbydates(Date date1, Date date2) {
        return dnmMineDao.minefindbydates(date1,date2);
    }

    @Override
    public void updateDnmMine(DnmMineInfo dnmMineInfo) {

      dnmMineDao.updateDnmMine(dnmMineInfo);
    }
}
