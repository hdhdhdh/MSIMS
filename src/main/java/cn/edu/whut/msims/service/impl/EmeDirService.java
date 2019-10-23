package cn.edu.whut.msims.service.impl;

import cn.edu.whut.msims.bean.EmeDirInfo;
import cn.edu.whut.msims.dao.EmeDirDao;
import cn.edu.whut.msims.service.IEmeDirService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmeDirService implements IEmeDirService {
    @Autowired
    private EmeDirDao emeDirDao;
    @Override
    public void  updateEmeDir(EmeDirInfo EmeDirInfo){
        emeDirDao.updateEmeDir(EmeDirInfo);
    }
    @Override
    public List<EmeDirInfo> findAllDir(){
        return emeDirDao.findAllDir();
    }
    @Override
    public EmeDirInfo findDirById(String drill_num){
        return emeDirDao.findDirById(drill_num);
    }
    @Override
    public  void addEmeDir(EmeDirInfo emeDirInfo){
         emeDirDao.addEmeDir(emeDirInfo);
    }
    @Override
    public void delDir(String law_num){
        emeDirDao.deleteEmeDir(law_num);
    }

}


