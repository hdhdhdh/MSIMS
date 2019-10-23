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
    @Insert("INSERT INTO tb_special (special_id,admin_id,special_expiry_date,special_first_date,special_class,employ_num) VALUES ('${special_id}','${admin_id}','${special_expiry_date}','${special_first_date}','${special_class}',${employ_num})")
    public void addSpecial(SpecialInfo sp);
}
