package cn.edu.whut.msims.service;

import cn.edu.whut.msims.bean.EmeDirInfo;
import cn.edu.whut.msims.dao.EmeDirDao;

import java.util.List;

public interface IEmeDirService {
    public List<EmeDirDao> findEmeDirByNum(String dirll_num);
    public void  addEmeDir(EmeDirInfo EmeDirInfo);
    public void  deleteEmeDir(EmeDirInfo EmeDirInfo);
    public void  updateEmeDir(EmeDirInfo EmeDirInfo);
}
