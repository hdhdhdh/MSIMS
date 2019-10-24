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
    public void addDnmDn(DnmDnInfo dnmDnInfo); //新增采样记录

    @Select("select * from tb_duno where duno_date = #{duno_date}")
    public List<DnmDnInfo> finddateDnmDn(Date duno_date); //根据时间查询所有的记录

    @Select("select * from tb_duno where site_id = #{site_id}")
    public List<DnmDnInfo> findidDnmDn(String site_id);  //根据采样点ID查询所有的记录

    @Delete("delete from tb_duno where duno_num = #{duno_num} ")
    public void deleteDnmDn( Integer duno_num);  //根据编号删除

    @Select("select * from tb_duno where duno_num = #{duno_num}")
    public DnmDnInfo querydn(int duno_num);   //根据编号查找  duno_num,site_id,duno_dust1,duno_dust2,duno_dust3,duno_noise1,duno_noise2,duno_noise3,duno_room,duno_name,duno_date

    @Update("update tb_duno set site_id = #{site_id},duno_dust1 = #{duno_dust1},duno_dust2 = #{duno_dust2},duno_dust3 = #{duno_dust3},duno_dusta = #{duno_dusta},duno_noise1 = #{duno_noise1},duno_noise2 = #{duno_noise2},duno_noise3 = #{duno_noise3},duno_noisea = #{duno_noisea},duno_room = #{duno_room},duno_name = #{duno_name},duno_date = #{duno_date} where duno_num = #{duno_num}")
    public void updateDnmDn( DnmDnInfo dnmDnInfo);  //更新

    @Select("select * from tb_duno where site_id = #{site_id} and duno_date = #{duno_date}")   //根据时间id查询
    public  List<DnmDnInfo> dnfindbydateid(String site_id,Date duno_date);

    @Select("select * from tb_duno where duno_date between #{date1} and #{date2} ")   //根据时间段查询
    public  List<DnmDnInfo> dnfindbydates(Date date1,Date date2);

    @Select("select * from tb_duno")
    public List<DnmDnInfo> finall();


}
