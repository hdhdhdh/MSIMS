package cn.edu.whut.msims.dao;

import cn.edu.whut.msims.bean.EmeDirInfo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

//应急演练
@Component
@Mapper
public interface EmeDirDao {
    @Select("SELECT * FROM tb_drill")
    public List<EmeDirInfo> findAllDir();
    @Select("SELECT * FROM tb_drill where drill_num = #{drill_num}")
    public EmeDirInfo findDirById(String dirll_num);
    @Insert("INSERT INTO tb_drill(dirll_num,dirll_name,dirll_year,employ_num,admin_id,dirll_date,dirll_note,dirll_path)values(#{dirll_num},#{dirll_name},#{dirll_year},#{employ_num},#{admin_id},#{dirll_date},#{dirll_note},#{dirll_path})")
    public void  addEmeDir(EmeDirInfo EmeDirInfo);
    @Delete("delete from tb_drill where dirll_num = #{dirll_num}")
    public void  deleteEmeDir(String dirll_num);
    @Update("update tb_drill set  drill_num = #{drill_num}  where dirll_name = #{dirll_name} and dirll_note = #{dirll_note} and employ_num = #{employ_num} and admin_id = #{admin_id} and employ_num = #{employ_num} and edirll_date = #{dirll_date} and dirll_note = #{dirll_note} and dirll_path = #{dirll_path}")
    public void  updateEmeDir(EmeDirInfo EmeDirInfo);
}