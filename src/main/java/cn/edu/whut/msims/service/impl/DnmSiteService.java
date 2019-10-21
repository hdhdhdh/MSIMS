package cn.edu.whut.msims.service.impl;

import cn.edu.whut.msims.dao.DnmSiteDao;
import cn.edu.whut.msims.service.IDnmSiteService;
import org.springframework.beans.factory.annotation.Autowired;

public class DnmSiteService implements IDnmSiteService {

    @Autowired
    private DnmSiteDao dnmSiteDao;
    @Override
    public void addDnmSite(DnmSiteDao dnmSiteDao) {

    }

    @Override
    public void deleteDnmSite(int site_id) {

    }

    @Override
    public void updateDnmSite(DnmSiteDao dnmSiteDao) {

    }
}
