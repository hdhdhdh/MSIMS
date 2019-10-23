package cn.edu.whut.msims.dao;

import cn.edu.whut.msims.bean.DnmSiteInfo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface DnmSiteDao {
    @Insert("insert into tb_site(site_id,site_place) values (#{site_id,},#{site_place})")
    public void addDnmSite(DnmSiteInfo dnmSiteInfo);

    @Delete("delete from tb_site where site_id = #{site_id}")
    public void deleteDnmSite(String site_id);

    @Select("select * from tb_site")
    public List<DnmSiteInfo> finddnmsiteall();

    @Select("select * from tb_site where site_place = #{site_place}")  //根据地点查询
    public DnmSiteInfo queryplace(String site_place);

    @Select("select * from tb_site where site_id = #{site_id}")
    public DnmSiteInfo querysite(String site_id);   //根据编号查找

    @Update("update tb_site set site_id = #{site_id},site_place = #{site_place}")
    public void updateDnmSite(DnmSiteInfo dnmSiteInfo);
}
