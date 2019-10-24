package cn.edu.whut.msims.service.impl;

import cn.edu.whut.msims.bean.EmeResInfo;
import cn.edu.whut.msims.dao.EmeResDao;
import cn.edu.whut.msims.service.IEmeResService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmeResService implements IEmeResService {
    private EmeResDao emeResDao;
    @Override
    public List<EmeResDao> findEmeResByNum(String rescue_num) {
        return  emeResDao.findEmeResByNum(rescue_num);
    }

    @Override
    public void  addEmeRes(EmeResInfo EmeResInfo){
        emeResDao.addEmeRes(EmeResInfo);
    }
    @Override
    public void  deleteEmeRes(EmeResInfo EmeResInfo){
        emeResDao.deleteEmeRes(EmeResInfo);
    }
    @Override
    public void  updateEmeRes(EmeResInfo EmeResInfo){
        emeResDao.updateEmeRes(EmeResInfo);
    }

}
