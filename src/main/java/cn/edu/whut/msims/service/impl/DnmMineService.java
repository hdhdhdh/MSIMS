package cn.edu.whut.msims.service.impl;

import cn.edu.whut.msims.bean.DnmMineInfo;
import cn.edu.whut.msims.dao.DnmMineDao;
import cn.edu.whut.msims.service.IDnmMineService;
import org.springframework.beans.factory.annotation.Autowired;

public class DnmMineService implements IDnmMineService {
@Autowired

    private DnmMineDao dnmMineDao;

    @Override
    public void addDnmMine(DnmMineInfo dnmMineInfo) {
        dnmMineDao.addDnmMine(dnmMineInfo);

    }

    @Override
    public void deleteDnmMine(int mine_num) {
        dnmMineDao.deleteDnmMine(mine_num);

    }

    @Override
    public void updateDnmMine(DnmMineInfo dnmMineInfo) {

        dnmMineDao.updateDnmMine(dnmMineInfo);
    }
}
