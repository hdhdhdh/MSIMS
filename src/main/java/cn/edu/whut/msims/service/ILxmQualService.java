package cn.edu.whut.msims.service;

import cn.edu.whut.msims.bean.LxmQualInfo;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ILxmQualService {
    public List<LxmQualInfo> findExpiredQual();//查找已经过期的证书
    public List<LxmQualInfo> findExpiringQual();//查找即将过期的证书
    public int addQual(LxmQualInfo lxmQualInfo);//增加新的证书
    public int updateQual(LxmQualInfo lxmQualInfo);//更改证书
    public List<LxmQualInfo> findAllQual();//查找所有的证书
    public LxmQualInfo QueryByNum(String qual_num);//根据证书编号查找证书
    public void deleteQualByNum(String qual_num);//根据证书编号删除证书
}
