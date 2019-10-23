package cn.edu.whut.msims.dao;

import cn.edu.whut.msims.bean.EmployInfo;
import cn.edu.whut.msims.bean.SpecialInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.util.List;

@Mapper
@Component
public interface SpecialDao
{
    @Select("SELECT * FROM tb_special where employ_num = #{num}")
    public List<SpecialInfo> getSpeciaByEmp(String num);
    @Select("SELECT * FROM tb_special where #{date,jdbcType=DATE} >= expiry_date ")
    public List<SpecialInfo> getExpirySpecial(Date date);
    @Insert("INSERT INTO tb_special (special_id,admin_id,special_expiry_date,special_first_date,special_project,special_class,employ_num) VALUES (${sp.special_id},${sp.admin_id},${sp.special_expiry_date},${sp.special_first_date},${sp.special_project},${sp.special_class},${sp.employ_num})")
    public void addSpecial(SpecialInfo sp);
    @Update("UPDATE tb_employ set admin_id = ${sp.admin_id}, special_expiry_date= ${sp.special_expiry_date}, special_first_date= ${sp.special_first_date}, special_project= ${sp.special_project}, special_class= ${sp.special_class},employ_num = ${sp.employ_num}")
    public void updateSpecial(SpecialInfo sp);
}
