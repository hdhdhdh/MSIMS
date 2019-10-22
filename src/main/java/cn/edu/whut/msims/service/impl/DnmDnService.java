package cn.edu.whut.msims.service.impl;

import cn.edu.whut.msims.bean.DnmDnInfo;
import cn.edu.whut.msims.dao.DnmDnDao;
import cn.edu.whut.msims.service.IDnmDnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public void deleteDnmDn(int duno_num) {
       dnmDnDao.deleteDnmDn(duno_num);

    }

    @Override
    public void updateDnmDn(DnmDnInfo dnmDnInfo,int duno_num) {
      dnmDnDao.updateDnmDn(dnmDnInfo,duno_num);

    }

    @Override
    public List<DnmDnDao> findidDnmDn(String site_id) {
        return dnmDnDao.findidDnmDn(site_id);
    }
}
