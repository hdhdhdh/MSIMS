package cn.edu.whut.msims.dao;

import cn.edu.whut.msims.bean.LxmQualInfo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.util.List;
@Component
@Mapper
public interface ILxmQualDao {
    @Select("SELECT * FROM tb_qual where #{date,jdbcType=DATE} >= qual_edate ")
    public List<LxmQualInfo> findExpiredQual(Date date);//查找已经过期的证书

    public List<LxmQualInfo> findExpiringQual();//查找即将过期的证书

    @Insert("insert into tb_qual(qual_num,qual_class,qual_sdate,qual_edate,qual_office,qual_time,admin_id,qual_date)values(#{qual_num},#{qual_class},#{qual_sdate},#{qual_edate},#{qual_office},#{qual_time},#{admin_id},#{qual_date})")
    public int addQual(LxmQualInfo lxmQualInfo);//增加新的证书

    @Update("update tb_qual set qual_class=#{qual_class},qual_sdate=#{qual_sdate},qual_edate=#{qual_edate},qual_office=#{qual_office},qual_time=#{qual_time},admin_id=#{admin_id},qual_date=#{qual_date} where qual_num=#{qual_num}")
    public int updateQual(LxmQualInfo lxmQualInfo);//更改证书

    @Select("select * from tb_qual")
    public List<LxmQualInfo> findAllQual();//查找所有的证书

    @Select("select * from tb_qual where qual_num=#{qual_num}")
    public LxmQualInfo QueryByNum(String qual_num);//根据证书编号查找证书

    @Delete("delete from tb_qual where qual_num=#{qual_num}")
    public void deleteQualByNum(String qual_num);//根据证书编号删除证书
}
