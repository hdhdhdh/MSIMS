package cn.edu.whut.msims.dao;

import cn.edu.whut.msims.bean.LxmQuelInfo;

import java.util.List;

public interface ILxmQuelDao {
    public List<LxmQuelInfo> findExpiredQuel();//查找已经过期的证书
    public List<LxmQuelInfo> findExpiringQuel();//查找即将过期的证书
    public int addQuel(LxmQuelInfo lxmQuelInfo);//增加新的证书
    public int updateQuel(LxmQuelInfo lxmQuelInfo);//更改证书
    public LxmQuelInfo QueryByNum(String quel_num);//根据证书编号查找证书
    public int deleteQuelByNum(String quel_num);//根据证书编号删除证书
}
