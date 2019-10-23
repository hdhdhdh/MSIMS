package cn.edu.whut.msims.service;

import cn.edu.whut.msims.bean.SpecialInfo;

import java.sql.Date;
import java.util.List;

public interface ISpecialService
{
    public List<SpecialInfo> getSpeciaByEmp(String num);
    public List<SpecialInfo> getExpirySpecial(Date date);
    public boolean addSpecial(SpecialInfo sp);
}
