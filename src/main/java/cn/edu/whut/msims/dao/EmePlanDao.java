package cn.edu.whut.msims.dao;

import cn.edu.whut.msims.bean.EmePlanInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface EmePlanDao {
    @Select("SELECT * FROM tb_plan where plan_num = #{plan_num}")
    public List<EmePlanDao> findEmePlanByNum(String plan_num);
    @Insert("insert into tb_plan(plan_num,plan_name,plan_time,plan_class,admin_id,plan_date,plan_path) values (#{plan_num},{plan_name},#{plan_time},#{plan_class},#{admin_id},#{plan_date},#{plan_path})")
    public void  addEmePlan(EmePlanInfo EmePlanInfo);
    @Delete("delete from tb_plan where plan_num = #{plan_num}")
    public void  deleteEmePlan(EmePlanInfo EmePlanInfo);
    @Update("update tb_plan set  plan_num = #{plan_num}  where plan_name = #{plan_name} and plan_time = #{plan_time}and plan_class = #{plan_class} and admin_id = #{admin_id}and plan_date = #{plan_date}and plan_path = #{plan_path}")
    public void  updateEmePlan(EmePlanInfo EmePlanInfo);
}
