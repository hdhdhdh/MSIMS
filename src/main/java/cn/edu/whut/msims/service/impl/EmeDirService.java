package cn.edu.whut.msims.service.impl;

import cn.edu.whut.msims.bean.EmeDirInfo;
import cn.edu.whut.msims.dao.EmeDirDao;
import cn.edu.whut.msims.service.IEmeDirService;

import java.util.List;

public class EmeDirService implements IEmeDirService {
    private EmeDirDao emeDirDao;
    @Override
    public List<EmeDirDao> findEmeDirByNum(String dirll_num) {
        return  emeDirDao.findEmeResByNum(dirll_num);
    }
    @Override
    public void  addEmeDir(EmeDirInfo EmeDirInfo){
        emeDirDao.addEmeDir(EmeDirInfo);
    }
    @Override
    public void  deleteEmeDir(EmeDirInfo EmeDirInfo){
        emeDirDao.deleteEmeDir(EmeDirInfo);
    }
    @Override
    public void  updateEmeDir(EmeDirInfo EmeDirInfo){
        emeDirDao.updateEmeDir(EmeDirInfo);
    }

}
