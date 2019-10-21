package cn.edu.whut.msims.dao;


import org.springframework.stereotype.Component;

@Component
public interface DnmSiteDao {
    public void addDnmSite(DnmSiteDao dnmSiteDao);
    public void deleteDnmSite(int site_id);
    public void updateDnmSite(DnmSiteDao dnmSiteDao);
}
