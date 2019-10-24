package cn.edu.whut.msims.dao;

import cn.edu.whut.msims.bean.EmeResouInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface EmeResouDao {
    @Select("SELECT * FROM tb_resou where resou_num = #{num}")
    public List<EmeResouDao> findEmeResouByNum(String rescue_num);
    @Insert("insert into tb_resou(resou_num,resou_name,resou_amount,resou_date,resou_note，instit_num) values (#{resou_num},{resou_name},#{resou_amount},#{resou_date},#{resou_note},#{instit_num})")
    public void  addEmeResou(EmeResouInfo EmeResouInfo);
    @Delete("delete from tb_resou where resou_num = #{resou_num}")
    public void  deleteEmeResou(EmeResouInfo EmeResouInfo);
    @Update("update tb_resou set  resou_num = #{rescue_num}  where resou_name = #{resou_name} and resou_amount = #{resou_amount} and resou_date = #{resou_date} resou_note = #{resou_note} instit_num = #{instit_num}")
    public void  updateEmeResou(EmeResouInfo EmeResouInfo);
}
