package cn.edu.whut.msims.dao;

import cn.edu.whut.msims.bean.DnmMineInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface DnmMineDao {
    public void addDnmMine(DnmMineInfo dnmMineInfo);
    public void deleteDnmMine(int mine_num);
    public void updateDnmMine(DnmMineInfo dnmMineInfo);
}
