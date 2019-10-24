package cn.edu.whut.msims.dao;


import cn.edu.whut.msims.bean.EmeResInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface EmeResDao {
    @Select("SELECT * FROM tb_rescue where rescue_num = #{num}")
    public List<EmeResDao> findEmeResByNum(String rescue_num);
    @Insert("insert into tb_rescue(rescue_num,rescue_name,rescue_duty,rescue_tel,instit_num) values (#{rescue_num},{rescue_name},#{rescue_duty},#{rescue_tel},#{instit_num})")
    public void  addEmeRes(EmeResInfo EmeResInfo);
    @Delete("delete from tb_rescue where rescue_num = #{rescue_num}")
    public void  deleteEmeRes(EmeResInfo EmeResInfo);
    @Update("update tb_rescue set  rescue_num = #{rescue_num}  where rescue_duty = #{rescue_duty} and rescue_tel = #{rescue_tel} and instit_num = #{instit_num}")
    public void  updateEmeRes(EmeResInfo EmeResInfo);
}
