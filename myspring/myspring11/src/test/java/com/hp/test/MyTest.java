package com.hp.test;

import com.hp.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:bean.xml")
public class MyTest {
    @Autowired
    private IAccountService as;

    @Test
    public  void testTransfer(){
        as.transfer("小红","小黄",100f);

    }
}
