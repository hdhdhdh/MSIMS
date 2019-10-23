package cn.edu.whut.msims.dao;

import cn.edu.whut.msims.bean.EmployInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface EmployDao
{
    @Select("SELECT * FROM tb_employ where employ_num = #{num}")
    public  EmployInfo getEmployByNum(@Param("num") String num);

}
