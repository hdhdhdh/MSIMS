package cn.edu.whut.msims.dao;


import cn.edu.whut.msims.bean.EmeResInfo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
@Component
public interface EmeResDao {
    @Select("SELECT * FROM tb_rescue")
    public List<EmeResInfo> findAllRes();
    @Select("SELECT * FROM tb_rescue where rescue_num = #{rescue_num}")
    public EmeResInfo findResById(String rescue_num);
    @Insert("INSERT INTO tb_rescue(rescue_num,rescue_name,rescue_duty,rescue_tel,instit_num)values(#{rescue_num},#{rescue_name},#{rescue_duty},#{rescue_tel},#{instit_num})")
    public void  addEmeRes(EmeResInfo EmeResInfo);
    @Delete("delete from tb_rescue where rescue_num = #{rescue_num}")
    public void  deleteEmeRes(String rescue_num);
    @Update("update tb_rescue set  rescue_num = #{rescue_num}  where rescue_duty = #{rescue_duty} and rescue_tel = #{rescue_tel} and instit_num = #{instit_num}")
    public void  updateEmeRes(EmeResInfo EmeResInfo);
}
