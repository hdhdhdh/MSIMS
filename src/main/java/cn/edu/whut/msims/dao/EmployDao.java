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
    @Insert("INSERT INTO tb_employ (employ_num,employ_name,employ_sex,employ_born,employ_ID,depart_num,employ_duty,employ_join,employ_passw) VALUES (${em.employ_num},${em.employ_name},${em.employ_sex},${em.employ_born},${em.employ_ID},${em.depart_num},${em.employ_duty},${em.employ_join},${em.employ_passw})")
    public void addEmploy(EmployInfo em);
    @Update("UPDATE tb_employ set employ_name = ${em.employ_name}, employ_sex= ${em.employ_sex}, employ_born= ${em.employ_born}, employ_ID= ${em.employ_ID}, depart_num= ${em.depart_num},employ_tel = ${em.employ_tel},employ_duty = ${em.employ_duty},employ_address = ${em.employ_address}, employ_exit= ${em.employ_exit}, employ_join= ${em.employ_join},employ_passw = ${em.employ_passw}")
    public void updateEmploy(EmployInfo em);
}
