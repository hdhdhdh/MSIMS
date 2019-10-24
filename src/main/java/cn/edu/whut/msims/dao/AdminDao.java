package cn.edu.whut.msims.dao;

import cn.edu.whut.msims.bean.AdminInfo;
import cn.edu.whut.msims.bean.EmployInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface AdminDao
{
    @Select("SELECT * FROM tb_admin where admin_id = #{id}")
    public AdminInfo getAdminInfo(String id);
}
