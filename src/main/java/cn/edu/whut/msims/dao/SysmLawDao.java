package cn.edu.whut.msims.dao;

import cn.edu.whut.msims.bean.SysmLawInfo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface SysmLawDao {

    @Select("SELECT * FROM tb_law")
    public List<SysmLawInfo> findAllLaw();//查询所有安全生产法律法规

    @Select("SELECT * FROM tb_law where law_num=#{law_num}")
    public SysmLawInfo findLawById(String law_num);//通过发文字号查询安全生产法律法规

    @Insert("INSERT INTO tb_law(law_num,law_class,law_name,law_sdate,law_edate,law_dep,law_checker,law_checktime,law_note,admin_id,law_date)values(#{law_num},#{law_class},#{law_name},#{law_sdate},#{law_edate},#{law_dep},#{law_checker},#{law_checktime},#{law_note},#{admin_id},#{law_date})")
    public int addLaw(SysmLawInfo sysmLawInfo);//增加安全生产法律法规

    @Delete("DELETE FROM tb_law WHERE law_num=#{law_num}")
    public void delLaw(String law_num);//删除安全生产法律法规

    @Update("UPDATE tb_law SET law_class=#{law_class},law_name=#{law_name},law_sdate=#{law_sdate},law_edate=#{law_edate},law_dep=#{law_dep},law_checker=#{law_checker},law_checktime=#{law_checktime},law_note=#{law_note},admin_id=#{admin_id},law_date=#{law_date} WHERE law_num=#{law_num}")
    public int updateLaw(SysmLawInfo sysmLawInfo);//更新安全生产法律法规
}
