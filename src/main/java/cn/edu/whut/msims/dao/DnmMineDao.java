package cn.edu.whut.msims.dao;

import cn.edu.whut.msims.bean.DnmMineInfo;


public interface DnmMineDao {
    public void addDnmMine(DnmMineInfo dnmMineInfo);
    public void deleteDnmMine(int mine_num);
    public void updateDnmMine(DnmMineInfo dnmMineInfo);
}
