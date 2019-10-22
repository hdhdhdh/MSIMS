package cn.edu.whut.msims.service;

import cn.edu.whut.msims.bean.DnmMineInfo;

public interface IDnmMineService {
    public void addDnmMine(DnmMineInfo dnmMineInfo);
    public void deleteDnmMine(int mine_num);
    public void updateDnmMine(DnmMineInfo dnmMineInfo);
}
