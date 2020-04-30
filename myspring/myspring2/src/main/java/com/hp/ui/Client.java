package com.hp.ui;

import com.hp.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");

        //2.根据id获取Bean对象
        IAccountService as  = (IAccountService)ac.getBean("accountService");
        as.saveAccount();

        IAccountService as1  = (IAccountService)ac.getBean("accountService2");
        as1.saveAccount();

        IAccountService as2  = (IAccountService)ac.getBean("accountService3");
        as2.saveAccount();
    }
}
