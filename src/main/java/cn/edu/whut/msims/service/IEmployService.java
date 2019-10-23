package cn.edu.whut.msims.service;

import cn.edu.whut.msims.bean.EmployInfo;

public interface IEmployService
{
    public EmployInfo getEmploy(String num);
    public boolean addEmploy(EmployInfo employInfo);
    public  boolean updateEmploy(EmployInfo employInfo);
}
