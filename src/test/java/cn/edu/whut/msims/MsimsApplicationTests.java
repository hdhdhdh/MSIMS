package cn.edu.whut.msims;

import cn.edu.whut.msims.bean.EmployInfo;
import cn.edu.whut.msims.dao.EmployDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MsimsApplicationTests {


    @Autowired
    EmployDao employDao;
    @Test
    public void contextLoads()
    {

    }
    @Test
    public void otherTest() throws Exception
    {
        EmployInfo employInfo = new EmployInfo();

        System.out.println(employDao.getEmployByNum("00001"));
    }

}
