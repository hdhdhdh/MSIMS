package cn.edu.whut.msims.service;

import cn.edu.whut.msims.dao.DnmSiteDao;

public interface IDnmSiteService {
    public void addDnmSite(DnmSiteDao dnmSiteDao);
    public void deleteDnmSite(int site_id);
    public void updateDnmSite(DnmSiteDao dnmSiteDao);
}
