package cn.edu.whut.msims.service;

import cn.edu.whut.msims.bean.DnmSiteInfo;

import java.util.List;

public interface IDnmSiteService {

    public void addDnmSite(DnmSiteInfo dnmSiteInfo);
    public void deleteDnmSite(String site_id);
    public List<DnmSiteInfo> finddnmsiteall();
    public DnmSiteInfo querysite(String site_id);
    public void updateDnmSite(DnmSiteInfo dnmSiteInfo);

    public DnmSiteInfo queryplace(String site_place);

}
