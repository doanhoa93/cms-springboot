package com.cms.base;

import com.cms.entity.system.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.TreeMap;

@RunWith(SpringJUnit4ClassRunner.class)  //使用junit4进行测试

//------------如果加入以下代码，所有继承该类的测试类都会遵循该配置，也可以不加，在测试类的方法上///控制事务，参见下一个实例

//这个非常关键，如果不加入这个注解配置，事务控制就会完全失效！  
//@Transactional

//这里的事务关联到配置文件中的事务控制器（transactionManager = "transactionManager"），同时//指定自动回滚（defaultRollback = true）。这样做操作的数据才不会污染数据库！
//@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)  


public class BaseJunit4Test {
    @Test
    public void testTreeMap() {
        TreeMap map = new TreeMap();
    }
    @Test
    public void testCastClass(){
        Object obj = new User();

    }

}  