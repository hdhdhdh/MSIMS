package cn.edu.whut.msims.service.impl;

import cn.edu.whut.msims.bean.DnmDnInfo;
import cn.edu.whut.msims.dao.DnmDnDao;
import cn.edu.whut.msims.service.IDnmDnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class DnmDnService implements IDnmDnService {
@Autowired
    private DnmDnDao dnmDnDao;

    @Override
    public void addDnmDn(DnmDnInfo dnmDnInfo) {
       dnmDnDao.addDnmDn(dnmDnInfo);

    }

    @Override
    public void deleteDnmDn(Integer duno_num) {
       dnmDnDao.deleteDnmDn(duno_num);

    }

    @Override
    public void updateDnmDn(DnmDnInfo dnmDnInfo) {
      dnmDnDao.updateDnmDn(dnmDnInfo);

    }

    @Override
    public List<DnmDnInfo> dnfindbydateid(String site_id, Date duno_date) {
        return dnmDnDao.dnfindbydateid(site_id,duno_date);
    }

    @Override
    public List<DnmDnInfo> dnfindbydates(Date date1, Date date2) {
        return dnmDnDao.dnfindbydates(date1,date2);
    }

    @Override
    public List<DnmDnInfo> findidDnmDn(String site_id) {
        return dnmDnDao.findidDnmDn(site_id);
    }

    @Override
    public List<DnmDnInfo> finddateDnmDn(Date duno_date) {
        return dnmDnDao.finddateDnmDn(duno_date);
    }

    @Override
    public DnmDnInfo querydn(int duno_num) {
        return dnmDnDao.querydn(duno_num);
    }
}
