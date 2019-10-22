package cn.edu.whut.msims.dao;

import cn.edu.whut.msims.bean.DnmDnInfo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.util.List;

@Component
@Mapper
public interface DnmDnDao {
    @Insert("insert into tb_duno(site_id,duno_dust1,duno_dust2,duno_dust3,duno_dusta,duno_noise1,duno_noise2,duno_noise3,duno_noisea,duno_room,duno_name,duno_date)values(#{site_id},#{duno_dust1},#{duno_dust2},#{duno_dust3},#{duno_dusta},#{duno_noise1},#{duno_noise2},#{duno_noise3},#{duno_noisea},#{duno_room},#{duno_name},#{duno_date})")
    public void addDnmDn(DnmDnInfo dnmDnInfo); //增加

    @Select("select * from tb_duno where duno_date = #{duno_date}")
    public List<DnmDnInfo> finddateDnmDn(Date duno_date); //根据时间查询所有的记录

    @Select("select * from tb_duno where site_id = #{site_id}")
    public List<DnmDnDao> findidDnmDn(String site_id);  //根据采样点ID查询所有的记录

    @Delete("delete from tb_duno where duno_num = #{duno_num}")
    public void deleteDnmDn( int duno_num);  //删除

    @Update("update tb_duno set site_id = #{site_id},site_id = #{site_id},duno_dust2 = #{duno_dust2},duno_dust3 = #{duno_dust3},duno_dusta = #{duno_dusta},duno_noise1 = #{duno_noise1},duno_noise2 = #{duno_noise2},duno_noise3 = #{duno_noise3},duno_noisea = #{duno_noisea},duno_room = #{duno_room},duno_name = #{duno_name},duno_date = #{duno_date} where duno_num = #{duno_num}")
    public void updateDnmDn( DnmDnInfo dnmDnInfo,int duno_num);  //更新


}
