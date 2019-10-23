package cn.edu.whut.msims.dao;

import cn.edu.whut.msims.bean.DnmMineInfo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.util.List;

@Component
@Mapper
public interface DnmMineDao {
    @Insert("insert into tb_mine(site_id,mine_speed,mine_area,mine_amount,mine_direct,mine_dust,mine_co,mine_temp,mine_name,mine_date)values(#{site_id},#{mine_speed},#{mine_area},#{mine_amount},#{mine_direct},#{mine_dust},#{mine_co},#{mine_temp},#{mine_name},#{mine_date})")
    public void addDnmMine(DnmMineInfo dnmMineInfo);

    @Delete("delete from tb_mine where mine_num = #{mine_num} ")
    public void deleteDnmMine(Integer mine_num);    //根据编号删除

    @Select("select * from tb_mine where mine_date = #{mine_date}")
    public List<DnmMineInfo> finddateDnmMine(Date mine_date); //根据时间查询所有的记录

    @Select("select * from tb_mine where site_id = #{site_id}")
    public List<DnmMineInfo> findidDnmMine(String site_id);  //根据采样点ID查询所有的记录

    @Select("select * from tb_mine where mine_num = #{mine_num}")
    public DnmMineInfo querymine(int mine_num);   //根据编号查找

    @Update("update tb_mine set site_id = #{site_id},mine_speed = #{mine_speed},mine_area = #{mine_area},mine_amount = #{mine_amount},mine_direct = #{mine_direct},mine_dust = #{mine_dust},mine_co = #{mine_co},mine_temp = #{mine_temp},mine_name = #{mine_name},mine_date = #{mine_date} where mine_num = #{mine_num}")
    public void updateDnmMine( DnmMineInfo dnmMineInfo);  //更新

    @Select("select * from tb_mine where site_id = #{site_id} and mine_date = #{mine_date}")   //根据时间id查询
    public  List<DnmMineInfo> minefindbydateid(String site_id,Date mine_date);

    @Select("select * from tb_mine where mine_time Between 'date1' and 'date2'")   //根据时间段查询
    public  List<DnmMineInfo> minefindbydates(Date date1, Date date2);


}
