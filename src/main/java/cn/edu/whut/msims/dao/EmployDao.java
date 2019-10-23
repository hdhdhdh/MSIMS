package cn.edu.whut.msims.dao;

import cn.edu.whut.msims.bean.EmployInfo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface EmployDao
{
    @Select("SELECT * FROM tb_employ where employ_num = #{num}")
    public EmployInfo getEmployByNum( String num);
    @Insert("INSERT INTO tb_employ (employ_num,employ_name,employ_sex,employ_born,employ_ID,depart_num,employ_duty,employ_join,employ_passw) VALUES ('${employ_num}','${employ_name}','${employ_sex}','${employ_born}','${employ_ID}','${depart_num}','${employ_duty}','${employ_join}','${employ_passw}')")
    public void addEmploy(EmployInfo em);
    @Update("UPDATE tb_employ set employ_tel = '${employ_tel}',employ_duty = '${employ_duty}',employ_address = '${employ_address}',employ_passw = '${employ_passw}' WHERE employ_num = ${employ_num}")
    public void updateEmploy(EmployInfo em);
}
