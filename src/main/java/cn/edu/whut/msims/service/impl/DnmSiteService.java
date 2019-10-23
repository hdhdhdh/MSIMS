package cn.edu.whut.msims.service.impl;

import cn.edu.whut.msims.bean.DnmSiteInfo;
import cn.edu.whut.msims.dao.DnmSiteDao;
import cn.edu.whut.msims.service.IDnmSiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DnmSiteService implements IDnmSiteService {

@Autowired
    private DnmSiteDao dnmSiteDao;
    @Override
    public void addDnmSite(DnmSiteInfo dnmSiteInfo) {
        dnmSiteDao.addDnmSite(dnmSiteInfo);

    }

    @Override
    public void deleteDnmSite(String site_id) {
        dnmSiteDao.deleteDnmSite(site_id);

    }

    @Override
    public List<DnmSiteInfo> finddnmsiteall() {
        return dnmSiteDao.finddnmsiteall();
    }

    @Override
    public DnmSiteInfo querysite(String site_id) {
        return dnmSiteDao.querysite(site_id);
    }

    @Override
    public void updateDnmSite(DnmSiteInfo dnmSiteInfo) {
        dnmSiteDao.updateDnmSite(dnmSiteInfo);
    }

    @Override
    public DnmSiteInfo queryplace(String site_place) {
        return dnmSiteDao.queryplace(site_place);
    }


}
