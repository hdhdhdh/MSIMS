package cn.edu.whut.msims.dao;

import cn.edu.whut.msims.bean.EmeDirInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
//应急演练
public interface EmeDirDao {
    @Select("SELECT * FROM tb_drill where dirll_num = #{dirll_num}")
    public List<EmeDirDao> findEmeResByNum(String dirll_num);
    @Insert("insert into tb_drill(dirll_num,dirll_name,dirll_year,admin_id,admin_id,dirll_date,dirll_note,dirll_path) values (#{dirll_num},{dirll_name},#{dirll_year},#{employ_num},#{admin_id},#{dirll_date},#{dirll_note},#{dirll_path})")
    public void  addEmeDir(EmeDirInfo EmeDirInfo);
    @Delete("delete from tb_drill where drill_num = #{drill_num}")
    public void  deleteEmeDir(EmeDirInfo EmeDirInfo);
    @Update("update tb_drill set  drill_num = #{drill_num}  where dirll_name = #{dirll_name} and dirll_note = #{dirll_note} and employ_num = #{employ_num}")
    public void  updateEmeDir(EmeDirInfo EmeDirInfo);
}
