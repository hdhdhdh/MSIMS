package cn.edu.whut.msims.dao;

import cn.edu.whut.msims.bean.DnmDnInfo;

public interface DnmDnDao {     //接口  在UserMapper中实现接口
    public void addDnmDn(DnmDnInfo dnmDnInfo);
    public void deleteDnmDn(int duno_num);
    public void updateDnmDn(DnmDnInfo dnmDnInfo);
}
