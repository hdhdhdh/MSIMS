package cn.edu.whut.msims.service;

import cn.edu.whut.msims.bean.EmeDirInfo;

import java.util.List;

public interface IEmeDirService {
    public void  updateEmeDir(EmeDirInfo EmeDirInfo);
    public List<EmeDirInfo> findAllDir();
    public EmeDirInfo findDirById(String drill_num);
    public  void addEmeDir(EmeDirInfo emeDirInfo);
    public void delDir(String drill_num);
}
