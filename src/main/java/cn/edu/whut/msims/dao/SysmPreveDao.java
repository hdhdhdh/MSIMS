package cn.edu.whut.msims.dao;

import cn.edu.whut.msims.bean.SysmPreveInfo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface SysmPreveDao {

    @Select("SELECT * FROM tb_preve")
    public List<SysmPreveInfo> findAllPreve();//查询所有双重预防机制文件

    @Select("SELECT * FROM tb_preve where preve_num=#{preve_num}")
    public SysmPreveInfo findPreveById(String preve_num);//通过发文字号查询双重预防机制文件

    @Insert("INSERT INTO tb_preve(preve_num,preve_name,preve_sdate,preve_edate,preve_dep,preve_path,admin_id,preve_date) values(#{preve_num},#{preve_name},#{preve_sdate},#{preve_edate}，#{preve_dep}，#{preve_path}，#{admin_id}，#{preve_date})")
    public int addPreve(SysmPreveInfo sysmPreveInfo);//增加双重预防机制文件

    @Update("UPDATE tb_preve SET preve_name=#{preve_name},preve_sdate=#{preve_sdate},preve_edate=#{preve_edate},preve_dep=#{preve_dep},preve_path=#{preve_path},admin_id=#{admin_id},preve_date=#{preve_date} WHERE preve_num=#{preve_num}")
    public void delPreve(String preve_num);//删除双重预防机制文件

    @Delete("DELETE FROM tb_preve WHERE preve_num=#{preve_num}")
    public int updatePreve(SysmPreveInfo sysmPreveInfo);//更新双重预防机制文件
}
