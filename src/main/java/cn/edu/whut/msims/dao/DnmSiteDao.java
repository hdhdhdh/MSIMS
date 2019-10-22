package cn.edu.whut.msims.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface DnmSiteDao {
    public void addDnmSite(DnmSiteDao dnmSiteDao);
    public void deleteDnmSite(int site_id);
    public void updateDnmSite(DnmSiteDao dnmSiteDao);
}
