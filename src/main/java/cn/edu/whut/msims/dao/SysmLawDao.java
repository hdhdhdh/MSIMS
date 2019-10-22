package cn.edu.whut.msims.dao;

import cn.edu.whut.msims.bean.SysmLawInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface SysmLawDao {
    public List<SysmLawInfo> findAllLaw();//查询所有安全生产法律法规
    public SysmLawInfo findLawById(String law_num);//通过发文字号查询安全生产法律法规
    public int addLaw(SysmLawInfo sysmLawInfo);//增加安全生产法律法规
    public void delLaw(String law_num);//删除安全生产法律法规
    public int updateLaw(SysmLawInfo sysmLawInfo);//更新安全生产法律法规
}
