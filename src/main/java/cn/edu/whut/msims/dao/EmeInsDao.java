package cn.edu.whut.msims.dao;

import cn.edu.whut.msims.bean.EmeInsInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface EmeInsDao {
    @Select("SELECT * FROM tb_instit")
    public List<EmeInsInfo> findAllIns();
    @Select("SELECT * FROM tb_instit where rescue_num = #{num}")
    public List<EmeInsDao> findEmeInsByNum(String rescue_num);
    @Insert("insert into tb_instit(instit_num,instit_name,instit_func,instit_tel,admin_id,instit_date) values (#{instit_num},{instit_name},#{instit_func},#{instit_tel},#{admin_id},#{instit_date})")
    public void  addEmeIns(EmeInsInfo EmeInsInfo);
    @Delete("delete from tb_instit where dirll_num = #{dirll_num}")
    public void  deleteEmeIns(EmeInsInfo EmeInsInfo);
    @Update("update tb_instit set  rescue_num = #{rescue_num}  where rescue_duty = #{rescue_duty} and rescue_tel = #{rescue_tel} and instit_num = #{instit_num}")
    public void  updateEmeIns(EmeInsInfo EmeInsInfo);
}
